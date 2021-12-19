/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edwar
 */
public class Book {
    private String bookName;
    private int pages;
    private int publicationYear;
    
    public Book(String name, int pages, int year) {
        this.bookName = name;
        this.pages = pages;
        this.publicationYear = year;
    }
    
    public String getName() {
        return this.bookName;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public int getPublicaitonYear() {
        return this.publicationYear;
    }
    
    @Override
    public String toString(){
        return this.bookName + ", " + this.pages + " pages, " + this.publicationYear; 
    }
}
