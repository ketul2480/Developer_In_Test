package uk.axone.devintest.exceptions;

public class Voter {

    private int age;
    //this method throws InvalidAgeException
    public void setAge(int age) throws InvalidAgeException {
        if (age <= 18) {
            throw new InvalidAgeException("too young to vote");
        }
        else if (age > 120) {
            throw new InvalidAgeException("cant live this long");
        }
        else {
    //if the above 2 methods are false than you a happy with the age and setting the age
            this.age = age;
        }

    }

    public int getAge(){
            return age;
        }

}
