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
public class Biography extends Book {
     private String subject;
     public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public Biography (Book book, String subject){
        super (book.getTitle(),book.getNumberOfPages(),book.getAuthor());
        this.subject = subject;
    }

    public Biography(String subject, String title, int numberOfPages, String name, String address, String email) {
        super(title, numberOfPages, name, address, email);
        this.subject = subject;
    }

    public Biography(String subject, String title, int numberOfPages, Author author) {
        super(title, numberOfPages, author);
        this.subject = subject;
    }

    
    @Override
    public String toString(){
        return super.toString() + "Subject: " + getSubject();
    }
    
}

