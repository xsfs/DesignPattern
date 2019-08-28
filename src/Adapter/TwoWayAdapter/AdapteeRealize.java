package Adapter.TwoWayAdapter;

public class AdapteeRealize implements TwoWayAdaptee {
    @Override
    public void specialRequest(){
        System.out.println("适配者");
    }
}
