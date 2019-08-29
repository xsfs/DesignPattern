package Mediator.ExtandMediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleMediator {
    private static SimpleMediator simpleMediator=new SimpleMediator();
    List<SimpleColleague> list=new ArrayList<>();
    private SimpleMediator(){}

    public static SimpleMediator getSimpleMediator(){
        return simpleMediator;
    }
    public void register(SimpleColleague colleague){
        list.add(colleague);
    }
    public void relay(SimpleColleague colleague){
        for (SimpleColleague col:list){
            if (!col.equals(colleague)){
                col.receive();
            }
        }
        System.out.println("----------------");
    }
}
