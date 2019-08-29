package Mediator.Mediator;

public class MediatorTest {
    public static void main(String[] args) {
        Colleague colleague1=new ConcreteColleague1();
        Colleague colleague2=new ConcreteColleague2();
        Mediator mediator=new ConcreteMediator();
        mediator.register(colleague1);
        mediator.register(colleague2);
        colleague1.setMediator(mediator);
        colleague2.setMediator(mediator);
        colleague1.send();
        colleague2.send();
    }
}
