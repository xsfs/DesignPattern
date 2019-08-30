package Visitor.VisitorIterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Iterator {
    private List<Element> list=new ArrayList<>();
    int index;
    public ConcreteIterator(List<Element> list){
        this.list=list;
    }
    @Override
    public Element first(){
        index=0;
        return list.get(index);
    }
    @Override
    public Element next(){
        if(this.hasNext()){
            index++;
            return list.get(index);
        }
        System.out.println("无下一个");
        return null;
    }
    @Override
    public boolean hasNext(){
        if(list.size()>index+1){
            return true;
        }else{
            return false;
        }
    }
}
