package Observer.ExtandObserver;

import java.util.Observable;

public class ConcreteSubject extends Observable {
    private String key;
    public String getKey(){
        return key;
    }
    public void setKey(String key){
        super.setChanged();
        super.notifyObservers(key);
        this.key=key;
    }
}
