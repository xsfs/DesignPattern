package Facade.SimpleFacade;

public class Facade {
    private SubSystem1 system1=new SubSystem1();
    private SubSystem2 system2=new SubSystem2();
    private SubSystem3 system3=new SubSystem3();
    public void method(){
        system1.method();
        system2.method();
        system3.method();
    }
}
