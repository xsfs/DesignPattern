package Decorator.Decorator;

public class Decorator implements Conponent {
    private Conponent conponent;
    public Decorator(Conponent conponent){
        this.conponent=conponent;
    }
    @Override
    public void operation(){
        conponent.operation();
    }
}
