package AllChallenges.ConstructorChallenge;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        double floorArea = floor.getArea();
        double carpetCostPerUnit = carpet.getCost();
        return floorArea * carpetCostPerUnit;
    }
}