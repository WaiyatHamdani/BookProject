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
public class Textbook extends Book {
     private int gradeLavel;
    
      public int getGradeLavel() {
        return gradeLavel;
    }

    public void setGradeLavel(int gradeLavel) {
        this.gradeLavel = gradeLavel;
        
      
    }
    
    public Textbook (Book book, int grade) {
        super (book.getTitle(), book.getNumberOfPages(), book.getAuthor());
        this.gradeLavel = grade;
    }

    public Textbook(int gradeLavel, String title, int numberOfPages, String name, String address, String email) {
        super(title, numberOfPages, name, address, email);
        this.gradeLavel = gradeLavel;
    }

    public Textbook(int gradeLavel, String title, int numberOfPages, Author author) {
        super(title, numberOfPages, author);
        this.gradeLavel = gradeLavel;
    }

    
          @Override
    public String toString(){
       return super.toString() + "\nGrade Level: " + getGradeLavel();
   }
}
