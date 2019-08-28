package Adapter.TwoWayAdapter;

public class TwoWayAdapter implements TwoWagTarget,TwoWayAdaptee {
    AdapteeRealize adaptee=null;
    TargetRealize target=null;
    public TwoWayAdapter(AdapteeRealize adaptee){
        this.adaptee=adaptee;
    }
    public TwoWayAdapter(TargetRealize target){
        this.target=target;
    }
    @Override
    public void specialRequest(){
        adaptee.specialRequest();
    }
    @Override
    public void request(){
        target.request();
    }
}
