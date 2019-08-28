package Decorator.Decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        Conponent conponent=new ConcreteConponent();
        conponent.operation();
        Conponent conponent1=new ConcreteDecorator1(conponent);
        conponent.operation();
    }
}
