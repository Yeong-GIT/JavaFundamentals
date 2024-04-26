package Variables.Dog;

public class StaticMain {
    public static void main(String[] args) {

        StaticDog rex = new StaticDog("rex");
        StaticDog fluffy = new StaticDog("fluffy");
        rex.printName();
        fluffy.printName();
    }
}
