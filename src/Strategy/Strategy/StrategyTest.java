package Strategy.Strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Context context=new Context();
        context.setStrategy(new ConcreteStrategy1());
        context.strategyMethod();
    }
}
