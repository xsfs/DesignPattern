package ChainofResponsibility.PartChainofResponsibility;

public abstract class Handler {
    private Handler nextHandler;
    public void setHandler(Handler handler){
        this.nextHandler=handler;
    }
    public Handler getNextHandler(){
        return nextHandler;
    }
    public abstract void request(int key);

}
