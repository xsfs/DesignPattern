package FlyWeight.ComplexFlyWeight;

import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ComplexConcreteFlyweight implements Flyweight {
    private Map<Object, ConcreteFlyweight> map=new HashMap<>();
    public ComplexConcreteFlyweight(ArrayList<String> list){
        map=list.stream().collect(Collectors.toMap(a->a,ConcreteFlyweight::new,(k1,k2)->k1));
    }
    public void add(String key,ConcreteFlyweight flyweight){
        map.put(key,flyweight);
    }
    public void remove(String key){
        map.remove(key);
    }
    @Override
    public void operation(UnshareConcreteFlyweight unflyweight){
        for(ConcreteFlyweight flyweight : map.values()){
            flyweight.operation(unflyweight);
        }
    }

}
