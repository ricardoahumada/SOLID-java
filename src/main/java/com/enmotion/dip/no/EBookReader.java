package com.enmotion.dip.no;

import com.enmotion.srp.books.PDFBook;

public class EBookReader {
	private PDFBook book;
	 
    public EBookReader(PDFBook book) {
        this.book = book;
    }
 
    public String read() {
        return this.book.read();
    }
}
