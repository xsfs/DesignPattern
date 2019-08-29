package TemplateMethod.ExtandTemplateMethod;

public class ExtandTemplateMethodTest {
    private static AbstractClass aClass;
    public static void main(String[] args) {
        aClass=new ConcreteClass();
        aClass.templateMethod();
    }
}
