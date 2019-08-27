package Prototype.ExtandPrototype;

import java.util.HashMap;

public class ShapeManager {
    private static HashMap<String,Shape> map=new HashMap<String, Shape>();
    public ShapeManager(){
        map.put("circle",new Circle());
        map.put("square",new Square());
    }
    public Shape get(String str){
        Shape shape=map.get(str);
        return (Shape) shape.clone();
    }
}
