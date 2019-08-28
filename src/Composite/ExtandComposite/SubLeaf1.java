package Composite.ExtandComposite;

public class SubLeaf1 extends Leaf{
    private String name;
    public SubLeaf1(String name){
        this.name=name;
    }
    @Override
    public void operation(){
        System.out.println("子叶子操作1"+name);
    }
}
