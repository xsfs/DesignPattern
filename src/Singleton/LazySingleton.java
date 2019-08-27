package Singleton;

public class LazySingleton {
    //
    private static LazySingleton lazySingleton=null;
    private LazySingleton(){
        System.out.println("LazySingleton builded first");
    }
    public static LazySingleton instance(){
        if(lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }
}

