package Command.ExtandCommand;

public class ExtandCommandTest {
    private static CompositeInvoker invoker=new CompositeInvoker();
    public static void main(String[] args) {
        invoker.add(new ConcreteCommand1());
        invoker.add(new ConcreteCommand2());
        invoker.execute();
    }
}
