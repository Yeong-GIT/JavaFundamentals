package Training.Inheritance;

public class Main {

    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal", "Small", 10);
        doSomething(genericAnimal, "slow");
        System.out.println("\n\n");

        Dog dog = new Dog();
        doSomething(dog, "fast");
        System.out.println("\n\n");

        Dog retriever = new Dog("Retriever", "Big");
        doSomething(retriever, "slow");
        retriever.barkNoise("Retriever");
        System.out.println("\n\n");

        Dog doberman = new Dog("Doberman", 100);
        doSomething(doberman, "medium");
        doberman.barkNoise("Doberman");
        System.out.println("\n\n");

        Fish fishy = new Fish("Goldie", 2.5, 10, 10);
        doSomething(fishy, "fast");
    }

    public static void doSomething(Animal genericAnimal, String speed){
        genericAnimal.move(speed);
        genericAnimal.makeNoise();
        System.out.print("String attribute : ");
        System.out.println(genericAnimal);
    }


}
