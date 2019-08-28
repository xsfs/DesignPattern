package Facade.ExtandFacade;

public class ExtandFacadeTest {
    public static void main(String[] args) {
        AbstractFacade facade1=new Facade1();
        AbstractFacade facade2=new Facade2();
        System.out.println("测试facade1！");
        facade1.method1();
        facade1.method2();
        System.out.println("测试facade2");
        facade2.method1();
        facade2.method2();
    }
}
