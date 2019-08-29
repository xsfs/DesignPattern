package State.ExtandState;

public class ConcreteState1 extends State {
    @Override
    public void handle(Context context){
        System.out.println("目前：状态1");
        context.setState(new ConcreteState2());
        ((ConcreteState2)context.getState("2")).action();
    }
    public void action(){
        System.out.println("调用状态1的方法");
        System.out.println("-------------");
    }
}
