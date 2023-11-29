package lab.chap06;

class Animal
{
	//1. 필드
	String  aName;
	String  aColor;
	int     aLeg;   // 팔다리 갯수
	int     aSpeed;
	String  aCry;
	
	// 생성자 : 필드이 기본 값을 입력 하는 생성자 
	Animal(){};
	
	Animal (String aName , String aColor, int aLeg, int aSpeed, String aCry)
	{
		this.aName  =  aName;
		this.aColor =  aColor;
		this.aLeg   =  aLeg; 
		this.aSpeed =  aSpeed;
		this.aCry   =  aCry;
	}
	
	//필드의 모든 값을 출력하는 메소드
	void printAll()
	{
		System.out.println("+++++++++++++++++++++");
		System.out.println("aName  : " + aName );
		System.out.println("aColor : " + aColor);
		System.out.println("aLeg   : " + aLeg);
		System.out.println("aSpeed : " + aSpeed);
		System.out.println("aCry   : " + aCry );

		// return 0;  // void 일때 return 쓰면 오류
	}
	
	//메소드 : int abc () return aLeg + aSpeed 
	int abc()
	{
		return aLeg + aSpeed;
	}
	
	
} // Animal

public class Object_Definition {

	public static void main(String[] args) 
	{
		//호랑이, 독수리, 사자, 개
			
		
		Animal a1 = new Animal("호랑이", "갈색", 4,  100, "어흥");		
		a1.printAll();
	    System.out.println("aLeg + aSpeed : " + a1.abc());
		
		Animal a2 = new Animal("독수리", "검은색", 2,  120, "...");		
		a2.printAll();
		System.out.println("aLeg + aSpeed : " + a2.abc());
		
		Animal a3 = new Animal("사자", "누렁이색", 4,  50, "어흥");		
		a3.printAll();
		System.out.println("aLeg + aSpeed : " + a3.abc());
		
		Animal a4 = new Animal("개", "흰색", 4,  20, "멍");		
		a4.printAll();
		System.out.println("aLeg + aSpeed : " + a4.abc());
	

	} // main

} // Object_Definition
