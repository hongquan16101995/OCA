package relation;

public class Parent {
    public void m1() {
        System.out.println("m1 of Parent");
    }

    public void mParent() {
        System.out.println("method only Parent");
    }

    // access default
    String getWord() {
        return "HelloWorld";
    }

    private void m3() {
        System.out.println("Demo");
    }
}
