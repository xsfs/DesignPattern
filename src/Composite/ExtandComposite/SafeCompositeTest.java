package Composite.ExtandComposite;

public class SafeCompositeTest {
    public static void main(String[] args) {
        Composite composite=new Composite();
        //这里的初值不能放在Composite中会导致死循环
        composite.add(new Leaf("a"));
        composite.add(new SubLeaf1("b"));
        composite.add(new SubLeaf2("c"));
        composite.add(new SubComposite1("d"));
        composite.add(new SubComposite2("e"));
        composite.operation();
        Component component=new Leaf("abc");
        component.operation();
    }
}
