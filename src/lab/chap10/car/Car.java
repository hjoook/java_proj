package lab.chap10.car;

public class Car {
	
	Car(){      // 생략가능
		super();    // (부모클래스)의 생성자를 호출,
	}

	
	Car(String name){
    	//super(); // 생략가능, 첫라인에 작성
    	this.name  =  name;    	
    }
	
	//필드
	String name;
	
	//메소드[인스턴스 메소드] : 인스턴스 메소드만 @Overriding 됨	
	void run() { // 자식에서 Overriding 해서 출력
		System.out.println("모든 자동차는 달립니다.");
	}

}
