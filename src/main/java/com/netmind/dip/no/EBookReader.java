package com.netmind.dip.no;

import com.netmind.srp.books.PDFBook;

public class EBookReader {
	private PDFBook book;
	 
    public EBookReader(PDFBook book) {
        this.book = book;
    }
 
    public String read() {
        return this.book.read();
    }
}
