package AllChallenges.ClassesChallenge;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        //Setter
        bank.setAccNum("90887654");
        bank.setAccBalance(1000);
        bank.setCustomerName("James");
        bank.setEmail("james@gmail.com");
        bank.setPhoneNumber("0199876543");

        //Getter
        System.out.println("Customer Name - " + bank.getCustomerName());
        System.out.println("Phone Number - " + bank.getPhoneNumber());
        System.out.println("Email - " + bank.getEmail());
        System.out.println("Acc Number - " + bank.getAccNum());
        System.out.println("Acc Balance - " + bank.getAccBalance());

        bank.depositAcc(2000);

//        bank.withdrawAcc(1000);

        bank.withdrawAcc(9000);

    }
}
