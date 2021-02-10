package uk.axone.devintest.interfaces;

////here Bank is implimenting two interfaces (Company & FinancialInstitution)
public interface Bank extends Company, FinancialInstitution {

    //All variables in an interface are public, static and final
    //they are constant
    int FIN_INST_TYPE = 12;
    //All methods in an interface are abstract
    public abstract void depositCash(int amount);
    boolean withdrawCash(int amount);
    int checkBalance();


}
