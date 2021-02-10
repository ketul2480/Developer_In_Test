package uk.axone.devintest.inheritance;

public class PhoneTest {

    public static void main(String[] args) {
        //by creating mpf instance of MobilePhone class we can access Phone class methods
        //to invoke the method - type instance"mpf" followed by the .dot(method)
        /*MobilePhone mpf = new MobilePhone();
        Phone ph1 = new Phone();
        mpf.makeCall(123);
        mpf.receiveCall();
        mpf.sendSMS();

        SmartPhone spf = new SmartPhone();
        spf.makeCall(123);
        spf.receiveCall();
        spf.sendSMS();
         */

        //when initialising any child class will also invoke all parent class contructors
        SmartPhone iphone = new SmartPhone();
        iphone.receiveCall();
        iphone.makeCall(123);

        Phone myPhone = new MobilePhone();
        myPhone.makeCall(123);
        myPhone.receiveCall();
    }
}
