package chap10.ex03;

public class Eigle extends Animal {
	
	//부모의 cry()를 상속받아 재정의 해서 사용
	@Override
	void cry() {
		System.out.println("독수리는 꼬끼오 하고 웁니다. ");
	}

}
