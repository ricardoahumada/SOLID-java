package com.enmotion.dip.si;

import com.enmotion.srp.books.EBook;

public class EBookReader {
	protected EBook book;
	 
    public EBookReader(EBook book) {
        this.book = book;
    }
 
    public String read() {
        return this.book.read();
    }
}
