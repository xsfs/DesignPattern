package ChainofResponsibility.PartChainofResponsibility;

public class ConcreteHandler2 extends Handler {
    @Override
    public void request(int key) {

        if (key>=2) {
            System.out.println("调用处理操作2");
            if(key>2) {
                if (getNextHandler()!=null) {
                    getNextHandler().request(key);
                }else {
                    System.out.println("无法操作该命令");
                }
            }
        }
    }
}
