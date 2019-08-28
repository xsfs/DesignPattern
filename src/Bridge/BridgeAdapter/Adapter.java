package Bridge.BridgeAdapter;

public class Adapter extends ConcreteImplementor1{
    private Adaptee adaptee=null;
    public Adapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }
    @Override
    public void operationImp(){
        adaptee.specialRequest();
    }
}
