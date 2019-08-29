package TemplateMethod.TemplateMethod;

public class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod1(){
        System.out.println("调用抽象方法1");
    }
    @Override
    public void abstractMethod2(){
        System.out.println("调用抽象方法2");
    }
}

