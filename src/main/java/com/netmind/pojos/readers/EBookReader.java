package com.netmind.pojos.readers;

import com.netmind.pojos.books.PDFBook;

public class EBookReader {
	private PDFBook book;
	 
    public EBookReader(PDFBook book) {
        this.book = book;
    }
 
    public String read() {
        return this.book.read();
    }
}
