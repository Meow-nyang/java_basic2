package oop.encap.practice;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private long balance;

    // 객체 생성 시 필요한 값을 모두 전달받음. (main을 보고 판단)
    public BankAccount(String accountNumber, String accountHolder, long balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    // 입금
    public void deposit(long money) {
        if (money < 0) {
            System.out.println("입금액이 올바르지 않습니다.");
            return;
        }
        this.balance += money;
    }

    // 출금
    public void withdraw(long money) {
        if (money < 0 || money > this.balance) {
            System.out.println("잔액이 부족하거나 잘못된 출금액 입니다.");
            return;
        }
        this.balance -= money;
    }
}
