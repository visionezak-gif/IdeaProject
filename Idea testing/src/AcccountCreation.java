public class AcccountCreation {

    public int balance = 0;

    public int getBalance() {
        return balance;
    }



    public void deposit(int amount) {
        if(amount > balance) balance += amount;

    }

    public void withdrawal(int amount) {
        if(amount < balance) balance -= amount;
    }

    public void smallWithdrawal(int amount) {
        if(amount < balance) balance+= amount;

    }
}




