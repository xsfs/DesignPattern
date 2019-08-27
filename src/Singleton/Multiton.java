package Singleton;

import java.util.ArrayList;

public class Multiton {
    private static ArrayList<Multiton> arrayList= new ArrayList<>();
    private Multiton(int i){
        System.out.println("Multiton"+i+" builded");
    }
    static {
        for(int i=0;i<10;i++){
            arrayList.add(new Multiton(i));
        }
    }
    public static Multiton instance(int i){
        if(i>=0&&i<10){
            return arrayList.get(i);
        }
        return null;
    }
}
