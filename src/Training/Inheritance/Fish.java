package Training.Inheritance;

public class Fish extends Animal{

    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscle(){
        System.out.println("Muscles moving ");
    }

    private void moveBackFins(){
        System.out.println("Back Fins moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscle();
        if(speed == "fast"){
            moveBackFins();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills='" + gills + '\'' +
                ", fins='" + fins + '\'' +
                "} " + super.toString();
    }
}
