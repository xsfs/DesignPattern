package AbstractFactory;

public class ConcreteFactory1 implements AbstractFactory {
    public ConcreteFactory1(){
        System.out.println("产品族1");
    }
    @Override
    public Product1 newProduct1(){
        Product1 product1 = new ConcreteProduct11();
        return product1;
    }
    @Override
    public Product2 newProduct2(){
        Product2 product2 = new ConcreteProduct21();
        return product2;
    }
}
