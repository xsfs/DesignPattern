package Iterator.ExtandIterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Iterator {
    private List<Component> list=new ArrayList<>();
    private int index;
    public ConcreteIterator(List<Component> list){
        this.list=list;
    }
    @Override
    public Component first(){
        if(list!=null){
            index=0;
            return list.get(index);
        }else{
            System.out.println("数组为空");
            return null;
        }
    }
    @Override
    public Component next(){
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
