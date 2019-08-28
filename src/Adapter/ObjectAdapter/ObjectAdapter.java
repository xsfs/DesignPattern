package Adapter.ObjectAdapter;

public class ObjectAdapter implements Target {
    private Adaptee adaptee=null;
    public ObjectAdapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }
    @Override
    public void request(){
        System.out.println("适配器");
        adaptee.specialRequest();
    }
}
