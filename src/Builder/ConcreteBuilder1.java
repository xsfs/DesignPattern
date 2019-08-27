package Builder;

public class ConcreteBuilder1 extends Builder {
    @Override
    public void buildPartA(){
        product.setPartA("builde1.A");
    }
    @Override
    public void buildPartB(){
        product.setPartB("builde1.B");
    }
    @Override
    public void buildPartC(){
        product.setPartC("builde1.C");
    }
}
