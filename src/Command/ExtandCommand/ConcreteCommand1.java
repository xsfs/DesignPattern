package Command.ExtandCommand;

import Command.Command.Recevier1;

public class ConcreteCommand1 implements AbstractCommand{
    private CompositeReceiver receiver=new CompositeReceiver();
    @Override
    public void execute(){
        receiver.action1();
    }
}
