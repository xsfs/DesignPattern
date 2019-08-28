package Decorator.OneBaseDecorator;

public class OneBaseDecoratorTest {

    public static void main(String[] args) {
        ConcreteCompenont compenont=new ConcreteCompenont();
        compenont.operation();
        compenont=new ConcreteDecorator1(compenont);
        compenont.operation();
    }
}
