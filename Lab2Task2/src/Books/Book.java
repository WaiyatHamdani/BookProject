/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Books;

/**
 *
 * @author waiya
 */
public class Book {
    private String title;
    private int numberOfPages;
    private Author author;

    public Book(String title, int numberOfPages, String name, String address, String email ) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author.setNameAuthor(title);
        this.author.setAddress(address);
        this.author.setEmail(email);
        
    }

    public Book(String title, int numberOfPages, Author author) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
    @Override
    public String toString(){
        return "Title of the book: " + "'" + getTitle()+ " Number of pages:" + getNumberOfPages()+ getAuthor().toString();
    }
    
}

