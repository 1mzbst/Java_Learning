package org.oop.seminars.seminar1.ex2;

public class CreditAccount extends Account {
    private Double percent;

    public CreditAccount(Integer numAccount, String owner, Double balance, Double percent) {
        super(numAccount, owner, balance);
        this.percent = percent;
    }

    public CreditAccount() {}


    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    protected void calculateInterest(){
        Double result =  getBalance() * percent/100;
        withdraw(result);
    }

}
