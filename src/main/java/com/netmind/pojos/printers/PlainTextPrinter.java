package com.netmind.pojos.printers;

public class PlainTextPrinter implements Printer{

    @Override
    public void printPage(String page) {
        System.out.println(page);
    }
}
