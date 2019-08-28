package Adapter.ClassAdapter;

public class ClassAdapterTest {
    public static void main(String[] args) {
        Target target=new ClassAdapter();
        System.out.println("测试开始！");
        target.request();
    }
}
