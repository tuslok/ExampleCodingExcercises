package Encapsulation.Task;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > 0 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 || tonerAmount <= 100){
            tonerLevel = tonerLevel + tonerAmount;
            if(tonerLevel > 100){
                return -1;
            }
        } else {
            return -1;
        }
        return tonerLevel;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = pages / 2 + pages % 2;
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}