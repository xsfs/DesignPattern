package State.State;

public class ConcreteState2 extends State {
    @Override
    public void handle(Context context){
        System.out.println("目前：状态2");
        context.setState(new ConcreteState1());
    }
}
