package chap10.ex03;

public class Method_Overriding_Test {

	public static void main(String[] args) {
	
		/* Method Overriding : <= 인스턴스 메소드만 Overriding
		            정적 메소드 : static 메소드명, 객체 생성없이 클래스명,메소드명 으로 호출됨
		            인스턴스 메소드 : 메소드명 앞에 static 키가 붙지 않은 메소드
		                         객체화 해서 호출이 가능함
		            상속 관계에서 적용 가능
		            부모에서 선언된 인스턴스 메소드를 자식에서 재정의해서 사용하는 것
		            다형성 : 자식을 객체화 => 부모 타입으로 선언후 부모의 메소드를 호출시 자식의 Overriding된 메소드가 작동됨.(ex=> a3 ~ a5)
		               - 부모의 메소드 호출 : 자식의 오버라이딩된 메소드가 작동
		 */
		//1.객체 생성 : Animal
		System.out.println("=======인스턴스 & 정적(ststic/@Override불가)==========");
		Animal a1 = new Animal();
		
		//인스턴스 필드
		a1.name = "동물";
		a1.age  = 10;
		
		//정적 필드
		a1.color = "빨강";
		
		//인스턴스 메소드
		a1.cry();   // 모든 동물은 웁니다.
		
		//정적 메소드
		a1.eat();   // 모든 동물은 밥을 먹습니다

		//2. 객체 생성없이 클래스명으로 필드, 메소드 호출 <= static 필드, static 메소드
		Animal.color = "노랑";   // static String color 선언
		Animal.eat();  // 모든 동물은 밥을 먹습니다
		
		System.out.println("=======Animal a2==========");
		Animal a2 = new Animal();		
		a2.cry();   //모든 동물은 웁니다.
		

		// Dog 객체화 Animal 타입으로 저장 : a3 
		System.out.println("=======Dog a3==========");
		Animal a3 = new Dog();
		a3.cry();   // 개는 멍멍 하고 짖습니다.  Animal의 cry()가 Dog에 @Override된  cry()재정의
		
		// Eigle 객체화 Animal 타입으로 저장 : a4 
		System.out.println("=======Eigle a4==========");
		Animal a4 = new Eigle();
		a4.cry();   // 독수리는 꼬끼오 하고 웁니다. Animal의 cry()가 Eigle에  @Override된 cry()재정의
		
		// Lion 객체화 Animal 타입으로 저장 : a5 
		Animal a5 = new Lion();
		a5.cry();   // 사자는 어흥 하고 웁니다. Animal의 cry()가 Lion에  @Override된 cry()재정의		
		
	}

}
