package Variables;

public class StaticDog {
    private static String name;

    public StaticDog(String name){
        StaticDog.name = name;
    }

    public void printName(){
        System.out.println("name = " + name);
    }
}
