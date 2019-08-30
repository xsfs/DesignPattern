package Visitor.VisitorComposite;


public class LeafElement implements Element {
    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
    @Override
    public String operation(){
        return "   叶子操作";
    }
}
