package Memento.Memento;

public class MementoTest {
    public static void main(String[] args) {
        Caretaker caretaker=new Caretaker();
        Originator originator=new Originator();
        originator.setState("设置状态良好");
        System.out.println(originator.getState());
        caretaker.setMemento(originator.createMemento());
        originator.setState("设置状态一般");
        System.out.println(originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
