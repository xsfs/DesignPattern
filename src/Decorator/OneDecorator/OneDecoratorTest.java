package Decorator.OneDecorator;

public class OneDecoratorTest {
    public static void main(String[] args) {
        Component component=new ConcreteComponent();
        component.operation();
        component=new ConcreteDecorator(component);
        component.operation();
    }
}
