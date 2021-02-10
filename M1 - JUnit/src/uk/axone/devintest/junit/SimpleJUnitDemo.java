package uk.axone.devintest.junit;

import org.junit.Ignore;
import org.junit.Test;

public class SimpleJUnitDemo {

    @Test
    public void test1(){
        startTest();
        System.out.println("Running Test1");
    }

    @Test  //annotation
    public void test2(){
        startTest();
        System.out.println("Running Test2");
    }

    @Ignore  // this will ignore this particular test and run the rest of the class
    public void test3(){
        startTest();
        System.out.println("Running Test3");
    }

    private void startTest(){
        System.out.println("Starting Test");
    }

}
