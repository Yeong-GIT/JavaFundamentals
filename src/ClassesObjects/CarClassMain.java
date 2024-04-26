package ClassesObjects;

public class CarClassMain {
    public static void main(String[] args) {

        CarClass carClass = new CarClass();
        carClass.setMake("Maserati");
        carClass.setModel("Carrera");
        carClass.setDoors(2);
        carClass.setConvertible(true);
        carClass.setColor("black");
        System.out.println("make = " + carClass.getMake());
        System.out.println("model = " + carClass.getModel());

        carClass.describeCar();


        CarClass targa = new CarClass();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describeCar();

    }
}
