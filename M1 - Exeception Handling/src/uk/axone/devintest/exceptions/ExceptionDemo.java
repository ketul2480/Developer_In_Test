package uk.axone.devintest.exceptions;

public class ExceptionDemo {

    public static void main(String[] args) {

        System.out.println("_____START_____");
        int x = 10;
        int y = 2;

        try {
            int z = x / y;

            String strArr[] = new String[3];
            String str = strArr[6];
        }

        catch(ArithmeticException exp){
            System.out.println("Div by zero is not allowed");
        }

        catch (ArrayIndexOutOfBoundsException arrEx){
            System.out.println("Something wrong accessing the Array");
        }
        catch (Exception ex){
            System.out.println("Something went wrong");
        }

        finally {
            System.out.println("Inside finally block");
        }
        System.out.println("_________END____________");
    }
}
