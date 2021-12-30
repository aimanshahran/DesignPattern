package aifanshahran.lab7.templatemethod;

import java.util.*;

public abstract class CreditCard {
    protected String cardNum;
    protected int expMM, expYY;
    public CreditCard(String num, int expMonth, int expYear) {
        cardNum = num; 
        expMM = expMonth; 
        expYY = expYear;
    }
    public boolean isExpDtValid() {
        Calendar cal = Calendar.getInstance(); 
        cal.setTime(new Date());
        int mm = cal.get(Calendar.MONTH) + 1; 
        int yy = cal.get(Calendar.YEAR); 
        
        boolean result = (yy > expYY) || ((yy == expYY) && (mm > expMM)); 
        //System.out.print(result);
        return (!result);
    }
    private boolean hasValidChars() {
        String validChars = "0123456789";
        boolean result = true;
        for (int i = 0; i < cardNum.length(); i++) {
            if (validChars.indexOf(cardNum.substring(i, i + 1)) < 0) {
            result = false;
            break; 
            }
        }
        return result; 
    }
    private boolean isValidCheckSum() { 
        boolean result = true;
        
        int sum = 0;
        int multiplier = 1;
        int strLen = cardNum.length();
        
        for (int i = 0; i < strLen; i++) {
            String digit = cardNum.substring(strLen - i - 1, strLen - i);
            int currProduct = new Integer(digit).intValue() * multiplier;
            if (currProduct >= 10)
                sum += (currProduct% 10) + 1;
            else
                sum += currProduct;
            if (multiplier == 1) 
                multiplier++;
            else
                multiplier--;
        }
        if ((sum % 10) != 0)
            result = false; 
        return result;
        }
    /* methods to be overridden by sub-classes. */ 
    public abstract boolean isNumOfDigitsValid(); 
    public abstract boolean isValidPrefix(); 
    public abstract boolean isAccountInGoodStand(); 
    
    /****TEMPLATE METHOD****/
    
    public final boolean isValid() { 
        boolean temp = true;
        
        if (!isExpDtValid()) {
            System.out.println(" Invalid Expired Date ");
            temp = false;
        //return false; 
        }
        if (!isNumOfDigitsValid()) {
            System.out.println(" Invalid Number of Digits "); 
            temp = false;
        //return false; 
        }
        if (!isValidPrefix()) {
            System.out.println(" Invalid Prefix ");
            temp = false;
        //return false; 
        }
        if (!hasValidChars()) {
            System.out.println(" Invalid Characters "); 
            temp = false;
        //return false; 
        }
        if (!isValidCheckSum()) {
            System.out.println(" Invalid Check Sum ");
            temp = false;
        //return false; 
        }
        if (!isAccountInGoodStand()) { 
            System.out.println("Account is Inactive/Revoked/Over the Limit "); 
            temp = false;
        //return false; 
        }
    return temp; 
    }
}
