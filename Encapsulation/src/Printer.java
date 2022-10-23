public class Printer {

    private double tonerLevel = 100.0d;
    private double tonerUsed = 1.25;
    private int numberPagesPrinted;
    private boolean isDuplex;

    public Printer(int numberPagesPrinted, boolean isDuplex) {

        this.numberPagesPrinted = numberPagesPrinted;
        this.isDuplex = isDuplex;
    }

    private void fillToner() {

        if (this.tonerLevel <= 0) {
            this.tonerLevel = 100;
        } else {
            this.tonerLevel = tonerLevel;
        }

    }


    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public double getTonerUsed() {
        return tonerUsed;
    }

    public int getNumberPagesPrinted() {
        return numberPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    private double reduceToner() {
        if (this.isDuplex) {
            this.tonerLevel = this.tonerLevel - (tonerUsed / 2);
            return this.tonerLevel;
        } else {

            return this.tonerLevel -= this.tonerUsed;
        }
    }

    public void printPage(int pagesPrinted) {
        if (this.isDuplex) {
            pagesPrinted = this.numberPagesPrinted / 2;
            reduceToner();
            System.out.println("This was a duplex print: " + pagesPrinted);
        } else {
            this.numberPagesPrinted += pagesPrinted;
            reduceToner();
            System.out.println("These are the pages printed: " + pagesPrinted);
        }
        System.out.println("this is the new Toner Level: " + this.tonerLevel);
    }

}
