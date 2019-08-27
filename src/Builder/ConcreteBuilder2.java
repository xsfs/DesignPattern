package Builder;

public class ConcreteBuilder2 extends Builder{
    @Override
    public void buildPartA(){
        product.setPartA("builde2.A");
    }
    @Override
    public void buildPartB(){
        product.setPartB("builde2.B");
    }
    @Override
    public void buildPartC(){
        product.setPartC("builde2.C");
    }
}
