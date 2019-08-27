package Prototype.ExtandPrototype;

public class Square implements Shape {//
    private int D=0;
    public void setD(int d){
        D=d;
    }
    @Override
    public Shape clone(){
        System.out.println("square clone successfully");
        Shape square=null;
        try {
            square=(Shape)super.clone();
        }catch (CloneNotSupportedException c){
            System.out.println("error");
        }
        return square;
    }
    @Override
    public void countArea(){
        System.out.println(D*D);
    }
}
