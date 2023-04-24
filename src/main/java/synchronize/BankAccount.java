package synchronize;

public class BankAccount {

    private double balance=0.0;


    //계좌에 금액을 입금하는 메서드.
    // synchronized 키워드를 사용하여 동시에 여러 스레드에서 입금이 발생해도 정확한 잔액이 유지되도록 한다.
    public void deposit(double amount) {
        this.balance+=amount;
    }

    //계좌에서 금액을 출금하는 메서드.
    // synchronized 키워드를 사용하여 동시에 여러 스레드에서 출금이 발생해도 정확한 잔액이 유지되도록 한다.
    public void withdraw(double amount) {
        this.balance-=amount;
    }

    //계좌의 현재 잔액을 반환하는 메서드.
    public double getBalance(){
        return this.balance;
    }
}
