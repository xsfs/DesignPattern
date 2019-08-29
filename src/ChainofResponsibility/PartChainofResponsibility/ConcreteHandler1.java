package ChainofResponsibility.PartChainofResponsibility;

public class ConcreteHandler1 extends Handler {
    @Override
    public void request(int key){
        if (key>=1) {
            System.out.println("调用处理操作1");
            if(key>1) {
                if (getNextHandler()!=null) {
                    getNextHandler().request(key);
                }else {
                    System.out.println("无法操作该命令");
                }
            }
        }
    }
}
