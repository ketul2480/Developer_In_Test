package uk.axone.devintest.abstractclasses;

public class VehicleTest {

    public static void main(String[] args) {

    //abstract classes cannot be instantiated (initialised)
    //but Child class can be instantiated (initialised)
    // Vehicle myVeh = new Vehicle();

        Car myCar = new Car("BMW");
        myCar.moveForward();
        myCar.getFuelType();
        myCar.getNumWheels();
        myCar.isElectric();

        // "is a" relationship
        // car is a Child of Vehicle class
        Vehicle myVeh = new Car("BMW");
        Vehicle myVh = new Bike();

    }
}
