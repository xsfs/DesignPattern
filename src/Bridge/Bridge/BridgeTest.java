package Bridge.Bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Implementor implementor=new ConcreteImplementor1();
        Abstraction abstraction=new RefinedAbstraction(implementor);
        System.out.println("桥接模式测试开始！");
        abstraction.operation();
    }
}
