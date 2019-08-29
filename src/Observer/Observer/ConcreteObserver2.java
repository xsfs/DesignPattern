package Observer.Observer;

public class ConcreteObserver2 implements Observer {
    @Override
    public void response(){
        System.out.println("观察者2收到！");
    }
}
