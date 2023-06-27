package org.oop.seminars.seminar1.ex2;

public class SavingAccount extends Account {
    private Double savingPercent;
    public SavingAccount(){

    }


    public SavingAccount(Integer numAccount, String owner, Double balance, Double savingPercent) {
        super(numAccount, owner, balance);
        this.savingPercent = savingPercent;
    }
    protected void addInterest(){
        Double result = getBalance() * savingPercent / 100;
        deposit(result);

    }
}
