package com.company;

public class Book implements Comparable {
    String author;
    String name;

    public Book(String author, String name){
        this.author = author;
        this.name = name;
    }

    @Override
    public String toString() {
        return author + " ---> " + name;
    }

    public void findBook(String athor){

    }

    @Override
    public int compareTo(Object o) {
        Book compareBook = (Book)o;
        if ((author.equals(compareBook.author))){
            return name.compareTo(compareBook.name);
        }else{
            return author.compareTo(compareBook.author);
        }
    };
}
