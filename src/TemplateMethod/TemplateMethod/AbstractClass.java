package TemplateMethod.TemplateMethod;

public abstract class AbstractClass {
    public void templateMethod(){
        specialMethod();
        abstractMethod1();
        abstractMethod2();
    }
    public void specialMethod(){
        System.out.println("调用具体方法！");
    }
    public abstract void abstractMethod1();
    public abstract void abstractMethod2();
}
