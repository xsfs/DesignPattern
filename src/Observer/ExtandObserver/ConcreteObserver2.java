package Observer.ExtandObserver;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver2 implements Observer {
    @Override
    public void update(Observable o,Object arg){
        System.out.println("观察者2收到! "+arg);
    }
}
