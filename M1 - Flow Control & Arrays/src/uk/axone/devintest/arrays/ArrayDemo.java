package uk.axone.devintest.arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        //initialising an array of 4 strings
        String[] strArr = new String[4];

        strArr[0] = "Selenium";
        strArr[1] = "Cucumber";
        strArr[2] = "Protractor";
        strArr[3] = "Appium";

        String[] tools = {"Selenium", "Cucumber", "Protractor", "Appium"};
              tools[4] = "new tools";


                // index 0,  1,  2,  3,  4
        int[] number = {10, 20, 30, 40, 50};
        System.out.println(number[1]);
    }

}
