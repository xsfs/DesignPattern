package Visitor.Visitor;

public class VisitorTest {
    public static void main(String[] args) {
        ObjectStructure structure=new ObjectStructure();
        structure.add(new ConcreteElement1());
        structure.add(new ConcreteElement2());
        structure.accept(new ConcreteVisitor1());
        System.out.println("-----------------");
        structure.accept(new ConcreteVisitor2());
    }
}
