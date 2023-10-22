package child;

import parent.Parent;

public class Main {
    public static void main(String[] args) {
        Parent parent = new ChildDemo("Bob");
//        System.out.println(parent.name);
        ChildDemo childDemo = (ChildDemo) parent;
//        System.out.println(child.name);
        System.out.println(childDemo.getName());
    }
}
