package librarycatalogue;

import java.util.HashMap;
import java.util.Map;

public class Book {

    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut;



    //Getters
    public String getTitle(){
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }

    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }

    public Book(String bookTitle, int bookPageCount, int bookISBN){
        this.title = bookTitle;
        this.pageCount= bookPageCount;
        this.ISBN = bookISBN;
        isCheckedOut = false;
    }



    //Setters
    public  void  setisCheckedOut(boolean newIsCheckedOut, int currentDayCheckedout){
        this.isCheckedOut = newIsCheckedOut;
        setdayCheckedOut(currentDayCheckedout );
    }

    //Setters
    private  void  setdayCheckedOut(int day){
        this.dayCheckedOut = day;

    }

}
