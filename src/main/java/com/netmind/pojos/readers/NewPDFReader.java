package com.netmind.pojos.readers;

import com.netmind.pojos.books.EBook;
import com.netmind.pojos.readers.NewEBookReader2;

public class NewPDFReader extends NewEBookReader2 {
	public NewPDFReader(EBook book) {
		super(book);
	}

	public String read() {
        return this.book.read();
    }
}
