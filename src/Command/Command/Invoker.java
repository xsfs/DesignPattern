package Command.Command;

public class Invoker {
    private Command command;
    public Invoker(Command command){
        setCommand(command);
    }
    public void setCommand(Command command){
        this.command=command;
    }
    public Command getCommand(){
        return command;
    }
    public void call(){
        command.execute();
    }
}
