package uk.axone.devintest.abstractclasses;

    //an abstract class can have abstract and non-abstract methods
public abstract class Vehicle {

    String make;

    public Vehicle(){

    }

    public Vehicle(String make){
        this.make = make;

    }

    public Vehicle(int numWheels){

    }

    //Abstract methods must use the keyword abstract
    public abstract int getNumWheels();
    protected abstract String getFuelType();
    abstract boolean isElectric();

    //Non-abstract methods
    void moveForward(){
        System.out.println(make +"  is  Moving Forward");
    }
    void accelerate(){
        System.out.println(make +      "is Accelerating");
    }

    static void honk(){

    }

    public static void main(String[] args) {
        Vehicle.honk();

    }
}
