package com.netmind.pojos.books;

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

    public void printCurrentPage(){
        System.out.println("Current page content");
    }
}

