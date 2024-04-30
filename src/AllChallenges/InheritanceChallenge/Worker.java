package AllChallenges.InheritanceChallenge;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public void getAge(){
        System.out.println(name + " is " + birthDate + " years old");
    }

    public void collectPay(){
        System.out.println(name + " comes to collect payment" );
    }

    public void terminate(String endDate){
        System.out.println(name + " has been terminated from the system on " + endDate);
    }
}
