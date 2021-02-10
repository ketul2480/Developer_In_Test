package uk.axone.devintest.collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

    ArrayList<String> herbs = new ArrayList<>();

    herbs.add("Basil");
    herbs.add("Thyme");
    herbs.add("Mint");
    herbs.add("Rosemary");
    herbs.add("Rosemary");
    herbs.add("Rosemary");
    herbs.add("Rosemary");
    herbs.add(null);

    herbs.remove(1);    //this will remove
    herbs.add(0,"Coriander");    //this will add
    herbs.set(5,"Parsley");   // this will replace

    for(String hrb : herbs) {
        System.out.println(hrb);
    }
    }
}
