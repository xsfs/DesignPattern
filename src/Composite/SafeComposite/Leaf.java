package Composite.SafeComposite;

import Composite.OpenComposite.Composite;

public class Leaf implements Component {
    private String name;
    public Leaf(String name){
        this.name=name;
    }
    @Override
    public void operation(){
        System.out.println("叶子操作"+name);
    }

}
