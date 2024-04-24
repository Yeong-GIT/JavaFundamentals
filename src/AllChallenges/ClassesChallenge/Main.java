package AllChallenges.ClassesChallenge;

public class Main {
    public static void main(String[] args) {
//        Bank testBank = new Bank ("12345", 1000.00,
//                "Default1", "default@gmail.com",
//                "0199567842");

        Bank testBank = new Bank(); // Default Constructors aka no-args constructors

        //Setter
//        testBank.setAccNum("90887654");
//        testBank.setAccBalance(1000);
//        testBank.setCustomerName("James");
//        testBank.setEmail("james@gmail.com");
//        testBank.setPhoneNumber("0199876543");

        //Getter
        System.out.println("Customer Name - " + testBank.getCustomerName());
        System.out.println("Phone Number - " + testBank.getPhoneNumber());
        System.out.println("Email - " + testBank.getEmail());
        System.out.println("Acc Number - " + testBank.getAccNum());
        System.out.println("Acc Balance - " + testBank.getAccBalance());

        testBank.depositAcc(2000);

//        testBank.withdrawAcc(1000);

        testBank.withdrawAcc(9000);

        Bank timsbank = new Bank("Tim", "tim@gmail.com", "12345");
        System.out.println("Acc No: " + timsbank.getAccNum() + "; name " + timsbank.getCustomerName());

    }
}
