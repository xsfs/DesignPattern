package FlyWeight.FlyWeight;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String,Flyweight> flyweights=new HashMap<>();
    public FlyweightFactory(){
        flyweights.put("1",new ConcreteFlyweight1("1"));
        flyweights.put("2",new ConcreteFlyweight2("2"));
    }
    public Flyweight getFlyweight(String key){
        System.out.println("享元工厂调用");
        return flyweights.get(key);
    }
}
