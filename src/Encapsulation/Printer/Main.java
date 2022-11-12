package Encapsulation.Printer;

public class Main {
    public static void main(String[] args) {
        /*Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);*/

        Printer printer2 = new Printer(23, true);
        System.out.println(printer2.addToner(4));
        System.out.println("initial page count = " +printer2.getPagesPrinted());
        int pagesPrinted = printer2.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer2.getPagesPrinted());
        pagesPrinted = printer2.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer2.getPagesPrinted());
        pagesPrinted = printer2.printPages(1);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer2.getPagesPrinted());

    }
}
