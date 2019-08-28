package Bridge.BridgeAdapter;

public class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor implementor){
        super(implementor);
    }
    @Override
    public void operation(){
        implementor.operationImp();
    }
}
