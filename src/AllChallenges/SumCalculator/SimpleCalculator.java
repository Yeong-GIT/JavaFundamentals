package AllChallenges.SumCalculator;

public class SimpleCalculator {

    private double firstNumber = 0.0;
    private double secondNumber = 0.0;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }

    public double getDivisionResult(){
        if(secondNumber == 0.0){
            return 0.0;
        } else {
            return firstNumber / secondNumber;
        }
    }
}

