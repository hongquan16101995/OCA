package relation;

import java.io.*;

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

    public void m4() throws RuntimeException, IOException {
//        try {
            ObjectInputStream a = new ObjectInputStream(
                    new FileInputStream(""));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println("Demo");
    }
}
