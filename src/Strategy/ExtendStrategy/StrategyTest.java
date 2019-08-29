package Strategy.ExtendStrategy;

import Strategy.Strategy.Strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Context context=new Context();
        context.setStrategy("1",new ConcreteStrategy1());
        context.setStrategy("2",new ConcreteStrategy2());
        context.strategyMethod("1");
        context.strategyMethod("2");
    }
}
