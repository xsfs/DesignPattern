package Observer.Observer;

public class ConcreteObserver1 implements Observer {
    @Override
    public void response(){
        System.out.println("观察者1收到！");
    }
}
