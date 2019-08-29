package Mediator.ExtandMediator;

public class SimpleMediatorTest {
    public static void main(String[] args) {
        SimpleMediator simpleMediator=SimpleMediator.getSimpleMediator();
        SimpleColleague colleague1=new SimpleConcreteColleague1();
        SimpleColleague colleague2=new SimpleConcreteColleague2();
        simpleMediator.register(colleague1);
        simpleMediator.register(colleague2);
        colleague1.send();
        colleague2.send();
    }
}
