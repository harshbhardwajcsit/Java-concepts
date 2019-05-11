package Banking;

import java.util.Scanner;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    boolean isSufficientBalance(int wa) {
        return balance > wa;
    }

    public void widrawAmount(int wa, String name) {
        balance = balance - wa;
        System.out.println("Amount" + wa + "is taken by" + name);
        System.out.println("Balance left" + balance);
    }
}

class Customer implements Runnable {
    private final Account account;
    private String name;


    public Customer(Account account, String name) {
        this.account = account;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);

        synchronized (account) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Amount for " + name);
            int wa = scanner.nextInt();
            if (account.isSufficientBalance(wa)) {
                account.widrawAmount(wa, name);
            } else {
                System.out.println("Insufficient balance");
            }

        }
    }
}
class Transaction {
    public static void main(String[] args) {
        Account account = new Account(1000);
        Customer customer1 = new Customer(account, "x");
        Customer customer2 = new Customer(account, "y");

        Thread t1 = new Thread(customer1);
        Thread t2 = new Thread(customer2);
        t1.start();
        t2.start();
    }
}