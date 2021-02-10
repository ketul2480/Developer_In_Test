package uk.axone.devintest.junit;

import org.junit.*;
import org.junit.runners.MethodSorters;


//this will run the Tests sequel
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class JUnitFunctionalTest {

    /*
    login
    book a ticket
    check in
    cancel ticket
    logout
     */

    //gets run only once at the beginning of the class( before any tests are run)
    @BeforeClass
    public static void loadTestData(){
        //clear old data
        // load new data for checkin and cancel
        System.out.println("Loading Test data");
    }

    //will run at the beginning of every test
    @Before
    public void login(){
        System.out.println("Logging into the appication");
    }

    @Test
    public void A_book_a_Ticket(){
        System.out.println("Booking a Ticket");
    }

    @Test
    public void B_checkIn(){
        System.out.println("Checking In");
    }

    @Test
    public void C_cancel(){
        System.out.println("Cancelling a Ticket");
    }

    //will run at the end of every test
    @After
    public void logout(){
        System.out.println("Logging out of the application");
    }

    //will only run once at the end of the class
    @AfterClass
    public static void tearDown(){
        //close connections
        System.out.println("Tidying up....");
    }
}
