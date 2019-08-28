package Decorator.OneBaseDecorator;

public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(ConcreteCompenont compenont){
        super(compenont);
        addFuction();
    }
    @Override
    public void operation(){
        super.operation();
    }
    public void addFuction(){
        System.out.println("扩展操作1");
    }
}
