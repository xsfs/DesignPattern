package Singleton;

public class SingletonTest {
    //
    public static void main(String[] args) {
        System.out.println("test LazySingleton");
        LazySingleton lazySingleton=LazySingleton.instance();
        System.out.println("test HungrySingleton");
        HungrySingleton hungrySingleton=HungrySingleton.instance();
        System.out.println("test Multiton");
        Multiton multiton=Multiton.instance(2);
    }
}
