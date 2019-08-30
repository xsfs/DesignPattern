package Visitor.VisitorComposite;

public interface Visitor {
    void visit(LeafElement element1);
    void visit(CompositeElement element2);
}
