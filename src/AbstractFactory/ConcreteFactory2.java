package AbstractFactory;

public class ConcreteFactory2 implements AbstractFactory {
    public ConcreteFactory2(){
        System.out.println("产品族2");
    }
    @Override
    public Product1 newProduct1(){
        Product1 product1 = new ConcreteProduct12();
        return product1;
    }
    @Override
    public Product2 newProduct2(){
        Product2 product2 = new ConcreteProduct22();
        return product2;
    }
}
