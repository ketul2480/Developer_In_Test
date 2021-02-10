package uk.axone.devintest.chapter1;

//These are import statements
import java.io.File;
import java.util.Calendar;

/**
 * These are javadoc comments
 * this is used to create the API spec
 *
 */
public class MyClass {

    // x and y are variables with 10 and 20 as their values
    int x = 10;//declaring a variable called x & y of the type int and initialising the value at 10 & 20
    int y = 20;

    /*
    this is a block comment
    which comments multiple lines in one go
    all lines are commented
     */

    //Constructor
    /*
    1- Same name as your class
    2- No return type
     */
    MyClass(){
        System.out.println("invoking constructor--1");
    }

    MyClass(String str){
        System.out.println("invoking constructor--2");
    }

    MyClass(int number){
        System.out.println("invoking constructor--3");
    }


    String str = "Axone";
    File fl;
    Calendar cal;

    void add(){
        int z = x + y;
        System.out.println("add method--"+z);
    }

    void multiply(int a, int b){
        int c = a * b;
        System.out.println("multiply method--"+c);
    }

    int divide (int k, int l){
        int z = k / l;
        System.out.println("Divide method--"+z);
        return z;
    }

    public static void main(String[] args) {
        System.out.println("starting execution");

        MyClass myc = new MyClass(456);//creating an instance of the class
        myc.add();//myc is an instance of MyClass
        myc.multiply(4,5);
        myc.divide(10,5);


    }
}
