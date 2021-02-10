package uk.axone.devintest.datatypes;

import java.io.File;

public class DataTypes {

    //Primitive Datatypes

    //Numeric - integers
    byte myByte = 127;
    short myShort = -32234;
    int myInt = 34567;
    long myLong = 789456123789L;

    //Numeric - Floating point
    float myFloat = 10.789456F;// 32 bit number - 7 decimal places
    double myDouble = 789.7894561234567894;//64 bit number - 16decimal place
    //BigDecimal - class is sued for currency calculations

    char myChar = 'A'; // always use single quotes
    boolean bool1 = true;
    boolean bool2 = false;

    //Reference Datatypes
    //Classes from the Java API Library
    String str = new String("Axone");
    File myFile = new File("readme.txt");


    Employee ketul = new Employee();
    Employee ami = new Employee();

}
