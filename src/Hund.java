import java.awt.*;

public class Hund extends Animal implements A {

    public Hund() {

    }

    @Override
    void makeSound() {
        System.out.println("Voff");
    }

    @Override
    public void a() {
        System.out.println("jeg er ikke en hund");
    }
}
