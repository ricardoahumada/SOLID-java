package com.netmind.pojos.readers;

import com.netmind.srp.books.EBook;

public class NewPDFReader extends NewEBookReader2 {
	public NewPDFReader(EBook book) {
		super(book);
	}

	public String read() {
        return this.book.read();
    }
}
