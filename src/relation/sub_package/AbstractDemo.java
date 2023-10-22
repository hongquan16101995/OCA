package relation.sub_package;

public abstract class AbstractDemo {
    public String name;

    public AbstractDemo() {
    }

    public AbstractDemo(String name) {
        this.name = name;
    }

    public void m1() {
        System.out.println("HelloWorld");
    }

    public abstract void m2();
}
