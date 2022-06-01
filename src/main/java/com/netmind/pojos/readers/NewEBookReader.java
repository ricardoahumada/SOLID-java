package com.netmind.pojos.readers;

import com.netmind.pojos.books.EBook;

public class NewEBookReader {
	private EBook book;
	 
    public NewEBookReader(EBook book) {
        this.book = book;
    }
 
    public String read() {
        return this.book.read();
    }
}
