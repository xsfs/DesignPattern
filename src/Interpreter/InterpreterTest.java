package Interpreter;

public class InterpreterTest {
    public static void main(String[] args) {
        Context context=new Context();
        context.freedoc("韶关的老人");
        context.freedoc("韶关的年轻人");
        context.freedoc("广州的妇女");
        context.freedoc("广州的儿童");
        context.freedoc("山东的儿童");
    }
}
