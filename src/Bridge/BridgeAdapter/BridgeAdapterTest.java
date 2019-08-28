package Bridge.BridgeAdapter;

public class BridgeAdapterTest {
    public static void main(String[] args) {
        Implementor implementor=new Adapter(new Adaptee());
        Abstraction abstraction=new RefinedAbstraction(implementor);
        System.out.println("桥接模式测试开始！");
        abstraction.operation();
    }
}
