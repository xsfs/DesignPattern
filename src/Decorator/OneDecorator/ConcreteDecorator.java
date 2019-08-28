package Decorator.OneDecorator;

public class ConcreteDecorator implements Component {
    private Component component=null;
    public ConcreteDecorator(Component component){
        this.component=component;
        addFuction();
    }
    @Override
    public void operation(){
        component.operation();
    }
    public void addFuction(){
        System.out.println("扩展操作！");
    }
}
