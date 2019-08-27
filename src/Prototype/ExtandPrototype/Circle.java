package Prototype.ExtandPrototype;

public class Circle implements Shape{//
    private int R=0;
    public void setR(int r){
        R=r;
    }
    @Override
    public Shape clone(){
        System.out.println("circle clone successfully");
        Shape circle=null;
        try {
            circle=(Shape)super.clone();
        }catch (CloneNotSupportedException c){
            System.out.println("error");
        }
        return circle;
    }
    @Override
    public void countArea(){
        System.out.println(R*R*Math.PI);
    }
}
