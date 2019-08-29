package Mediator.ExtandMediator;

public class SimpleConcreteColleague1 implements SimpleColleague {
    private SimpleMediator simpleMediator;
    SimpleConcreteColleague1(){
        simpleMediator=SimpleMediator.getSimpleMediator();
    }
    @Override
    public void receive(){
        System.out.println("具体同事类1收到");
    }
    @Override
    public void send(){
        System.out.println("具体同事类1发出");
        simpleMediator.relay(this);
    }
}
