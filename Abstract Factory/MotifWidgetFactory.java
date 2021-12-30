package aifanshahran.lab3.abstractfactory;

public class MotifWidgetFactory implements AbstractWidgetFactory {
        @Override
	public ScrollBar createScrollBar() {
		return new MotifScrollBar();
	}

        @Override
	public Window createWindow() {
		return new MotifWindow();
	}
}
