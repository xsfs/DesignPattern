package Iterator.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Aggregate aggregate=new ConcreteAggregate();
        aggregate.add("1");
        aggregate.add("2");
        aggregate.add("3");
        Iterator iterator=aggregate.getIterator();
        System.out.println(iterator.first());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}
