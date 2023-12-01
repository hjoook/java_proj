package lab.chap10.frult;

public class Apple extends Frult{

	//부모의 필드가 상속
	/* 생략가능
	Apple(){}
	
	Apple(String name, int cnt, int price) {
		super.name  = name;
		super.cnt   =  cnt;
		super.price = price;
	}
	*/
	//@Override  생략가능
	void totalPrice() {
		System.out.println(name + "의 전체 가격은 : " + (cnt * price) + "원 입니다.");
	}
	
	void end() {System.out.println("종료"); }
}
