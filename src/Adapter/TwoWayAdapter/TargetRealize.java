package Adapter.TwoWayAdapter;

public class TargetRealize implements TwoWagTarget {
    @Override
    public void request(){
        System.out.println("目标");
    }
}
