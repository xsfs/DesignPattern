package State.State;

public class ConcreteState1 extends State {
    @Override
    public void handle(Context context){
        System.out.println("目前：状态1");
        context.setState(new ConcreteState2());
    }
}
