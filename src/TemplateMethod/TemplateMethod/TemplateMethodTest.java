package TemplateMethod.TemplateMethod;

public class TemplateMethodTest {
    private static AbstractClass aClass;
    public static void main(String[] args) {
        aClass=new ConcreteClass();
        aClass.templateMethod();
    }
}
