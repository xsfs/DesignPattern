package ChainofResponsibility.PartChainofResponsibility;

public class PartChainTest {
    public static void main(String[] args) {
        Handler handler1=new ConcreteHandler1();
        Handler handler2=new ConcreteHandler2();
        handler1.setHandler(handler2);
        handler1.request(1);
        System.out.println("----------------");
        handler1.request(2);
        System.out.println("----------------");
        handler1.request(3);
    }
}
