package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        TreeSet<Book> treeSet= new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        treeSet.add(new Book("А.Пушкин", "Руслан и Людмила"));
        treeSet.add(new Book("А.Злостный", "Как победить в любой настольной игре"));
        treeSet.add(new Book("А.Дюма", "Три мушкетера"));
        treeSet.add(new Book("А.Дюма", "Королева Марго"));
        treeSet.add(new Book("None", "Юрик"));
        treeSet.add(new Book("В.Даль", "Толковый словарь русского языка"));
        treeSet.add(new Book("А.Злостный", "Как армяне в нарды перестали играть"));
        treeSet.add(new Book("А.Дюма", "Граф Монте-Кристо"));
        treeSet.add(new Book("В.Рубашкин", "Мужик с чуркой"));

        String iWantBookFrom = scanner.nextLine();
        Iterator<Book> iterator = treeSet.iterator();

        if (!iWantBookFrom.equals("print_all")){
            while (iterator.hasNext()){
                Book book = iterator.next();
                if (book.author.equals(iWantBookFrom))
                    System.out.println(book.name);
            }
        }else{
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }
}
