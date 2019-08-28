package Composite.ExtandComposite;

public class SubComposite2 extends Composite {
    private String name;
    public SubComposite2(String name){
        this.name=name;
    }
    @Override
    public void operation(){
        System.out.println("子树枝操作2"+name);
    }
}
