package uk.axone.devintest.interfaces;

public class BankTest {

    public static void main(String[] args) {

        HSBC highStreet = new HSBC("40-42-50");
        highStreet.depositCash(1000);
        highStreet.withdrawCash(500);
        highStreet.processMortgage();
        highStreet.applyLoan();

        //An Interface cannot be instantiated
        //Bank myBank = new Bank();

        Bank myBank = new HSBC("40-42-50");
        myBank.depositCash(123456);
        myBank.withdrawCash(20);

    }
}
