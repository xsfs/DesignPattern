package Prototype.ExtandPrototype;

public class ExtandPrototypeTest {
    public static void main(String[] args){
        ShapeManager shapeManager=new ShapeManager();
        Circle circle=(Circle)shapeManager.get("circle");
        circle.setR(3);
        circle.countArea();
        Square square=(Square)shapeManager.get("square");
        square.setD(3);
        square.countArea();
    }
}
