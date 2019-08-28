package Adapter.TwoWayAdapter;

public class TwoWayAdapterTest {
    public static void main(String[] args) {
        TwoWayAdaptee adaptee=new TwoWayAdapter(new AdapteeRealize());
        TwoWagTarget target=new TwoWayAdapter(new TargetRealize());
        System.out.println("目标转适配者");
        adaptee.specialRequest();
        System.out.println("适配者转目标");
        target.request();
    }
}
