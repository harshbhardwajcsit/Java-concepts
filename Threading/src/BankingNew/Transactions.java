package BankingNew;

public class Transactions implements Runnable {
    public int amount;
    public Account account;
    public String action;

    public Transactions(int amount, Account account, String action) {
        this.amount = amount;
        this.account = account;
        this.action = action;
    }

    @Override
    public void run() {
        if (action.equals("WIDH")) {
            try {
                withdraw();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        } else {
            try {
                deposit();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }

    public void withdraw() throws InterruptedException {
        synchronized (account) {
            while (account.balance < amount) {
                System.out.println("NO AVAILABLE AMOUNT, WAITING FOR MONEY");
                account.wait();
            }
            account.balance = account.balance - amount;
            System.out.println("WITHDRAW SUCCESS WITH" + account.balance);

        }
    }

     public void deposit() throws InterruptedException {
        synchronized (account){
            account.balance = account.balance + amount;
            System.out.println("UPDATED BALANCE" + account.balance);
            account.notifyAll();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(10000, "Harsh");
        Thread thread = new Thread(new Transactions(12000, account, "WIDH"));
        thread.start();

        Thread thread2 = new Thread(new Transactions(3000, account, "DEPO"));
        thread2.start();

        Thread thread3 = new Thread(new Transactions(12000, account, "WIDH"));
        thread3.start();

        Thread thread4 = new Thread(new Transactions(12000, account, "DEPO"));
        thread4.start();

    }
}
