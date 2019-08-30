package Visitor.VisitorComposite;

public class ConcreteVisitor1 implements Visitor {
    @Override
    public void visit(LeafElement element1){
        System.out.println("具体访问者1访问元素1");
        System.out.println(element1.operation());
    }
    @Override
    public void visit(CompositeElement element2){
        System.out.println("具体访问者1访问元素2");
        System.out.println(element2.operation());
    }
}
