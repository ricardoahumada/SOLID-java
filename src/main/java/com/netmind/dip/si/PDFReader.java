package com.netmind.dip.si;

import com.netmind.srp.books.EBook;

public class PDFReader extends EBookReader {
	public PDFReader(EBook book) {
		super(book);
	}

	public String read() {
        return this.book.read();
    }
}
