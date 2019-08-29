package State.ExtandState;

import java.util.HashMap;

public class Context {
    private HashMap<String,State> map=new HashMap<>();
    private State state;
    public Context(){
        setState(new ConcreteState1());
        map.put("1",new ConcreteState1());
        map.put("2",new ConcreteState2());
    }
    public void setState(State state){
        this.state=state;
    }
    public State getState(String key){
        return map.get(key);
    }
    public void handle(){
        state.handle(this);
    }
}
