package lab.chap10.car;

public class H_Car extends Car{

	
	//@Override   //@ : (어노케이션), @Override: 부모의 메소드를 오버라이딩 하겠다고 선언. 삭제 가능
	void run() {
		System.out.println(name + " 자동차는 부릉하고 달립니다.");
	}

}
