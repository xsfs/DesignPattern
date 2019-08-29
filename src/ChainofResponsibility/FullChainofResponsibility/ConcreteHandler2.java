package ChainofResponsibility.FullChainofResponsibility;

public class ConcreteHandler2 extends Handler {
    @Override
    public void request(String key) {
        if ("two".equals(key)) {
            System.out.println("调用处理操作2");
        } else if (getNextHandler() != null) {
            getNextHandler().request(key);
        } else {
            System.out.println("无法操作该命令");
        }
    }
}
