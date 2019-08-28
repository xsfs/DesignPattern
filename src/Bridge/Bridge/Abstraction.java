package Bridge.Bridge;

public abstract class Abstraction {
    protected Implementor implementor=null;
    protected Abstraction(Implementor implementor){
        this.implementor=implementor;
    }
    public abstract void operation();
}
