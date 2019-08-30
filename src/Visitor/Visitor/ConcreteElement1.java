package Visitor.Visitor;

public class ConcreteElement1 implements Element {
    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
    public String operation(){
        return "具体元素1操作";
    }
}
