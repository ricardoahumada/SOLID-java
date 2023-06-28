package com.netmind;

import com.netmind.srp.si.books.Book;
import com.netmind.srp.si.printers.PlainTextPrinter;
import com.netmind.srp.si.printers.Printer;
import org.junit.Test;

public class SRPTest {

    @Test
    public void printCurrentPageTest() {
        com.netmind.srp.no.Book libro=new com.netmind.srp.no.Book();
        libro.printCurrentPage();
    }

    @Test
    public void printNewCurrentPageTest() {
        Book libro=new Book();
        Printer textPrinter=new PlainTextPrinter();
        textPrinter.printPage(libro.getCurrentPage());
    }
}