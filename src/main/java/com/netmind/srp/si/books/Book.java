package com.netmind.srp.si.books;

public class Book {
    private int currentPage=1;
	public String getTitle(){
        return "A Great Book";
    }

    public String getAuthor(){
        return "John Doe";
    }

    public void turnPage(){
        this.currentPage++;
    }

    public String getCurrentPage(){
        return "current page content";
    }
}
