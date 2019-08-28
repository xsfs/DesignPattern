package Facade.ExtandFacade;

public class Facade1 implements AbstractFacade {
    private SubSystem1 system1=new SubSystem1();
    private SubSystem2 system2=new SubSystem2();
    private SubSystem3 system3=new SubSystem3();
    @Override
    public void method1(){
        system1.method();
        system2.method();
    }
    @Override
    public void method2(){
        system3.method();
    }
}
