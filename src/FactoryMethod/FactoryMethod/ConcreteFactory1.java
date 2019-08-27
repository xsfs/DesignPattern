package FactoryMethod.FactoryMethod;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product newProduct(){
        System.out.println("创建产品1");
        Product product=new ConcreteProduct1();
        return product;
    }
}
