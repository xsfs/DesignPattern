package Adapter.ObjectAdapter;

public class ObjectAdapterTest {
    public static void main(String[] args) {
        Target target=new ObjectAdapter(new Adaptee());
        System.out.println("测试开始！");
        target.request();
    }
}
