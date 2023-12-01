package lab.chap10.frult;

//부모
public class Frult {

	/* 생략 가능
	Frult(){}
	
	Frult(String name, int cnt, int price, int sum){
		this.name  = name;
		this.cnt    = cnt;
		this.price  = price;
		this.sum    = sum;
	}
	*/
	
	
	String   name;    // 과일 이름
	int      cnt;     // 과일 갯수
	int      price;   // 과일 가격 
	int      sum;
	
	//메소드
	void totalPrice() {		
		System.out.println("모든 과일의 합계는 : " + sum +"원 입니다.");
	}

	
	
}
