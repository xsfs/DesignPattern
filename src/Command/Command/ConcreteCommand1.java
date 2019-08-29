package Command.Command;

public class ConcreteCommand1 implements Command {
    private Recevier1 recevier1=new Recevier1();
    @Override
    public void execute(){
        recevier1.action();
    }
}
