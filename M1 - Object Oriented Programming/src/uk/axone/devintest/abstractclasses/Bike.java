package uk.axone.devintest.abstractclasses;

public class Bike extends Vehicle {
    @Override
    public int getNumWheels() {
        return 2;
    }

    @Override
    protected String getFuelType() {
        return "Perol";
    }

    @Override
    boolean isElectric() {
        return true;
    }
}
