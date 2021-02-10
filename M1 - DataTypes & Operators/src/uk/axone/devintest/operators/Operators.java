package uk.axone.devintest.operators;

public class Operators {

    public static void main(String[] args) {

        int x= 10;
        int y=20;

        //Arthmetic Operators
        int z = x+y; //Addition
        int a = x-y; //Substraction
        int b = x*y; //Multiplication
        int c = x/y; //Division
        int d = x%y; //Modulus 3 % 2 = 1;   15 % 3 = 0;   7 % 3 = 2;

        //Assignment Operators
        int k = 4;
        int m = 3;
        k += m; // k = k + m;
        k -= m; // k = k - m;
        k *= m; // k = k * m;
        k /= m; // k = k / m;

        //Incriment Operators
        x = 9;
        y = 10;

        System.out.println(x++); // x = x + 1; // post increment operator - value is incremented and available in the next statement
        System.out.println(x);

        System.out.println(++y); // y = y + 1// pre increment // pre-increment // pre-increment operator - value is incremented and available in the same statement
        System.out.println(y);

        //decrement operators
        x--; // x = x - 1 - post decrement
        --y; // y = y - 1 - pre decrement

        System.out.println("----------------------------------");

        x = 10;
        y = 20;
        // Comparison Operators
        boolean result = x == y; // Comparing x and y for equality
        System.out.println(result);

        boolean result2 = x != y; // comparing x and y for inequality
        System.out.println(result2);
        // both the above should ONLY be used with primitive datatypes

        //              ! = NOT
        //              && = AND
        //              || = OR

        //Numeric data types ONLY
        System.out.println(x>y);
        System.out.println(x<y);
        System.out.println(x>=y);
        System.out.println(x<=y);




    }

}
