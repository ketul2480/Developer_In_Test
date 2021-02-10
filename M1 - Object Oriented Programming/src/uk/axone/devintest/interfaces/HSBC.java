package uk.axone.devintest.interfaces;

//here hsbc is implimenting two interfaces (Bank & UKSec)
public class HSBC implements Bank, UKSecStandards {

    String sortCode;
    int accNum;

    public HSBC(String sortCode){
        this.sortCode = sortCode;
    }

    @Override
    public void depositCash(int amount) {
        //code
    }

    @Override
    public boolean withdrawCash(int amount) {
        //code
        return false;
    }

    @Override
    public int checkBalance() {
        //code
        return 0;
    }

    public void processMortgage(){
        System.out.println("Mortgage Passed");
    }

    public void applyLoan(){
        System.out.println("Loan Passed");
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

    @Override
    public int getEncryptionType() {
        return 0;
    }
}
