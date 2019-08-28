package FlyWeight.PureFlyWeight;

import FlyWeight.FlyWeight.UnshareConcreteFlyweight;

public class FlyweightTest {
    public static void main(String[] args) {
        FlyweightFactory factory=new FlyweightFactory();
        Flyweight flyweight=factory.getFlyweight("1");
        flyweight.operation();
    }
}
