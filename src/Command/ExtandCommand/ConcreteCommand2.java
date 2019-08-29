package Command.ExtandCommand;


public class ConcreteCommand2 implements AbstractCommand {
    private CompositeReceiver receiver=new CompositeReceiver();
    @Override
    public void execute(){
        receiver.action2();
    }
}