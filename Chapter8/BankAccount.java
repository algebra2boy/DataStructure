public class BankAccount
{
    String name;
    double balance;
    double transactionFee;
    public BankAccount(){
        this("",0);
    }

    public BankAccount(String name,double balance){
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
        if(balance-transactionFee>=0){
            this.balance-=this.transactionFee;
        }
    }

    public String toString(){
        return "Name = " +name+"  Balance = "+ balance+" transactionFee = "+ transactionFee;
    }

    public void setTransactionFee(double amount){
        this.transactionFee = amount;
    }

    public void transfer(BankAccount other, double transfer){
        double left = 0;
        //balance has enough money after deducting the fee
        if(this.balance-5>transfer){
            this.balance-=(transfer+transactionFee);
            other.balance+=transfer;
        // balance has not enought money after fee which is lower than the expected transfer
        }else if(this.balance-5<transfer){
            left = this.balance-5;
            other.balance+=left;
            this.balance = 0;// Since it doesn't have enough money, emptied all the money out
        }
    }

}
