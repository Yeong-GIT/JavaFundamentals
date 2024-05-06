package AllChallenges.EncapsulationChallenge.HLVersion;

public class Printer {
    private double tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer() {
        this(100, 0, false);
        System.out.println("Current toner level : " + tonerLevel);
        System.out.println("Page Printed : " + pagesPrinted);
        System.out.println("Duplex : " + duplex);
    }

    public Printer(int pagesPrinted, boolean duplex) {
        this(100, pagesPrinted, duplex);
        if(duplex){
            System.out.println("Printing 2 Sides of Paper");
        }else{
            System.out.println("Printing 1 Sides of Paper");
        }
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public double printPages(int pagesPrinted){
        for(int page = 1; page <= pagesPrinted; page++){
            System.out.println("Printing page " + page);
            tonerLevel -= 0.2;
        }
        System.out.println("Total page printed " + pagesPrinted);
        return this.tonerLevel;
    }

    public void checkToner(){
        double capacityLeft = 100 - this.tonerLevel;
        String formattedTonerLevel = String.format("%.2f", capacityLeft);
        System.out.println("Current toner level: " + formattedTonerLevel + "ml");
    }

    public double addToner(double tonerAmount){
        double capacityLeft = 100 - this.tonerLevel; // Calculate the remaining capacity
        if (tonerAmount > capacityLeft) {
            tonerAmount = capacityLeft; // Adjust tonerAmount if it exceeds remaining capacity
        }
        this.tonerLevel += tonerAmount; // Add tonerAmount to tonerLevel
        System.out.println("Adding toner of " + tonerAmount + "ml");
        return this.tonerLevel;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "tonerLevel=" + tonerLevel +
                ", pagesPrinted=" + pagesPrinted +
                ", duplex=" + duplex +
                '}';
    }
}
