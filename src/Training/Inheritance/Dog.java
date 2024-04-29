package Training.Inheritance;

import java.util.Objects;

public class Dog extends Animal{

    private String attributes;
    private String behaviour;

    public Dog(){
        super("Retriever", "Medium", 90);
    }

    public Dog(String type, String size){
        this(type, size, 90, "Peach", "Fierce");
    }

    public Dog(String type, double weight){
        this(type, "Biggy", weight, "Peach", "Fierce");
    }

    public Dog(String type, String size, double weight, String attributes, String behaviour) {
        super(type, size, weight);
        this.attributes = attributes;
        this.behaviour = behaviour;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "attributes='" + attributes + '\'' +
                ", behaviour='" + behaviour + '\'' +
                "} " + super.toString();
    }

    public void barkNoise(String type) {
        if(Objects.equals(type, "Retriever")){
            System.out.println(type + " make howling noise");
        }else if(Objects.equals(type, "Doberman")){
            System.out.println(type + " make growling noise");
        }else{
            super.makeNoise();
        }
    }
}
