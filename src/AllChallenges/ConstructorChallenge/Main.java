package AllChallenges.ConstructorChallenge;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(); // Default Constructors aka no-args constructors

        System.out.println("\nDefault First Constructor");
        System.out.println("Customer Name - " + customer.getName());
        System.out.println("Credit Limit - " + customer.getCreditLimit());
        System.out.println("Email Address - " + customer.getEmailAddress());

        Customer testCustomer = new Customer("Jim", "jim@gmail.com");
        System.out.println("\nSecond Constructor\nCustomer Name - " + testCustomer.getName() + "\nCredit Limit - " + testCustomer.getCreditLimit() + "\nCustomer Email - " + testCustomer.getEmailAddress());

        Customer testCustomer2 = new Customer("king@gmail.com");
        System.out.println("\nThird Constructor\nCustomer Name - " + testCustomer2.getName() + "\nCredit Limit - " + testCustomer2.getCreditLimit() + "\nCustomer Email - " + testCustomer2.getEmailAddress());

    }
}
