package Command.ExtandCommand;

import java.util.ArrayList;

public class CompositeInvoker implements AbstractCommand {
    private ArrayList<AbstractCommand> list=new ArrayList<>();
    public void add(AbstractCommand command){
        list.add(command);
    }
    public void remove(AbstractCommand command){
        list.remove(command);
    }
    @Override
    public void execute(){
        for (AbstractCommand command:list){
            command.execute();
        }
    }
}
