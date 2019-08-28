package Composite.ExtandComposite;

public class SubLeaf2 extends Leaf{
    private String name;
    public SubLeaf2(String name){
        this.name=name;
    }
    @Override
    public void operation(){
        System.out.println("子叶子操作2"+name);
    }
}