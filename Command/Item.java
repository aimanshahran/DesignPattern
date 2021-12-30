package aifanshahran.lab6.command;

import java.util.HashMap;
import java.util.Map;

class Item {

  private String desc;
  private HashMap<Category, Item> categoriesList = new HashMap<>();

  public Item(String s) {
    desc = s;
  }

  public String getDesc() {
    return desc;
  }

  public void add(Category cat) {
    categoriesList.put(cat, this);
  }

  public void delete(Category cat) {
    categoriesList.remove(cat);
  }
  
  public void move(Category category, Category newCategory){
         delete(category);
         add(newCategory);
  }
  
  public void printDetails(){
      String message = "";
      for (Map.Entry<Category, Item> entry : categoriesList.entrySet()){
          if(entry.getValue().equals(this)){
              message += entry.getKey().desc + " ";
          }
      }
      System.out.println("Item '" + desc + "' belongs to these categories: [" + message + "]");
  } 
}
