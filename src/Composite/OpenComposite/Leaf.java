package Composite.OpenComposite;

public class Leaf implements Component {
    private String name;
    public Leaf(String name){
        this.name=name;
    }
    @Override
    public void add(Component component){}
    @Override
    public void remove(Component component){}
    @Override
    public Component get(int key){
        return null;
    }
    @Override
    public void operation(){
        System.out.println("叶子操作"+name);
    }

}
