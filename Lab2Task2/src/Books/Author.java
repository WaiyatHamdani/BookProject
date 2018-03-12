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
public class Author {
      private String nameAuthor;
     private String address;
     private String email;
     
       public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     public Author(String nameAuthor, String address, String email) {
        this.nameAuthor = nameAuthor;
        this.address = address;
        this.email = email;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

     @Override
    public String toString(){
        return "Author name: " + getNameAuthor() + "Address: " + getAddress() + "Email: " + getEmail();
    }
    
}

