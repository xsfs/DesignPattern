package Visitor.VisitorComposite;

import java.util.ArrayList;
import java.util.List;

public class CompositeElement implements Element {
    private List<Element> list =new ArrayList<>();
    public CompositeElement(){
        list.add(new LeafElement());
        list.add(new LeafElement());
        list.add(new LeafElement());
    }
    @Override
    public void accept(Visitor visitor){
       visitor.visit(this);
    }
    @Override
    public String operation(){
        String str = "具体容器元素操作";
        for(Element element:list){
           str+=element.operation();
        }
        return str;
    }
    public void add(Element element){
        list.add(element);
    }
    public void remove(Element element){
        list.remove(element);
    }
    public Element get(int index){
        return list.get(index);
    }
}
