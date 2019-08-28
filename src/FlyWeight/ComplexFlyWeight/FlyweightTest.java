package FlyWeight.ComplexFlyWeight;

import java.util.ArrayList;

public class FlyweightTest {
    public static void main(String[] args) {
        FlyweightFactory factory=new FlyweightFactory();
        Flyweight flyweight=factory.getFlyweight("2");
        flyweight.operation(new UnshareConcreteFlyweight());
        ArrayList<String> list= new ArrayList<>();
        list.add("12");
        list.add("13");
        list.add("14");
        Flyweight flyweights=factory.getFlyweights(list);
        flyweights.operation(new UnshareConcreteFlyweight());
    }
}
