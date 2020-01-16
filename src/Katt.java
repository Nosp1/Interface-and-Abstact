import java.awt.*;

public class Katt extends Animal implements A {
    static int alder = 15;
    String name = "Bob";

    public Katt() {

    }



    @Override
    void makeSound() {
        System.out.println("Mjau");
    }

    public static int getAlder() {
        return alder;
    }

}
