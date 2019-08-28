package Proxy.Proxy;

public class RealSubject implements Subject {
    @Override
    public void Request(){
        System.out.println("真实主题");
    }
}
