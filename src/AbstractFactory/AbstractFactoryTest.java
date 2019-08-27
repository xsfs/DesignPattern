package AbstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args)
    {
        AbstractFactory factory1 = new ConcreteFactory1();
        factory1.newProduct1().show();
        factory1.newProduct2().show();
        AbstractFactory factory2 = new ConcreteFactory2();
        factory2.newProduct1().show();
        factory2.newProduct2().show();
    }
}
