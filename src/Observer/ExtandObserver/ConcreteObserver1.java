package Observer.ExtandObserver;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver1 implements Observer {
    @Override
    public void update(Observable o, Object arg){
        System.out.println("观察者1收到! "+arg);
    }
}