package TemplateMethod.ExtandTemplateMethod;

public class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod1(){
        System.out.println("调用抽象方法1");
    }
    @Override
    public void abstractMethod2(){
        System.out.println("调用抽象方法2");
    }
    @Override
    public boolean hookMethod1(){
        System.out.println("调用钩子方法1");
        return false;
    }
    @Override
    public void hookMethod2(){
        System.out.println("调用钩子方法2");
    }
}

