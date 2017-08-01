/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import backend.Book;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author BenMorrisRains
 */
public class DataContainer {
    
    private ArrayList<Book> listOfBooks = new ArrayList<Book>();

    public DataContainer() {
    }

    public ArrayList<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(ArrayList<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }
    
    public void writeTextFile () {
        
        PrintWriter writer = null; 
        
        try {
            writer = new PrintWriter(("librarycatalog.txt")); 
            
            for (Book book : listOfBooks) {
                writer.println((book.toString()));
                
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage()); 
        } finally {
            
            writer.close();
        }
    }
    
    public void readTextFile () {
        
        try {
            boolean eof = false; 
            BufferedReader bw = new BufferedReader(new FileReader("librarycatalog.txt"));
            while (!eof) {
                String lineFromFile = bw.readLine(); 
                if (lineFromFile == null) {
                    eof = true; 
                    
                } else { 
                    String[] lineElements = lineFromFile.split(":"); 
                    Book book = new Book(); 
                    
                    if (lineElements[0].equals("Title")) {
                        book.setTitle(lineElements[1]);
                    }
                    if (lineElements[2].equals("Author")) {
                        book.setAuthor(lineElements[3]);
                    }
                    if (lineElements[4].equals("Genre")) {
                        book.setGenre(lineElements[5]);
                    }
                    if (lineElements[6].equals("CopyrightDate")) {
                        book.setCopyrightDate(lineElements[7]);
                    }
                    if (lineElements[8].equals("Condition")) {
                        book.setCondition(lineElements[9]); 
                    } else {
                        eof = true; 
                    }
                    listOfBooks.add(book); 
                } 
            }
        } catch (IOException exp) {
            System.out.println("Error " + exp);
        }
    }
}
