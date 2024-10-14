package Controller;
import Model.Book;
import Model.Member;

import javax.swing.*;

public class BookController {
    private Book bookArr[];
    private int currentSize;

    public BookController(int size){
        bookArr=new Book[size];
        currentSize=0;
    }

    public void add(Book book){
        if (bookArr.length>currentSize){
            bookArr[currentSize]=book;
            currentSize++;
        }
    }

    public void viewBookDetails(){
        for(int i=0;i<bookArr.length;i++){
            JOptionPane.showMessageDialog(null,bookArr[i].bookInfo());
        }
    }

}
