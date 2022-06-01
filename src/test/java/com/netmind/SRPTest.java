package com.netmind;

import com.netmind.pojos.books.Book;
import com.netmind.pojos.books.NewBook;
import com.netmind.pojos.printers.PlainTextPrinter;
import com.netmind.pojos.printers.Printer;
import org.junit.Test;

public class SRPTest {

    @Test
    public void printCurrentPageTest() {
        Book libro=new Book();
        libro.printCurrentPage();
    }

    @Test
    public void printNewCurrentPageTest() {
        NewBook libro=new NewBook();
        Printer textPrinter=new PlainTextPrinter();
        textPrinter.printPage(libro.getCurrentPage());
    }
}