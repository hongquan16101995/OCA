package parent;

import child.ChildDemo;

public class Main {
    public static void main(String[] args) {
        Parent parent = new ChildDemo("Bob");
        System.out.println(parent.name);
        ChildDemo childDemo = (ChildDemo) parent;
        System.out.println(childDemo.name);
    }
}
