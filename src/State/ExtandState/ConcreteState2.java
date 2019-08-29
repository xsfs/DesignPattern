package State.ExtandState;

public class ConcreteState2 extends State {
    @Override
    public void handle(Context context){
        System.out.println("目前：状态2");
        context.setState(new ConcreteState1());
        ((ConcreteState1)context.getState("1")).action();
    }
    public void action(){
        System.out.println("调用状态2的方法");
        System.out.println("-------------");
    }
}
