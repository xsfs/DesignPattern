package FactoryMethod.FactoryMethod;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product newProduct(){
        System.out.println("创建产品2");
        Product product =new ConcreteProduct2();
        return product;
    }
}
