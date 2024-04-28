package Training.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Mutt", "big", 70);
        doSomething(animal, "slow");
    }

    public static void doSomething(Animal animal, String speed){
        animal.move(speed);
        animal.makeNoise();
        System.out.println(animal);
    }
}
