package Command.Command;

public class CommandTest {
    public static void main(String[] args) {
        Invoker invoker=new Invoker(new ConcreteCommand1());
        invoker.call();
    }
}
