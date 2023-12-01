package chap10.ex01;

// 사람 : 부모( super class )
public class Human {
	
	//필드
	String name;
	int    age;
	
	//기본생성자 생략
	Human(){
		super(); //  Object 클래스가 호출. Java.lang.Object
	}
	
	//생성자
	Human(String name, int age){
		this.name  = name;
		this.age   = age;
	}
	
	//메소드
	void eat() {
		System.out.println("모든 사람은 먹는다.");
	}
	
	void sleep() {
		System.out.println("모든 사람은 잠을 잔다. ");
	}
	
	

}
