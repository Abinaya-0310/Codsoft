package ATM_INTERFACE;
import java.util.*;
class BankAccount {
 private double balance;

 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 public double getBalance() {
     return balance;
 }

 public void deposit(double amount) {
     balance += amount;
 }

 public boolean withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         return true;
     } 
     else {
         System.out.println("Insufficient Balance");
         return false;
     }
 }
}
class ATM {
 private BankAccount bankAccount;

 public ATM(BankAccount account) {
     this.bankAccount = account;
 }

 public void displayMenu() {
     System.out.println("Welcome to the ATM \uD83D\uDE4F");
     System.out.println("1. Withdraw");
     System.out.println("2. Deposit");
     System.out.println("3. Check Balance");
     System.out.println("4. Exit");
 }

 public void withdraw(double amount) {
     if (bankAccount.withdraw(amount)) {
         System.out.println("Withdrawal successful");
     }
 }

 public void deposit(double amount) {
     bankAccount.deposit(amount);
     System.out.println("Deposit successful");
 }

 public void checkBalance() {
     System.out.println("Your balance is: " + bankAccount.getBalance());
 }
}

public class ATM_INTERFACE 
{
 public static void main(String[] args) 
 {
     Scanner sc = new Scanner(System.in);
     BankAccount account = new BankAccount(1000);
     ATM atm = new ATM(account);
     do{
         atm.displayMenu();
         System.out.print("Enter your choice: ");
         int choice = sc.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter amount to withdraw: ");
                 double withdrawAmount = sc.nextDouble();
                 atm.withdraw(withdrawAmount);
                 break;
             case 2:
                 System.out.print("Enter amount to deposit: ");
                 double depositAmount = sc.nextDouble();
                 atm.deposit(depositAmount);
                 break;
             case 3:
                 atm.checkBalance();
                 break;
             case 4:
                 System.out.println("Exiting ATM. Thank you!");
                 break;
             default:
                 System.out.println("Invalid choice. Please try again.");
                 break;
         } 
         if(choice==4)
         {
        	 break;
         }
     }while(true);
     sc.close();
     
 }
}




