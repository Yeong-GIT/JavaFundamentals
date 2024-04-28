package Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal ("Mutt", "big", 70);
        doSomething(animal, "slow");
    }

    public static void doSomething(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");
    }
}
