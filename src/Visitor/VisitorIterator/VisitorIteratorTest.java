package Visitor.VisitorIterator;

public class VisitorIteratorTest {
    public static void main(String[] args) {
        ObjectStructure structure=new ObjectStructure();
        structure.add(new ConcreteElement1());
        structure.add(new ConcreteElement2());
        structure.add(new ConcreteElement1());
        structure.add(new ConcreteElement2());
        Iterator iterator=structure.getIterator();
        System.out.println("使用迭代器遍历");
        iterator.first().accept(new ConcreteVisitor1());
        iterator.next().accept(new ConcreteVisitor1());
        iterator.next().accept(new ConcreteVisitor1());
        iterator.next().accept(new ConcreteVisitor1());
        iterator.next();
        System.out.println("-----------------");
        System.out.println("使用foreach遍历");
        structure.accept(new ConcreteVisitor2());
    }
}
