package uk.axone.devintest.objects;

public class HumanBeing {

    //instance variables, also called as non-static variables
    String name;
    String gender;
    int age;
    int height;
    String eyeColour;
    String bloodGp;

    //Class variables, also known as static-variables
    //final static means its a constant , it does not change the value
    //constants are always written in UPPERCASE WITH UNDERSCORE
    final static int NUM_EYES = 2;
    final static int NUM_LEGS = 2;
    final static int NUM_FINGERS = 10;

    HumanBeing(String name){
        this.name = name;
        breathe();

    }
    HumanBeing(String name, String gender){
        name = name;
        this.gender = gender;
        breathe();

    }

    void breathe(){
        System.out.println(name + " is breathing");
    }

    //THIS IS NON STATIC METHOD
    //to access non-static method you always need an instance
    void sleep(){
    }
    void eat(){
    }
    void walk(){
    }

    // METHOD OVERLOADING - multiple methods with same name but different argument
    void talk(){

    }
    void talk(String talking){

    }
    void talk(int loudness){

    }
    void talk(String talking, int loudness){

    }
    void talk(int loudness, String talking){

    }

    // THIS IS STATIC METHOD, using the key word static.
    //static method
    static void run(){
        //only static variables can be used in a static method
        //instance variables cannot be used in a static method
        System.out.println("HumanBeing is running" + NUM_LEGS);
    }

    public static void main(String[] args) {
        //name is an instance variable - cannot be used in static method
        //System.out.println(name);
        //NUM_LEGS is a static variable - can be used in static method
        System.out.println(NUM_LEGS);

    }
}
