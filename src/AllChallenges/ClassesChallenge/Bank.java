package AllChallenges.ClassesChallenge;

public class Bank {
    private String accNum = "00000000";
    private double accBalance = 100.00;
    private String customerName = "Default Person 1";
    private String email = "default@gmail.com";
    private String phoneNumber = "00000000";

    public Bank() { //Default Constructor to instantiate object with default value
        this("23423", 2.50, "Default Name", "Default Address", "Default Phone");
        System.out.println("Empty constructor called");
    }

    public Bank(String accNum, double accBalance, String customerName, String CustomerEmail, String CustomerPhone) {
        System.out.println("Account constructor with parameters called");
        this.accNum = accNum;
        this.accBalance = accBalance;
        this.customerName = customerName;
        email = CustomerEmail; // does not have "this" keyword because field name  is different with the parameters name
        phoneNumber = CustomerPhone; // does not have "this" keyword because field name  is different with the parameters name
    }

    public Bank(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositAcc(double amount){
        System.out.println("\nPrevious Account Balance - " + accBalance);
        this.accBalance += amount;
        System.out.println("Deposit total " + amount + " successful.");
        System.out.println("Current Balance - " + accBalance);
    }

    public void withdrawAcc(double amount){
        System.out.println("\nPrevious Account Balance - " + accBalance);
        if(amount > accBalance){
            System.out.println("Exceeded Account Balance Limit");
            System.out.println("Current Balance - " + accBalance);
        }
        else{
            this.accBalance -= amount;
            System.out.println("Withdrawal total " + amount + " successful.");
            System.out.println("Current Balance - " + accBalance);
        }
    }
}
