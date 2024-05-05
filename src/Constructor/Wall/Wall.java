package Constructor.Wall;

public class Wall {
    private double width;
    private double height;

    protected Wall (double width, double height){
        if (width < 0) {
            this.width = 0; // Set width to 0 if parameter is less than 0
        } else {
            this.width = width; // Set width to parameter value if it's non-negative
        }

        if (height < 0) {
            this.height = 0; // Set height to 0 if parameter is less than 0
        } else {
            this.height = height; // Set height to parameter value if it's non-negative
        }
    }

    public Wall() {
        this.width = 0;
        this.height = 0;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        if(width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }
    }

    public void setHeight(double height){
        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getArea(){
        return this.width * this.height;
    }

}
