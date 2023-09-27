package com.enmotion;

import com.enmotion.srp.si.books.Book;
import com.enmotion.srp.si.printers.PlainTextPrinter;
import com.enmotion.srp.si.printers.Printer;
import org.junit.Test;

public class SRPTest {

    @Test
    public void printCurrentPageTest() {
        com.enmotion.srp.no.Book libro=new com.enmotion.srp.no.Book();
        libro.printCurrentPage();
    }

    @Test
    public void printNewCurrentPageTest() {
        Book libro=new Book();
        Printer textPrinter=new PlainTextPrinter();
        textPrinter.printPage(libro.getCurrentPage());
    }
}