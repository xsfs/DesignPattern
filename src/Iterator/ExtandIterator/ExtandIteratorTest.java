package Iterator.ExtandIterator;

public class ExtandIteratorTest {
    public static void main(String[] args) {
        Composite composite=new Composite();
        Component leaf1=new Leaf();
        Component leaf2=new Leaf();
        Component leaf3=new Leaf();
        Component leaf4=new Leaf();
        composite.add(leaf1);
        composite.add(leaf2);
        composite.add(leaf3);
        composite.add(leaf4);
        Iterator iterator=composite.getIterator();
        iterator.first().operation();
        System.out.println("--------------");
        iterator.next().operation();
        System.out.println("--------------");
        iterator.next().operation();
        System.out.println("--------------");
        iterator.next().operation();
        System.out.println("--------------");
        iterator.next().operation();//出错无leaf无法调用operation
        System.out.println("--------------");
    }
}
