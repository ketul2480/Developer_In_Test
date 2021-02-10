package uk.axone.devintest.inheritance;

public class MobilePhone extends Phone{

   public MobilePhone(){
        System.out.println("MobilePhone Constructor");
    }

   public MobilePhone(String make){
       super(make);
       System.out.println("MobilePhone Constructor 2");
   }

    void doSomething(){
        //Child class can invoke method from Parent class without creating an instance
        makeCall(456);
        receiveCall();
    }

    //override
    //when overriding any method it has to be the same signature
    //use "@Override" anotation will check for the exact signature when overriding,followed by the method
    @Override
    void makeCall(int calledNum){

        System.out.println("Mobile phone is making call");
    }

    void sendSMS(){
        //super keyword is used to invoke method from Parent class
        //it is also used for chaining contructors
        super.makeCall(123);
        System.out.println("Mobile Phone is sending SMS");
    }

}
