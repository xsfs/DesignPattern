package Proxy.DynamicProxy;

public class RealSubject2 implements AbstractSubject {
    @Override
    public void Request(){
        System.out.println("真实主题2");
    }
}