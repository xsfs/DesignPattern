package Observer.ExtandObserver;

import java.util.Observable;

public class ExtandObserverTest {
    public static void main(String[] args) {
        ConcreteSubject observable=new ConcreteSubject();
        observable.addObserver(new ConcreteObserver1());
        observable.addObserver(new ConcreteObserver2());
        observable.setKey("3");
    }
}
