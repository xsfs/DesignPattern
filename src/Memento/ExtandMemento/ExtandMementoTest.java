package Memento.ExtandMemento;

public class ExtandMementoTest {
    public static void main(String[] args) {
        OriginatorPrototype or=new OriginatorPrototype("初始状态");
        PrototypeCaretaker caretaker=new PrototypeCaretaker();
        caretaker.setOr(or.createMemento());
        System.out.println(caretaker.getOr().getState());
        or.setState("更改状态");
        System.out.println(or.getState());
        or.restoreMemento(caretaker.getOr());
        System.out.println(or.getState());
    }
}
