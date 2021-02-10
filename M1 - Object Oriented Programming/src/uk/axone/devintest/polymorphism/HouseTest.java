package uk.axone.devintest.polymorphism;

import uk.axone.devintest.abstractclasses.Bike;
import uk.axone.devintest.abstractclasses.Car;
import uk.axone.devintest.inheritance.SmartPhone;
import uk.axone.devintest.interfaces.Barclays;
import uk.axone.devintest.interfaces.HSBC;

public class HouseTest {
    public static void main(String[] args) {

        House ramsH = new House();
        ramsH.setName("Oak View");
        ramsH.setIsFlat(false);
        ramsH.setNumRooms(3);

        ramsH.setVehicle(new Car("Audi"));
        ramsH.setBank(new HSBC("12313131"));

        House tomsH = new House();
        tomsH.setName("mount View");
        tomsH.setIsFlat(true);
        tomsH.setNumRooms(5);

        tomsH.setPhone(new SmartPhone());
        tomsH.setVehicle(new Bike());
        tomsH.setBank(new Barclays());


    }
}
