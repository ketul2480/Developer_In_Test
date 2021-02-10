package uk.axone.devintest.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> countries = new HashSet();   //HashSet IS A Set
        /*
        HashSet- does NOT store Duplicates
               - does Not maintain insertion order
               - Allows null
         */
        countries.add("UK");
        countries.add("UK");
        countries.add("UK");
        countries.add("France");
        countries.add("Spain");
        countries.add(null);
        countries.add(null);
        countries.add("Germany");
        countries.add("Germany");
        countries.add("Germany");

        for (String country : countries) {
            System.out.println(country);


        }
    }

}
