package com.netmind.pojos.books;

public class NewBook {
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