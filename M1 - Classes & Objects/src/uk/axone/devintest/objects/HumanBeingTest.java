package uk.axone.devintest.objects;

public class HumanBeingTest {

    public static void main(String[] args) {

        HumanBeing ketul = new HumanBeing("ketul");
        ketul.eyeColour ="Black";
        ketul.gender = "Male";

        System.out.println(ketul.eyeColour);

        //static variables and methods can be accessed using an instance, but its not recommended.
        //System.out.println(ketul.numLegs);

        //static variables and methods should always be accessed directly using the class name.
        ////constants are always written in UPPERCASE WITH UNDERSCORE
        System.out.println(HumanBeing.NUM_EYES);
        System.out.println(HumanBeing.NUM_FINGERS);
        HumanBeing.run();
        //HumanBeing ketul = new HumanBeing("ketul") , "male");
    }
}
