package uk.axone.devintest.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        //Primitive datatypes are NOT allowed in Collection Classes
        //ArrayList<int> numbers = new ArrayList<();

        /*
        PRIMITIVE DATATYPES                     WRAPPER CLASSES ( java.lang package)
        -int                                    Integer
        -float                                  Float
        -double                                 Double
        -long                                   Long
        - byte                                  Byte
        -short                                  Short
        -char                                   Character
        -boolean                                Boolean
         */

        int i = 23;
        Integer num = i; //Changing Primitive to Reference Data Type - Auto-boxing

        int x = num.intValue(); //Changing Reference to Primitive data type - Auto-Unboxing

        char ch ='A';
        Character chr = ch;
        char ch1 = chr.charValue();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        for(Integer numb : numbers){
            System.out.println(numb);
        }

        //List is an interface and ArrayList is an implementing class
        //ArrayList implements the List interface
        List<Book> myBooks = new ArrayList<>(); //IS-A relationship - ArrayList is a List
        myBooks.add(new Book(123,"I love JAVA"));
        myBooks.add(new Book(345,"Selenium is cool"));
        myBooks.add(new Book(456,"Cucumber is cook"));

        for(Book bk : myBooks){
            System.out.println(bk.getBookID() +"------" + bk.getBookName());
        }

    }
}
