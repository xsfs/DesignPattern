package FlyWeight.FlyWeight;

public class ConcreteFlyweight1 implements Flyweight {
    private String key;
    public ConcreteFlyweight1(String key){
        this.key=key;
        System.out.println("享元"+key+"被创建");
    }
    @Override
    public void operation(UnshareConcreteFlyweight flyweight){
        System.out.println("享元"+key+"被调用");
        System.out.println("非共享部分"+flyweight.getInfo());
    }
}
