package Inheritance.ChallengePart1;

public class Main {
    public static void main(String[] args) {
        Employee Tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(Tim);
        System.out.println("Age = " + Tim.getAge());
        System.out.println("Pay = " + Tim.collectPay());

        SalariedEmployee Joe = new SalariedEmployee("Joe", "12/12/1977","01/01/2020", 35000);
        System.out.println(Joe);
        System.out.println("Joe's Paycheck = $" + Joe.collectPay());
        Joe.retire();
        System.out.println("Joe's Pension Check = $ " + Joe.collectPay());

        HourlyEmployee Mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(Mary);
        System.out.println("Mary's paycheck = $" + Mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + Mary.getDoublePay());
    }
}
