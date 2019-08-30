package Memento.ExtandMemento;

public class OriginatorPrototype implements Cloneable {
    private String state;
    public OriginatorPrototype(String state){
        this.setState(state);
    }
    public void setState(String state){
        this.state=state;
    }
    public String getState(){
        return state;
    }
    public OriginatorPrototype createMemento(){
        return this.clone();
    }
    public void restoreMemento(OriginatorPrototype or){
        this.setState(or.getState());
    }
    @Override
    public OriginatorPrototype clone(){
        try {
            return (OriginatorPrototype)super.clone();
        }catch (Exception e){
            System.out.println("error");
        }
        return null;
    }
}
