package Adapter.ClassAdapter;

public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request(){
        System.out.println("适配器");
        super.specialRequest();
    }
}
