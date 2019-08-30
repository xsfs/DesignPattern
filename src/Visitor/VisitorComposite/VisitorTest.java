package Visitor.VisitorComposite;

public class VisitorTest {
    public static void main(String[] args) {
        ObjectStructure structure=new ObjectStructure();
        structure.add(new LeafElement());
        structure.add(new CompositeElement());
        structure.accept(new ConcreteVisitor1());
        System.out.println("-----------------");
        structure.accept(new ConcreteVisitor2());
    }
}
