package uk.axone.devintest.inheritance;

public class Phone {

    Phone(){
        System.out.println("Phone Constructor");
    }

    private String make;
    private String model;
    private int num;

    public Phone(String make) {

    }

    void makeCall(int calledNum) {
        System.out.println(make + "phone is making a call");
    }

    void receiveCall(){
        System.out.println(make + "phone is receiving call");
    }

    //Overloading receiveCall method
    //Overloading happens in the same class
    void receiveCall(int num){

    }
    void receiveCall(String str){

    }
}
