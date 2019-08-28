package FlyWeight.PureFlyWeight;


public class ConcreteFlyweight1 implements Flyweight {
    private String key;
    public ConcreteFlyweight1(String key){
        this.key=key;
        System.out.println("享元"+key+"被创建");
    }
    @Override
    public void operation(){
        System.out.println("享元"+key+"被调用");
    }
}
