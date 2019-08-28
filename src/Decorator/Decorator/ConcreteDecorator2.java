package Decorator.Decorator;


public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Conponent conponent){
        super(conponent);
        addFuction();
    }
    @Override
    public void operation(){
        super.operation();
    }
    private void addFuction(){
        System.out.println("扩展操作2");
    }
}
