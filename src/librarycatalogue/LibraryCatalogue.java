package librarycatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    Map<String, Book> bookCollection = new HashMap<String, Book>();
    int currentDay = 0;
    int lengthOfCheckout = 7;
    double feePerLateDay = 1;
    double initialLateFee = 0.50;

    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }

    public int getCurrentDay() {
        return this.currentDay;
    }

    public int getLengthOfCheckout() {
        return this.lengthOfCheckout;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public Book getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
    }
    public  void nextDay(){
        currentDay ++;
    }
    public void SetDay(int day){
        currentDay = day;
    }


    //Instance methods


    public void  checkOut(String title){

        Book book = getBook(title);
         if (book.getIsCheckedOut()){
             sorryBookAlreadyCheckedOut(book);
         }else {
             System.out.println("You just Checked out "+ title + ". It is due on day  "+ getCurrentDay() + getLengthOfCheckout() +".");
         }
    }

    public void returnBook(String title){
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckout());
        if (daysLate >0){
            System.out.println("You owe the library $" + (getInitialLateFee() + daysLate* getFeePerLateDay()) +" because your book is "+daysLate+" days overdue");
        }else{
            System.out.println("Book returned. Thank you");
        }
        book.setisCheckedOut(false,-1);
    }


    public void sorryBookAlreadyCheckedOut(Book book){
        System.out.println("Sorry, " + book.getTitle()+ " is already checked out. "+ "it should be back on day" +(book.getDayCheckedOut() + getLengthOfCheckout())+".");

    }



    public LibraryCatalogue(Map<String, Book> bookCollection, int currentDay, int lengthOfCheckout, double feePerLateDay, double initialLateFee) {
        this.bookCollection = bookCollection;
        this.currentDay = currentDay;
        this.lengthOfCheckout = lengthOfCheckout;
        this.feePerLateDay = feePerLateDay;
        this.initialLateFee = initialLateFee;
    }
}
