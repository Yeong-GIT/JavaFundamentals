package AllChallenges.Composition.ClassComposition;

import AllChallenges.ConstructorChallenge.Wall.Wall;

public class Bedroom {
    private Lamp lamp;
    private Bed bed;
    private Ceiling ceiling;
    private Walls walls;


}

class Lamp{
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("The lamp is being turn on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}

class Bed{

}

class Ceiling{

}

class Walls{

}


