package lab.chap17.account;

public class Account {

	String name;      //이름
	int    account;   //계좌번호
	int    money = 10000;     //총금액
	
	
	//입금
	void deposit(int money) {
		//00 입금되었습니다. 계좌의 총금액은 000입니다
		//int hap = 0;
		//hap = this.money+money;
		
		this.money += money;
		
		//System.out.println(money +"입금되었습니다. 계좌의 총금액은 " + hap + "입니다");
		//this.money = hap;
		
		System.out.println(money +"입금되었습니다. 계좌의 총금액은 " + this.money + "입니다");
		
	}
	
	//출금
	void withdraw(int money) {
		//  00원 출금 했습니다. 계좌의 잔고는 000원 있습니다.
		int hap = 0;
		hap = this.money-money;	
		System.out.println(money +"원 출금 했습니다. 계좌의 잔고는 " + hap + "원 있습니다.");
		this.money = hap;	
	}
	
	

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getAccount() {
		return account;
	}

	public final void setAccount(int account) {
		this.account = account;
	}

	public final int getMoney() {
		return money;
	}

	public final void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", account=" + account + ", money=" + money + "]";
	}
	
	
	
}
