package com.netmind.pojos.readers;

import com.netmind.srp.books.EBook;

public abstract class NewEBookReader2 {
	protected EBook book;
	 
    public NewEBookReader2(EBook book){
    	this.book = book;
    }
 
    public abstract String read();
}
