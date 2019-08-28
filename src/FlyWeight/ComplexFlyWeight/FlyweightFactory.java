package FlyWeight.ComplexFlyWeight;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights=new HashMap<>();
    public FlyweightFactory(){
        flyweights.put("1",new ConcreteFlyweight("1"));
        flyweights.put("2",new ConcreteFlyweight("2"));
    }
    public Flyweight getFlyweight(String key){
        System.out.println("享元工厂调用");
        return flyweights.get(key);
    }
    public Flyweight getFlyweights(ArrayList<String> list){
        System.out.println("复合享元工厂调用");
        return new ComplexConcreteFlyweight(list);
    }
}
