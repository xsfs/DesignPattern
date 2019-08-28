package Composite.ExtandComposite;

public class SubComposite1 extends Composite {
    private String name;
    public SubComposite1(String name){
        this.name=name;
    }
    @Override
    public void operation(){
        System.out.println("子树枝操作1"+name);
    }
}
