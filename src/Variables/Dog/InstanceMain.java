package Variables.Dog;

public class InstanceMain {
    public static void main(String[] args) {

        InstanceDog rex = new InstanceDog("rex");
        InstanceDog fluffy = new InstanceDog("fluffy");
        rex.printName();
        fluffy.printName();
    }
}
