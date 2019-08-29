package Strategy.ExtendStrategy;


public class ConcreteStrategy1 implements Strategy {
    @Override
    public void strategyMethod(){
        System.out.println("调用策略1");
    }
}
