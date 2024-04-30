package AllChallenges.InheritanceChallenge;

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, int endDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee(double hourlyPayRate) {
        super(10090,"20th January 2014");
        this.hourlyPayRate = hourlyPayRate;
    }

    protected void getDoublePay(){
        System.out.println(" eligible for double pay");
    }
}
