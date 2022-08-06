package JavaFilePart_2;
//krunal Kevadiya
//21ce054
//class 4
// main class
public class Part_2_4 {

    public static void main(String[] args) {
        Part_2_4_Account account =new Part_2_4_Account(12,30000);
        Part_2_4_Saving_Account saving_account =new Part_2_4_Saving_Account(112,35000);
        Part_2_4_CheckingAccount checking_Account =new Part_2_4_CheckingAccount(442,30000,-60);

        account.setInterestRate(4.95);
        saving_account.setInterestRate(4.95);
        checking_Account.setInterestRate(4.95);


        //for withdaw
        account.withdraw(2500);
        saving_account.withdraw(1500);
        checking_Account.withdraw(1000);

        //for deposit
        account.Deposit(5000);
        saving_account.Deposit(7500);
        checking_Account.Deposit(5000);


        System.out.println(account.toString());
        System.out.println(saving_account.toString());
        System.out.println(checking_Account.toString());
//        System.out.println(account.getBalance());
//        System.out.println(saving_account.getBalance());
    }

}
