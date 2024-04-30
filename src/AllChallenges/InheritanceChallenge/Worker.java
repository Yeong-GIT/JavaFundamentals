package AllChallenges.InheritanceChallenge;

public class Worker {
    protected String name;
    private String birthDate;
    protected int endDate;

    public Worker(String name, String birthDate, int endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate=" + endDate +
                '}';
    }

    public void getAge(){
        System.out.println(name + " is " + birthDate + " years old");
    }

    public void collectPay(){
        System.out.println(name + " comes to collect payment" );
    }

    public void terminate(String name){
        if (endDate < 0 || endDate > 31){
            System.out.println("Invalid End Date");
        }else{
            if(endDate == 1 || endDate == 21 || endDate == 31){
                System.out.println(name + " has been terminated from the system on " + endDate + "st of November");
            }else if(endDate == 2 || endDate == 22){
                System.out.println(name + " has been terminated from the system on " + endDate + "nd of November");
            }else{
                System.out.println(name + " has been terminated from the system on " + endDate + "th of November");
            }
        }
    }
}
