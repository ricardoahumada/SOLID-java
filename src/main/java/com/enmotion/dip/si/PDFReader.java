package com.enmotion.dip.si;

import com.enmotion.srp.books.EBook;

public class PDFReader extends EBookReader {
	public PDFReader(EBook book) {
		super(book);
	}

	public String read() {
        return this.book.read();
    }
}
