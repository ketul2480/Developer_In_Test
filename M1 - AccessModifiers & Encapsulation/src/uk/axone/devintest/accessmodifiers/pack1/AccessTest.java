package uk.axone.devintest.accessmodifiers.pack1;

public class AccessTest {

    public static void main(String[] args) {

        AccessModifiers accMod = new AccessModifiers();
        //private methods and private variables cannot be accessed outside of the class they are defined in
        //accMod.privateMethod();
        //accMod.j=9;
        //accMod.strPri = "Axone";
        //System.out.println(strPri);

        accMod.defaultMethod();
        accMod.publicMethod();
        accMod.protectedMethod();
        accMod.n = 32;
    }
}
