package uk.axone.devintest.strings;

public class StringDemo {
    public static void main(String[] args) {

        //initialising String Class
        String str = new String();
        //Array of a String
        //String[] chrArr = {"A","x","o","n","e"};
        //String str1 = new String(chrArr);
        String str2 = new String("Axone");

        //String literal style initialising
        String strl = "Axone";

        strl.concat(" Technologies");
        strl.concat(" UK");
        strl.concat(" LTD");
        System.out.println("...");
        System.out.println(strl);

        //String Class is immutable (non-changeable)
        //once initialising a string class will create an object in a heap memory,
        //Every time you change the value of that instance it will create a new object in a heap memory

        //StringBuffer class is mutable
        StringBuffer sb = new StringBuffer();
        StringBuilder sBuff = new StringBuilder("Axone");
        sBuff.append(" Tech");
        sb.append(" LTD");
        System.out.println(sBuff);
        System.out.println(sb);
        }
    }



