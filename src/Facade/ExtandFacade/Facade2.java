package Facade.ExtandFacade;

public class Facade2 implements AbstractFacade{
    private SubSystem2 system2=new SubSystem2();
    private SubSystem3 system3=new SubSystem3();
    private SubSystem4 system4=new SubSystem4();
    @Override
    public void method1(){
        system2.method();
        system3.method();
    }
    @Override
    public void method2(){
        system4.method();
    }
}
