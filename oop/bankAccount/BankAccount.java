import java.util.*;

public class BankAccount {
    Random random = new Random();
// attributes
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;
    public static int numOfAccounts; 
    public static double accountsTotal;

    public BankAccount() {
        accountNumber = setAccountNum();
        numOfAccounts++; 
    }

// getters (accessors)
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public double getUserAccountTotal() {
        return this.savingsBalance+this.checkingBalance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

// setters (mutators)
    public void depositMoney(String account , double amountDeposited) {
        if(account == "savings") {
            savingsBalance += amountDeposited;
            System.out.println("Your deposit of $" + amountDeposited + " is complete.");
        }
        if(account == "checking") {
            checkingBalance += amountDeposited;
            System.out.println("Your deposit of " + amountDeposited + " is complete.");
        }
        accountsTotal += amountDeposited;
    } 

    public void withdrawMoney(String account , double amountWithdrawn) {
        if(account == "savings" && (savingsBalance - amountWithdrawn) >= 0 ) {
            savingsBalance -= amountWithdrawn;
            System.out.println("You just withdrew " + amountWithdrawn + " from " + account);
            accountsTotal -= amountWithdrawn;
        } else if (account == "checking" && (checkingBalance - amountWithdrawn) >= 0){
            checkingBalance -= amountWithdrawn;
            System.out.println("You just withdrew " + amountWithdrawn + " from " + account);
            accountsTotal -= amountWithdrawn;
        } else {
            System.out.println("Insufficient Funds");
        }
    }
    public double getAccountsTotal() {
        return accountsTotal;
    }

    private String setAccountNum() {
        String accountNumber="";
        String[] alphs = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] nums = {"1","2","3","4","5","6","7","8","9","0"};
            for(int i=0; i<8; i++) {
                if(i==2 || i==5 || i==6) {
                    int letter = random.nextInt(26);
                    String randomLet = alphs[letter];
                    accountNumber += randomLet;
                } else {
                    int number = random.nextInt(10);
                    String randomNum = nums[number];
                    accountNumber += randomNum;
                }
            }
        return accountNumber;
    }












}