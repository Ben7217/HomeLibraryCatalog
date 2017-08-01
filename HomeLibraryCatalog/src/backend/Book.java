/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author BenMorrisRains
 */
public class Book {
    
    String title;
    String author;
    String genre; 
    String copyrightDate;
    String condition;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCopyrightDate() {
        return copyrightDate;
    }

    public void setCopyrightDate(String copyrightDate) {
        this.copyrightDate = copyrightDate;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Title:" + title + ":Author:" + author + ":Genre:" + genre + ":CopyrightDate:" + copyrightDate + ":Condition:" + condition;
    }

   
}
