package Composite.SafeComposite;

import Composite.OpenComposite.Composite;

public class SafeCompositeTest {
    public static void main(String[] args) {
        Composite composite=new Composite();
        composite.operation();
        Component component=new Leaf("abc");
        component.operation();
    }
}
