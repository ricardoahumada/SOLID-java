package com.enmotion.dip.no;

import com.enmotion.srp.books.PDFBook;

public class PDFReader {
	private PDFBook book;
	 
    public PDFReader(PDFBook book) {
        this.book = book;
    }
 
    public String read() {
        return this.book.read();
    }
}
