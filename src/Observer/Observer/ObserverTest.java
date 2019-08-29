package Observer.Observer;

public class ObserverTest {
    public static void main(String[] args) {
        Subject subject=new ConcreteSubject();
        subject.add(new ConcreteObserver1());
        subject.add(new ConcreteObserver2());
        subject.notifyObserver();
    }
}
