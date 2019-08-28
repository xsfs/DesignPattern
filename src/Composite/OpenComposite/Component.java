package Composite.OpenComposite;

public interface Component {
    void add(Component component);
    void remove(Component component);
    Component get(int key);
    void operation();
}
