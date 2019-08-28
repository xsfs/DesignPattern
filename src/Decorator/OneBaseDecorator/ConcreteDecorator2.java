package Decorator.OneBaseDecorator;

public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(ConcreteCompenont compenont){
        super(compenont);
        addFuction();
    }
    @Override
    public void operation(){
        super.operation();
    }
    public void addFuction(){
        System.out.println("扩展操作2");
    }
}
