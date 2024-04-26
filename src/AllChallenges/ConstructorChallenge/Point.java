package AllChallenges.ConstructorChallenge;

public class Point {
    private int x;
    private int y;

    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point (){
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() { //This formula is under Point(0,0)
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }

    public double distance(Point anotherPoint){
        int xDiff = anotherPoint.x - this.x;
        int yDiff = anotherPoint.y - this.y;
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }

    public double distance (int x, int y){
        int xDiff = x - this.x;
        int yDiff = y - this.y;
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }
}
