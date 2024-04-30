package AllChallenges.InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Jim", "20", "20");
        workerAction(worker, "10th November");

        Employee Jane = new Employee("Jane", "30", "19", 10090, "20");
        workerAction(Jane, "20th November");

    }

    public static void workerAction(Worker worker, String endDate){
        worker.getAge();
        worker.collectPay();
        worker.terminate(endDate);
        System.out.println("--------");
    }
}
