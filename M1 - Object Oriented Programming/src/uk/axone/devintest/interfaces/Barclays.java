package uk.axone.devintest.interfaces;

//here Barclays is implimenting only one interface (Bank)
public class Barclays implements Bank {

    @Override
    public void depositCash(int amount) {

    }

    @Override
    public boolean withdrawCash(int amount) {
        return false;
    }

    @Override
    public int checkBalance() {
        return 0;
    }

    public int showBalance(){
        //code
        return 0;
    }

    @Override
    public String getCompanyNum() {
        return null;
    }

    @Override
    public int getVATNum() {
        return 0;
    }

    @Override
    public String getFACode() {
        return null;
    }
}
