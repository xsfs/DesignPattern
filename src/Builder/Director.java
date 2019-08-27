package Builder;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }
    public Product constant(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
