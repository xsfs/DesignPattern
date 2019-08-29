package TemplateMethod.ExtandTemplateMethod;

public abstract class AbstractClass {
    public void templateMethod(){
        abstractMethod1();
        hookMethod2();
        if(hookMethod1()){
            specialMethod();
        }else{
            System.out.println("跳过具体方法！");
        }
        abstractMethod2();
    }
    public void specialMethod(){
        System.out.println("调用具体方法！");
    }
    public abstract boolean hookMethod1();
    public abstract void  hookMethod2();
    public abstract void abstractMethod1();
    public abstract void abstractMethod2();
}
