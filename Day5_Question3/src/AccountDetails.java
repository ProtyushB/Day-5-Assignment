import java.util.Scanner;

public class AccountDetails {
    public static void main(String[] args){
        AccountDetails acd = new AccountDetails();

        Account ac =acd.getAccountDetails();
        ac.withdraw(acd.getWithdrawAmount());
    }

    public Account getAccountDetails(){
        Account ac = new Account();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Id: ");
        ac.setAccountID(sc.nextInt());

        System.out.print("Enter Account Type: ");
        ac.setAccountType(sc.next());

        System.out.print("Enter Balance: ");
        int balance = sc.nextInt();

        while (balance<=0){
            System.out.println("Balance Should Be Positive");
            balance=sc.nextInt();
        }
        ac.setBalance(balance);

        return ac;
    }

    public int getWithdrawAmount(){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Amount To Be Withdrawn: ");
        int amount= sc.nextInt();
        while(amount<=0){
            System.out.println("Amount Should Be Positive");
            amount= sc.nextInt();
        }

        //System.out.println("Success");

        return amount;
    }
}
