package Visitor.Visitor;

public class ConcreteElement2 implements Element {
    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
    public String operation(){
        return "具体元素2操作";
    }
}
