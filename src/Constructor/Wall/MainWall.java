package Constructor.Wall;

public class MainWall {

    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        wall.setHeight(1.5);
        wall.setWidth(11.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
