package uk.axone.devintest.junit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SimpleJUnitDemo.class,
        AppUtilTest.class,
        JUnitFunctionalTest.class
})

public class JUnitRunner {


}
