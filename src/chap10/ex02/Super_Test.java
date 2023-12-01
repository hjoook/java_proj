package chap10.ex02;

// 부모 클래스
class A{
	A(){
		System.out.println("A 클래스의 기본 생성자 1");
		
	} //A
	
	A(int a) {
		System.out.println("A클래스의 인풋 값 1개 정수 - 생성자");
	} //A(int a)
	
	A(String a, int b) {
		System.out.println("A클래스의 인풋 값 2개 정수 - 문자열, 정수");
		
	}//A(String a, int b)
	
	
} //class A

class B extends A{
	B() {System.out.println("B 클래스의 기본 생성자 ");}
	
	B(int a){
		super(1);
		System.out.println("B클래스의 인풋 1개- 정수"); }
	
	B(String a, int b) {
		System.out.println("B클래스의 인풋 값 2개 정수 - 문자열, 정수");	
	}
}// B


class C extends A{
	C() {System.out.println("C클래스의 기본 생성자 ");}
	
	C(String a){
		super(1);
		System.out.println("C클래스의 인풋 1개- 문자열"); }
	
	
	C(String a, int b) {
		System.out.println("C클래스의 인풋 값 2개 정수 - 문자열, 정수");	
	}
	
	int a = 22;
	int b = 33;
}// C

public class Super_Test {

	public static void main(String[] args) {
		C c1 = new C("오늘");
		
		System.out.println(c1.a);
		System.out.println(c1.b);
				
	}

}

/* 출력결과~
A클래스의 인풋 값 1개 정수 - 생성자
C클래스의 인풋 1개- 문자열
22
33
*/ 
