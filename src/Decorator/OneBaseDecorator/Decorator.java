package Decorator.OneBaseDecorator;


public class Decorator extends ConcreteCompenont {
    private ConcreteCompenont compenont=null;
    public Decorator(ConcreteCompenont compenont){
        this.compenont=compenont;
    }
    @Override
    public void operation(){
        compenont.operation();
    }
}
