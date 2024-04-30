package AllChallenges.InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Worker", "20", 20);
        employeeInfo(worker);
        employeeAction(worker);
        workerStatus(worker);

        Employee Jane = new Employee(10090, "20th January 2014");
        employeeInfo(Jane);
        employeeAction(Jane);
        employmentStatus(Jane, "20th January 2014", 10090);
        terminationStatus(Jane);

        SalariedEmployee Jake = new SalariedEmployee(20000,true);
        employeeInfo(Jake);
        employeeAction(Jake);
        employmentStatus(Jake, 20000, true);
        terminationStatus(Jake);

        HourlyEmployee Jim = new HourlyEmployee(200);
        doubleHourStatus(Jim);

    }


    public static void employeeInfo(Worker worker){
        worker.getAge();
        System.out.println("Age Verified\n");
    }
    public static void employeeAction(Worker worker){
        worker.collectPay();
        System.out.println("Collect Payment successful\n");
    }

    public static void employmentStatus(Employee Jane, String hireDate, long EmployeeId){
        System.out.println("Jane is hired on " + hireDate);
        System.out.println("Jane employee ID is " + EmployeeId);
        System.out.println("Employment Status Display Successful\n");
    }

    public static void employmentStatus(SalariedEmployee Jake, double annualSalary, boolean isRetired){
        Jake.retire();
        if(isRetired){
            System.out.println("Jake's has collected " + annualSalary + " during his working period");
        }else{
            System.out.println("Jake is still working hard");
        }
        System.out.println("Jake's annual salary is " + annualSalary);
    }

    public static void doubleHourStatus(HourlyEmployee Jim){
        System.out.print("Jim is");
        Jim.getDoublePay();
    }

    public static void workerStatus(Worker worker){
        worker.terminate("Worker");
        System.out.println("Termination Successful");
        System.out.println("----------------------\n");
    }


    public static void terminationStatus(Employee Jane){
        Jane.terminate("Jane");
        System.out.println("Termination Successful");
        System.out.println("----------------------");
    }

    public static void terminationStatus(SalariedEmployee Jake){
        Jake.terminate("Jake");
        System.out.println("Termination Successful");
        System.out.println("----------------------");
    }
}
