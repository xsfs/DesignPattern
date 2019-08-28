package Proxy.DynamicProxy;

public class RealSubject1 implements AbstractSubject {
    @Override
    public void Request(){
        System.out.println("真实主题1");
    }
}
