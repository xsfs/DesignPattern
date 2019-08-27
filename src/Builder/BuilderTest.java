package Builder;

public class BuilderTest {
    public static void main(String[] args) {
        Director director1=new Director(new ConcreteBuilder1());
        Director director2=new Director(new ConcreteBuilder2());
        director1.constant().show();
        director2.constant().show();
    }
}
