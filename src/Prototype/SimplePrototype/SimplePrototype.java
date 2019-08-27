package Prototype.SimplePrototype;

public class SimplePrototype implements Cloneable{
    public SimplePrototype(){
        System.out.println("builded successfully");
    }
    @Override
    public SimplePrototype clone() throws CloneNotSupportedException{
        System.out.println("clone successfully");
        return (SimplePrototype)super.clone();
    }
}
