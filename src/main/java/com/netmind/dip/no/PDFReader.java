package com.netmind.dip.no;

import com.netmind.srp.books.PDFBook;

public class PDFReader {
	private PDFBook book;
	 
    public PDFReader(PDFBook book) {
        this.book = book;
    }
 
    public String read() {
        return this.book.read();
    }
}