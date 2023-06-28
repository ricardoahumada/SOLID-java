package com.netmind.dip.si;

import com.netmind.srp.books.EBook;

public class EBookReader {
	protected EBook book;
	 
    public EBookReader(EBook book) {
        this.book = book;
    }
 
    public String read() {
        return this.book.read();
    }
}
