package uk.axone.devintest.junit;

import org.junit.Assert;
import org.junit.Test;

public class AppUtilTest {

    //making AppUtils a global vairable ( Creating instance of a class )
    AppUtils appUtils = new AppUtils();

    @Test // annotation
    public void add_test1(){
        int actResult = appUtils.add(10,20);
        int expResult = 20;
        Assert.assertEquals(expResult, actResult);
    }

    @Test  //annotation
    public void multiply_test2(){
        int actResult = appUtils.multiply(10,20);
        int expResult = 200;
        Assert.assertEquals(expResult, actResult);

    }
}
