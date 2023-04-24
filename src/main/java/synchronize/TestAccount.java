package synchronize;

public class TestAccount implements Runnable {

    public static BankAccount account= new BankAccount();
    @Override
    public void run() {
        synchronized (account) {
            System.out.println("100원을 입금합니다");
            account.deposit(100);
            System.out.println(account.getBalance());
            System.out.println("50원을 인출합니다");
            account.withdraw(50);
            System.out.println(account.getBalance());
        }
    }


    public static void main(String[] args){
        Thread t1 = new Thread(new TestAccount());
        Thread t2 = new Thread(new TestAccount());
        Thread t3 = new Thread(new TestAccount());
        Thread t4 = new Thread(new TestAccount());


        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
