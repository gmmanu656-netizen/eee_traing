package com.basics.oppsPillars.single;

public class Library {
    String name;
    int id;

    public Library(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class Book extends Library{
    double price;
    Book(String name, int id, double price){
        super(name, id);
        this.price = price;
    }
    void bookDetails(){
        System.out.println(name + " " + id + " " + price);
    }

    static void main() {
        Book book = new Book(" PG IS Monster" ,13452,150);
        book.bookDetails();
    }


}

