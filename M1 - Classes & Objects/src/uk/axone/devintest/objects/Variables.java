package uk.axone.devintest.objects;

public class Variables {

    /* Global Variables - Declared outside of methods and constructors
                        - they can be used throughout the class
                      1) Instance Variables - non static
                      2) Class variables  - static
     */

    //Instance variables
    String str;
    HumanBeing ketul;
    Employee ketul1;
    int k;

    //Class variables
    static String name;
    static Employee ketul2;
    static int i;
    static HumanBeing ami;

    /* Local variables - scope is limited to within the method or the constructor
        1) variables declared in a method or a constructor
        2) arguments passed method and constructor
     */

    int doSomething(int numTimes){
        i = 10;
        int j = 20;
        String strM = "doing something";
        return j;
    }

    void doSomethingElse(){
        i = 30;
        str = "java";
        name = "Axone";
        //Static Variable can only be global , we cannot declare static variable in a method
        //static String course = "Dev in Test";
    }

}

