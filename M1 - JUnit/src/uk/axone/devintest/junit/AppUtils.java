package uk.axone.devintest.junit;

public class AppUtils {

    public int add(int x, int y){
        System.out.println("Adding "+ x + "and" + y);
        return x + y;
    }

    public int multiply(int x, int y) {
        System.out.println("Multiplying " + x + "and" + y);
        return x * y;
    }
}
