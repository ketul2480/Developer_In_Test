package uk.axone.devintest.accessmodifiers.pack1;

import java.io.File;
import java.io.FileInputStream;

public class AccessModifiers {

    //variables with public access
    public int i;
    public String str;
    public File f1;

    //variables with private access
    private int j;
    private String strPri;

    //variabnles with protected access
    protected int n;
    protected FileInputStream fis;

    //variables with default access
    int k;
    boolean flag;
    StringBuffer sbuff;

    //public method
    public void publicMethod(){

    }

    //protected method
    protected void protectedMethod(){

    }

    //default method
    void defaultMethod(){

    }

    //private method
    private void privateMethod(){

    }

}
