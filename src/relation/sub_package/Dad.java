package relation.sub_package;

import relation.Parent;

import java.io.IOException;

public class Dad {

    private int age;
    public String name;

    public Dad() {
    }

    public Dad(int age) {
        this.age = age;
    }

    public Dad(int age, String name) {
        // legal constructor
        this(age);
        this.name = name;
    }

    public Parent m1() throws IOException {
        throw new IOException();
//        return new Parent();
    }
}
