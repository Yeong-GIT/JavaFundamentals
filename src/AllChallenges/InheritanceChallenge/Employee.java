package AllChallenges.InheritanceChallenge;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthDate, int endDate, long employeeId, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    public Employee(long employeeId, String hireDate){
        super("Jake", "10", 7);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate=" + hireDate +
                "} " + super.toString();
    }
}
