package Prototype;

public class PrototypeTest {
    public static void main(String[] args){
        try {
            SimplePrototype simplePrototype = new SimplePrototype();
            SimplePrototype simplePrototype1 = simplePrototype.clone();
        }catch (CloneNotSupportedException c){
            System.out.println("error");
        }
    }
}
