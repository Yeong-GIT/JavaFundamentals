package AllChallenges.ConstructorChallenge;

public class Customer {
    private String name = "Default Name";
    private double creditLimit = 0.00;
    private String emailAddress = "default@gmail.com";

    // Constructor for all three fields
    public Customer(String name, double creditLimit, String emailAddress) { // This is where we map the value of the constructors with the given parameters
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // No-args constructor calling another constructor with default value
    public Customer() {
        this("James", 1000, "james@gmail.com");
    }

    // Constructor with name and email parameters calling another constructor
    public Customer(String name, String emailAddress) {
        this(name, 1000, emailAddress);
    }

    public Customer(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName(){
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
