package openai;

public class Account {
    private String name;        // 이름
    private int accountNumber;   // 계좌번호
    private int money = 10000;   // 초기 금액

    // 생성자
    public Account(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    // 입금 메소드
    public void deposit(int amount) {
        if (amount > 0) {
            money += amount;
            System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + money + "원");
        } else {
            System.out.println("입금 금액은 0보다 커야 합니다.");
        }
    }

    // 출금 메소드
    public void withdraw(int amount) {
        if (amount > 0 && amount <= money) {
            money -= amount;
            System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + money + "원");
        } else if (amount <= 0) {
            System.out.println("출금 금액은 0보다 커야 합니다.");
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + money + "원");
        }
    }

    // 잔액 조회 메소드
    public void checkBalance() {
        System.out.println(name + "님의 현재 잔액: " + money + "원");
    }

    // Getter 메소드
    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getMoney() {
        return money;
    }
}