package Visitor.Visitor;

public class ConcreteVisitor2 implements Visitor {
    @Override
    public void visit(ConcreteElement1 element1){
        System.out.println("具体访问者2访问元素1");
        System.out.println(element1.operation());
    }
    @Override
    public void visit(ConcreteElement2 element2){
        System.out.println("具体访问者2访问元素2");
        System.out.println(element2.operation());
    }
}
