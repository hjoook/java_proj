package chap10.ex03;

public class Dog extends Animal{
	//부모의 모든 필드와 메소드가 상속

	//부모의 cry()를 상속받아 재정의 해서 사용
	@Override
	void cry() {
		System.out.println("개는 멍멍 하고 짖습니다. ");
	}
}
