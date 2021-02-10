package uk.axone.devintest.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        /*TreeSet - Does NOT allow null
                  - Does NOT allow duplicates
                  - Arranges elements in alphabetical order( ascending order )
         */

        Set<String> countries = new TreeSet<>();//TreeSet IS A Set
        countries.add("UK");
        countries.add("UK");
        countries.add("UK");
        countries.add("France");
        countries.add("Spain");

        countries.add("Germany");
        countries.add("Germany");
        countries.add("Germany");

        for (String country : countries) {
            System.out.println(country);
        }

        System.out.println("---------------");

        Set<Book> myBooks = new TreeSet<>(); //IS-A relationship - TreeSet IS-A Set
        myBooks.add(new Book(123,"I love JAVA"));
        myBooks.add(new Book(345,"Selenium is cool"));
        myBooks.add(new Book(456,"Cucumber is cook"));

        //using for each loop
        for(Book bk : myBooks) {
            System.out.println(bk.getBookID() + "------" + bk.getBookName());
        }
    }

}
