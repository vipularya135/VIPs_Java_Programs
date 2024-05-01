package Inheritance;
import java.util.Scanner;

class customer {
    String cname, accno, branch, bank;

    void initialize(String name, String accountNo, String branch, String bank) {
        this.cname = name;
        this.accno = accountNo;
        this.branch = branch;
        this.bank = bank;
    }
}

class savings extends customer {
    double initial = 0.0, deposit, balance, withdrawal;

    void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount for Savings account: ");
        deposit = scanner.nextDouble();
        initial += deposit;
        balance += deposit;
    }

    void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount for Savings account: ");
        withdrawal = scanner.nextDouble();
        if (withdrawal <= balance) {
            balance -= withdrawal;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    void interest() {
        double interestRate = 0.006; // 0.6% interest rate
        double simpleInterest = balance * interestRate;
        balance += simpleInterest;
    }

    void display() {
        System.out.println("\nSavings Account Details:");
        System.out.println("Customer Name: " + cname);
        System.out.println("Account Number: " + accno);
        System.out.println("Branch: " + branch);
        System.out.println("Bank: " + bank);
        System.out.println("Balance with Interest: $" + balance);
    }
}

class current extends customer {
    double initialc = 0.0, depositc, balancec, withdrawalc;

    void depositc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount for Current account: ");
        depositc = scanner.nextDouble();
        initialc += depositc;
        balancec += depositc;
    }

    void withdrawc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount for Current account: ");
        withdrawalc = scanner.nextDouble();
        if (withdrawalc <= balancec) {
            balancec -= withdrawalc;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    void displayc() {
        System.out.println("\nCurrent Account Details:");
        System.out.println("Customer Name: " + cname);
        System.out.println("Account Number: " + accno);
        System.out.println("Branch: " + branch);
        System.out.println("Bank: " + bank);
        System.out.println("Balance: $" + balancec);
    }
}

public class bank {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        savings savingsAccount = new savings();
        current currentAccount = new current();

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accountNo = scanner.nextLine();
        System.out.print("Enter branch: ");
        String branch = scanner.nextLine();
        System.out.print("Enter bank: ");
        String bank = scanner.nextLine();

        savingsAccount.initialize(name, accountNo, branch, bank);
        currentAccount.initialize(name, accountNo, branch, bank);

        savingsAccount.deposit();
        savingsAccount.withdraw();
        savingsAccount.interest();
        savingsAccount.display();

        currentAccount.depositc();
        currentAccount.withdrawc();
        currentAccount.displayc();

        scanner.close();
    }
}
