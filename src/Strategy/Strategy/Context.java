package Strategy.Strategy;

public class Context {
    private Strategy strategy=null;
    public void setStrategy(Strategy strategy){
        this.strategy=strategy;
    }
    public Strategy getStrategy(){
        return strategy;
    }
    public void strategyMethod(){
        strategy.strategyMethod();
    }
}
