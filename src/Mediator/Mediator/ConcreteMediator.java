package Mediator.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator {
    private List<Colleague> list=new ArrayList<>();
    @Override
    public void register(Colleague colleague){
        list.add(colleague);
    }
    @Override
    public void relay(Colleague colleague){
        for(Colleague col:list){
            if(!col.equals(colleague)){
                col.receive();
            }
        }
        System.out.println("---------------");
    }
}
