package uk.axone.devintest.abstractclasses;

public class Car extends Vehicle{

    //Car extends means Car is a child of Vehicle
    //using the keyword super to access Vehicle class which is abstract
    //any class using keyword extends must be overriden
   public Car(String make){
       super(make);
    }

    @Override
    public int getNumWheels() {
        return 4;
    }

    @Override
    protected String getFuelType() {
        return "Petrol";
    }

    @Override
    boolean isElectric() {
        return false;
    }
}
