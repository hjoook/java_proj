package lab.chap10.frult;

public class Strawberry extends Frult{ // 딸기
	
	@Override
	void totalPrice() {
		System.out.println(name + "의 전체 가격은 : " + (cnt * price) + "원 입니다.");
	}

}
