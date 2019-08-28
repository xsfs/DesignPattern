package Decorator.OneDecorator;

public class ConcreteComponent implements Component {
    @Override
    public void operation(){
        System.out.println("基础操作！");
    }
}
