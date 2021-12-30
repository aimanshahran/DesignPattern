package aifanshahran.lab3.abstractfactory;

public class PMWidgetFactory implements AbstractWidgetFactory{
    @Override
    public ScrollBar createScrollBar() {
            return new PMScrollBar();
    }

    @Override
    public Window createWindow() {
            return new PMWindow();
    }
}
