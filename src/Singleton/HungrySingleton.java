package Singleton;

public class HungrySingleton {
    private static HungrySingleton hungrySingleton=new HungrySingleton();
    private HungrySingleton(){
        System.out.println("HungrySingleton builed first");
    }
    public static HungrySingleton instance(){
        return hungrySingleton;
    }
}
