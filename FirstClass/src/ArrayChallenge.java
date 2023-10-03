//public class ArrayChallenge {
//    public static void main(String[] args){
//        int[] age = new int[5];
//        age[0] = 5 ;
//        age[1] = 10 ;
//        age[2] = 15 ;
//        age[3] = 25 ;
//        age[4] = 30 ;
//        int i;
//
//        for (i = 0; i < age.length; ++i){
//            System.out.println(age[i]);
//        }
//
//        int [][] a = {
//                {1,2,3},
//                {4,5,6,9},
//                {7},
//        };
//
//
//
//    }
//
//}
//
//
//
//
//
//
//
//
//
//import java.util.InputMismatchException;
//        import java.util.Scanner;
//
//class Book{
//    String nameOfBook;
//    String authorFirstName;
//    String authorLastName;
//    String genre;
//    String ISBN;
//    String publishDate;
//    String price;
//}
//
//class Library {
//
//    String [] customerArray;
//    String date;
//    boolean inStock;
//
//    Book [] Books;
//
//
//
//
//    String GetBookTitle(String identifier) {
//        for(Book book : Books){
//            if(book.ISBN == identifier) {
//                return book.nameOfBook;
//            }
//            //search through book array for identifier (ISBN)
//        }
//        return "Did not find book";
//        //if can't find it, return "Can't find it"
//        //else return the nameOfBook from Book class
//
//    }
//    void AddNewBook() {
//
//    }
//    void RemoveFromInventory() {
//
//    }
//    boolean OrderNewBook(){
//
//    }
//    void StockBook(){
//
//    }
//    String CheckoutMethod(){
//
//    }
//
//
//    public static void main(String[] args) {
//
//        Library myLib = new Library();
//        myLib.RemoveFromInventory();
//    }
//}
