package Composite.SafeComposite;

import java.util.ArrayList;

public class Composite implements Component {
    private ArrayList<Component> list=new ArrayList<>();
    public Composite(){
        add(new Leaf("a"));
        add(new Leaf("b"));
        add(new Leaf("c"));
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
