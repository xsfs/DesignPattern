package Mediator.ExtandMediator;

public class SimpleConcreteColleague2 implements SimpleColleague {
    private SimpleMediator simpleMediator;
    SimpleConcreteColleague2(){
        simpleMediator=SimpleMediator.getSimpleMediator();
    }
    @Override
    public void receive(){
        System.out.println("具体同事类2收到");
    }
    @Override
    public void send(){
        System.out.println("具体同事类2发出");
        simpleMediator.relay(this);
    }
}