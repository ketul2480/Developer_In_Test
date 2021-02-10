package uk.axone.devintest.operators;

public class OperatorDemo {

    //score between 0 and 30 = No Grade
    //score between 30 and 60 = Grade C
    //score between 60 and 80 = Grade B
    //score between 80 and 100 = Grade A
    //score Less than 0 or greater than 100 = invalid score

    public static void main(String[] args) {

        int score = 90;
        if(score>=0 && score < 30){
            System.out.println("No Grade");
        }
        if(score>=30 && score < 60){
            System.out.println("Grade C");
        }
        if(score >=60 && score <80){
            System.out.println("Grade B");
        }
        if(score >=80 && score <=100){
            System.out.println("Grade A");
        }
        if(score <=0 || score >100){
            System.out.println("invalid score");
        }
    }


}
