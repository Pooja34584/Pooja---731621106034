package com.Pooja;

import  java.util.*;
class Book {
    private String title;
    private String author;
    private int ISBN;
    public Book(String title,String author,int ISBN){
       this.title = title;
       this.author = author;
       this.ISBN = ISBN;
      }
     public String getTitle() {
       return title;
     }
     public void setTitle(String title){
         this.title = title;
     }
     public String getAuthor(){
        return author;
     }
     public void setAuthor(String author){
        this.author = author;
     }
     public int getISBN(){
        return ISBN;
     }
     public void setISBN(int ISBN){
        this.ISBN = ISBN;
     }
 } 
 public class Advertise {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String tit = sc.nextLine();
       String auth = sc.nextLine();
       int isbn = sc.nextInt();
       Book myBook = new Book(tit,auth,isbn);
       System.out.println("Title :" + myBook.getTitle());
       System.out.println("Author :" + myBook.getAuthor());
       System.out.println("ISBN :" + myBook.getISBN());
       myBook.setTitle("Animal");
       myBook.setAuthor("George");
       myBook.setISBN(56);
       System.out.println("Updated Title :" + myBook.getTitle());
       System.out.println("Updated Author :" + myBook.getAuthor());
       System.out.println("Updated ISBN :" + myBook.getISBN());
   }
}