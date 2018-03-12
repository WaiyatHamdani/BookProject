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
public class Novel extends Book {
      private String genre;
    
      public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
      public Novel (Book book, String genre){
        super (book.getTitle(),book.getNumberOfPages(),book.getAuthor());
        this.genre = genre;
    }
    

    public Novel(String title, int numberOfPages, String name, String address, String email) {
        super(title, numberOfPages, name, address, email);
    }

    public Novel(String genre, String title, int numberOfPages, Author author) {
        super(title, numberOfPages, author);
        this.genre = genre;
    }

    
    @Override
   public String toString(){
       return super.toString() + "Genre: " + getGenre();
   }
}
