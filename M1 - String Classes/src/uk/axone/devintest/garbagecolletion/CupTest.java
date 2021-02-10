package uk.axone.devintest.garbagecolletion;

public class CupTest {

    public static void main(String[] args) {

        Cup c1 = new Cup("Red");
        Cup c2 = new Cup("Green");
        Cup c3 = new Cup("Blue");

        c1 = c2;
        c2 = c3;
        c3 = c1;

        System.out.println(c3.getColour());

        //once changing c4 to null it will no longer be referenced as colour Black
        //object Black will become stale in the heap memory with no reference
        //Garbage collection will eventually get rid of that object which has no reference(Stale)
        Cup c4 = new Cup("Black");
        c4 = null;

    }
}
