package ChainofResponsibility.FullChainofResponsibility;

public class FullChainTest {
    public static void main(String[] args) {
        Handler handler1=new ConcreteHandler1();
        Handler handler2=new ConcreteHandler2();
        handler1.setHandler(handler2);
        handler1.request("one");
        System.out.println("----------------");
        handler1.request("two");
        System.out.println("----------------");
        handler1.request("three");
    }
}
