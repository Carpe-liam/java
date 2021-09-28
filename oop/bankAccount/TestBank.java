import java.util.*;
import java.lang.*;

public class TestBank {
    public static void main(String[] args) {
        BankAccount banker1 = new BankAccount();
        System.out.printf("Welcome user #%s. \n", banker1.getAccountNumber());
        BankAccount banker2 = new BankAccount();
        System.out.printf("Welcome user #%s. \n", banker2.getAccountNumber());
//BANKER 1
    //deposits
        banker1.depositMoney("savings", 1100.0);
        banker1.depositMoney("checking", 3100.0);
        banker1.depositMoney("savings", 230.89);
    //withdrawals
        banker1.withdrawMoney("savings", 150.0);
        banker1.withdrawMoney("checking", 2350.0);
    //balance
        System.out.println("------------------------------");
        System.out.printf("Your checking balance is: $%,.2f \n", banker1.getCheckingBalance());
        System.out.printf("Your savings balance is: $%,.2f \n", banker1.getSavingsBalance());
        System.out.println("------------------------------");

        
// BANKER 2
    //deposits
        banker2.depositMoney("checking", 1230.00);
        banker2.depositMoney("checking", 3523.00);
        banker2.depositMoney("savings", 123.00);
    //withdrawals
        banker2.withdrawMoney("savings", 2350.0);
    //balance
        System.out.println("------------------------------");
        System.out.printf("Your checking balance is: $%,.2f \n", banker2.getCheckingBalance());
        System.out.printf("Your savings balance is: $%,.2f \n", banker2.getSavingsBalance());
        System.out.println("------------------------------");


// Final balance totals for accounts
        System.out.printf("Total accounts value for banker1, id: #%s = $%,.2f \n", banker1.getAccountNumber(), banker1.getUserAccountTotal());
        System.out.printf("Total accounts value for banker2, id: #%s = $%,.2f \n", banker2.getAccountNumber(), banker2.getUserAccountTotal());
        System.out.println("------------------------------");




    }
}