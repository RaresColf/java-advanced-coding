package ro.sdacdemy.advanced.encapsulation;

public class Printer {
    private int tonerLevel;
    private int numberOfPagePrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            System.out.println("Value not permitted");
        }

        this.numberOfPagePrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public void addToner(int tonerAmmount) {
        if (tonerAmmount > 0 && tonerAmmount <= 100) {
            if (this.tonerLevel + tonerAmmount > 100) {
                System.out.println("Too much toner ! ");
            } else {
                this.tonerLevel += tonerAmmount;
            }
        } else {
            System.out.println("Value not permitted");
        }
    }

    // nrOfPg = 101

    // pages = 101 / 2 = 50 (partea intreaga)
    // reminder = 101 % 2 = 1 (restul impartrii)

    public void printPages(int numberOfPages) {
        int pagesToPrint = numberOfPages;
        if (this.duplexPrinter) {
            pagesToPrint = (numberOfPages / 2) + (numberOfPages % 2);
        }
        this.numberOfPagePrinted += pagesToPrint;
        System.out.println("Pages to print : " + pagesToPrint);
    }

    public int getNumberOfPagePrinted() {
        return numberOfPagePrinted;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "tonerLevel='" + tonerLevel + '\'' +
                ", numberOfPagePrinted=" + numberOfPagePrinted +
                ", duplexPrinter=" + duplexPrinter +
                '}';
    }
}
