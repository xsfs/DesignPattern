package FlyWeight.FlyWeight;

public class FlyweightTest {
    public static void main(String[] args) {
        FlyweightFactory factory=new FlyweightFactory();
        Flyweight flyweight=factory.getFlyweight("2");
        flyweight.operation(new UnshareConcreteFlyweight());
    }
}
