package Visitor.VisitorComposite;

public interface Element {
    void accept(Visitor visitor);
    String operation();
}
