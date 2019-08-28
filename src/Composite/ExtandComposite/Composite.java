package Composite.ExtandComposite;

import java.util.ArrayList;

public class Composite implements Component {
    private ArrayList<Component> list=new ArrayList<>();
    public Composite(){
    }
    public void add(Component component){
        list.add(component);
    }
    public void remove(Component component){
        list.remove(component);
    }
    public Component get(int key){
        return list.get(key);
    }
    @Override
    public void operation(){
        System.out.println("树枝操作");
        for (Component component:list){
            component.operation();
        }
    }
}
