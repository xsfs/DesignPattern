package Command.Command;

public class ConcreteCommand2 implements Command {
    private Recevier2 recevier2=new Recevier2();
    @Override
    public void execute(){
        recevier2.action();
    }
}