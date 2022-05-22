public class Account {
    private int accountID;
    private String accountType;
    private int balance;

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean withdraw(int amount){
        if(getBalance()>=amount){
            setBalance(getBalance()-amount);
            System.out.println("Balance Amount After Withdraw: "+getBalance());
            return true;
        }
        else{
            System.out.println("Sorry!!! No Enough balance");
            return false;
        }
    }

}
