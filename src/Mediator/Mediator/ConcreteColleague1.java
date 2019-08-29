package Mediator.Mediator;

public class ConcreteColleague1 extends Colleague {
    @Override
    public void receive(){
        System.out.println("具体同事类1收到");
    }
    @Override
    public void send(){
        System.out.println("具体同事类1发出");
        super.mediator.relay(this);
    }
}
