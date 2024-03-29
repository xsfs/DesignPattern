package Iterator.ExtandIterator;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> list=new ArrayList<>();
    public void add(Component component){
        list.add(component);
    }
    public void remove(Component component){
        list.remove(component);
    }
    public Component get(int i){
        if(list.size()>=(i+1)){
            return list.get(i);
        }
        return null;
    }
    @Override
    public void operation(){
        for (Component component:list){
            component.operation();
        }
    }
    public Iterator getIterator(){
        return new ConcreteIterator(list);
    }
}
