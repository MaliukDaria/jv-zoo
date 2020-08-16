package core.basesyntax;

public class Shark extends Animal implements Swimmable {
    @Override
    public void eat() {
        System.out.println("Shark is eating");
    }

    @Override
    public void swim() {
        System.out.println("Shark is swimming");
    }
}
