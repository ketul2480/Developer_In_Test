package uk.axone.devintest.accessmodifiers.pack2;

import uk.axone.devintest.accessmodifiers.pack1.AccessModifiers;

public class AccessTest2 {

    public static void main(String[] args) {
        AccessModifiers accMod = new AccessModifiers();
        //accMod.privateMethod();
        //accMod.defaultMethod();
        //accMod.protectedMethod();
        accMod.publicMethod();
    }
}
