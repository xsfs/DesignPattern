package Strategy.ExtendStrategy;

import java.util.HashMap;

public class Context {
    private HashMap<String,Strategy> map=new HashMap<>();
    public void setStrategy(String key,Strategy strategy){
        map.put(key,strategy);
    }
    public Strategy getStrategy(String key){
        return map.get(key);
    }
    public void strategyMethod(String key){
        map.get(key).strategyMethod();
    }
}
