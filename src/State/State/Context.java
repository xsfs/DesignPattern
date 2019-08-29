package State.State;

public class Context {
    private State state;
    public Context(){
        setState(new ConcreteState1());
    }
    public void setState(State state){
        this.state=state;
    }
    public State getState(){
        return state;
    }
    public void handle(){
        state.handle(this);
    }
}
