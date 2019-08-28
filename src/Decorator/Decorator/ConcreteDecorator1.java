package Decorator.Decorator;


public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Conponent conponent){
        super(conponent);
        addFuction();
    }
    @Override
    public void operation(){
        super.operation();
    }
    private void addFuction(){
        System.out.println("扩展操作1");
    }
}
