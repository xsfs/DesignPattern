package Proxy;

public class Proxy implements Subject {
    private RealSubject realSubject=null;
    public void preRequest(){
        System.out.println("调用主题的预处理");
    }
    @Override
    public void Request(){
        if (realSubject==null){
            realSubject=new RealSubject();
        }
        preRequest();
        System.out.println("调用主题");
        realSubject.Request();
        postRequest();
    }
    public void postRequest(){
        System.out.println("调用主题后的处理");
    }
}
