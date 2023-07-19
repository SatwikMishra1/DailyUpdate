package demo.satwik;

import encapsulation.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer=new Printer(50,false);
        int pagesPrinted= printer.printPages(10);
        System.out.println(pagesPrinted);
    }
}

