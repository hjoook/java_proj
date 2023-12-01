package lab.chap10.frult;

public class Banana extends Frult{

	Banana(){}
	

	
	@Override
	void totalPrice() {
		System.out.println(name + "의 전체 가격은 : " + (cnt * price) + "원 입니다.");
	}
}
