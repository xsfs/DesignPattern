package FactoryMethod.SimpleFactory;

public class SimpleFactoryTest {
    public static void main(String[] args)
    {
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.newProduct1().show();
        simpleFactory.newProduct2().show();
    }
}
