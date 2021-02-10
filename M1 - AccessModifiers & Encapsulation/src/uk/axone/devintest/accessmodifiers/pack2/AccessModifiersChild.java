package uk.axone.devintest.accessmodifiers.pack2;

import uk.axone.devintest.accessmodifiers.pack1.AccessModifiers;

public class AccessModifiersChild extends AccessModifiers {

    void checkProtectedAccess(){
        protectedMethod();
        n = 123;
    }

    void checkDefaultAccess(){
        //defaultMethod();
       // flag = true;
    }

    void checkPublicAccess(){
        publicMethod();
        str = "Dev in Test";
    }

}
