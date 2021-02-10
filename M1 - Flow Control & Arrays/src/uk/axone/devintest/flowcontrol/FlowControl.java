package uk.axone.devintest.flowcontrol;

public class FlowControl {

    //Given a day of the week
    //Mon, Tue, Wed - Print 'weekday'
    //Thu - Print 'Midweek'
    //Fri - Print "Thank God its Friday"
    //Sat or Sun - Print 'Weekend'

    void useIfElse(String day) {
        //instead of using "==" we are using ".equals" to compare two Strings
        // == is used to compare numbers

        if (day.equals ("Mon") || day.equals("Tue") || day.equals("Wed")) {
            System.out.println("Weekday");

        } else if (day.equals("Thu")) {
            System.out.println("Midweek");

        } else if (day.equals("Fri")) {
            System.out.println("Thank God its Friday");

        } else if (day.equals("Sat") || day.equals("Sun")) {
            System.out.println("Weekend");

        } else {
            System.out.println("Invalid data");
        }

    }

        void useSwitch(String day){
            switch(day) {
                case "Mon": System.out.println("Weekday");
                    break;
                case "Tue": System.out.println("Weekday");
                    break;
                case "Wed" : System.out.println("Weekday");
                    break;
                case "Thu" : System.out.println("MidWeek");
                    break;
                case "Fri": System.out.println("Thank God its Friday");
                    break ;
                case "Sat": System.out.println("Weekend");
                    break ;
                case "Sun": System.out.println("Weekend");
                    break ;
                default : System.out.println("invalid day");
            }

        }

    public static void main(String[] args) {

        FlowControl flc = new FlowControl();
        flc.useIfElse("Fri");
        flc.useSwitch("Thu");

    }
}

