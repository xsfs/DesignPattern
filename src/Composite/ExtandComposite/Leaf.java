package Composite.ExtandComposite;

public class Leaf implements Component {
    private String name;
    Leaf(){}
    public Leaf(String name){
        this.name=name;
    }
    @Override
    public void operation(){
        System.out.println("叶子操作"+name);
    }

}
