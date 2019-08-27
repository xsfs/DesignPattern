package FactoryMethod.SimpleFactory;


public class SimpleFactory {
    public ConcreteProduct1 newProduct1(){
        System.out.println("创建产品1");
        ConcreteProduct1 product=new ConcreteProduct1();
        return product;
    }
    public ConcreteProduct2 newProduct2(){
        System.out.println("创建产品1");
        ConcreteProduct2 product=new ConcreteProduct2();
        return product;
    }
}
