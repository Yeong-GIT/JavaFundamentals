package AllChallenges.EncapsulationChallenge;

public class Main {
    public static void main(String[] args) {

        Printer printer3 = new Printer();
        System.out.println(printer3);
        printer3.printPages(100);
        printer3.checkToner();
        printer3.addToner(100);
    }
}
