package Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal ("Mutt", "big", 70);
        doSomething(animal, "slow");

        Dog dog = new Dog();
        doSomething(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doSomething(yorkie, "fast");

        Dog retriever = new Dog("Retriever White", 65, "Floppy", "Swimmer");
        doSomething(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doSomething(wolf, "slow");

        Fish goldie = new Fish("GoldFish", 0.25, 2, 3);
        doSomething(goldie, "fast");
    }

    public static void doSomething(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");
    }
}
