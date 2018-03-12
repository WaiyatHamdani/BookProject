/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Books;

import javax.swing.JOptionPane;

/**
 *
 * @author waiya
 */
public class TestBooks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String[] choices={"Novel","Textbook" , "Biography"};
       String input = (String) JOptionPane.showInputDialog(null,"Choose type of book and author","author and book", 
                            JOptionPane.QUESTION_MESSAGE,null,choices,choices[0]);
     //http://www.java2s.com/Tutorial/Java/0240__Swing/Todisplaysadialogwithalistofchoicesinadropdownlistbox.htm
     
     while (input!=null){
        
      switch (input) {
                 case "Novel":
                     String genre = JOptionPane.showInputDialog("Enter the genre of the novel");  
                     Novel novel = new Novel( inputBook(),genre); 
                     
                     break;
                     
                     
                 case "Textbook":
                     int grade = Integer.parseInt(JOptionPane.showInputDialog("Enter the textbook grade"));
                     Textbook textbook = new Textbook( inputBook(),grade); 
                     
                     break;
                     
                     
                 case "Biography":
                     String suject = JOptionPane.showInputDialog("Enter the name of the biography");
                     Biography biography = new Biography( inputBook(),suject); 
                     break;
                 
                 default:
                     break;
             }
    
    
      input = (String)JOptionPane.showInputDialog(null, "Choose book or author",
        "Choose the book and author", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]); 

      
        
    }
    
    JOptionPane.showMessageDialog(null,"end program ", "End program message", JOptionPane.INFORMATION_MESSAGE);
    
    }

    public  static Author inputAuthor(){
      String name = JOptionPane.showInputDialog("Enter name of the authors name");
      String address = JOptionPane.showInputDialog("Enter home adress of the author");
      String email = JOptionPane.showInputDialog("Enter an email of the author");
      Author author = new Author (name, address, email);
      return  author;
       // input type of Author     
  }
    
    
  public  static Book inputBook() {
      String title = JOptionPane.showInputDialog("Enter the title of the boook");
      int numberOfPages = Integer.parseInt(JOptionPane.showInputDialog("Enter number of pages" ));
     
      return (new Book(title, numberOfPages,inputAuthor()) ); // input type of Book
      
        }
  
   
}

