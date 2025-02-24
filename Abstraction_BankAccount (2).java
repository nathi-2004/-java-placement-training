import java.util.*;

import java.util.*;

abstract class BankAccount {
    private int accountNumber;
    private double balance;
    static double interestRate = 5;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double get_balance() {
        return balance;
    }

    public double get_interestRate() {
        return interestRate;
    }

    abstract double calculateInterest();

    void display() {
        System.out.println("\nAccount No: " + accountNumber + "\nBalance: " + balance +
                "\nInterest: " + calculateInterest());
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double calculateInterest() {
        return (get_balance() * get_interestRate() * 10) / 100;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double calculateInterest() {
        return (get_balance() * get_interestRate() * 5) / 100;
    }
}

public class Abstraction_BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Savings Account Number: ");
        int savingsAccountNumber = input.nextInt();
        System.out.print("Enter Savings Account Balance: ");
        double savingsBalance = input.nextDouble();
        
        System.out.print("Enter Current Account Number: ");
        int currentAccountNumber = input.nextInt();
        System.out.print("Enter Current Account Balance: ");
        double currentBalance = input.nextDouble();

        SavingsAccount s = new SavingsAccount(savingsAccountNumber, savingsBalance);
        s.display();

        CurrentAccount c = new CurrentAccount(currentAccountNumber, currentBalance);
        c.display();

        input.close();
    }
}
