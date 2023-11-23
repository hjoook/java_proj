package chap04.ex01;

public class If_Statement {

	public static void main(String[] args) 
	{
		/*
		    클래스명 : 반드시 첫자는 대문자
		    변수명 : 소문자로 시작(권장사항)
		    상수명 : 대문자(권장사항)
		    
		    제어문 : 프로그램의 순서를 바꾸어서 처리함. if, switch   
        */

		int a = 10;
		
		if (a > 30 ) 
		{
			System.out.println("참입니다.");
		}else 
		{
			System.out.println("거짓입니다");
		}
		
		
		int score = 90;
		if( score >= 90) 
		{
			System.out.println("A 학점입니다.");
			
		}else if (score >= 80) {
			System.out.println("B 학점입니다.");
		}else if (score >= 70) {
			
			System.out.println("C 학점입니다.");
		}else if (score >= 60) {	
			System.out.println("D 학점입니다.");
		}else
        {
			System.out.println("F 학점입니다.");			
		}
		
		System.out.println("===========");
		
		score = 90;
		if( score >= 60 & score <70) 
		{
			System.out.println("D 학점입니다.");
			
		}else if (score >= 70 & score <80) {
			System.out.println("C 학점입니다.");
		}else if (score >= 80 & score <90) {
			
			System.out.println("B 학점입니다.");
		}else if (score >= 90 & score <100) {	
			System.out.println("A 학점입니다.");
		}else
        {
			System.out.println("F 학점입니다.");			
		}
		
		System.out.println("===========");
		
		if (10>5)
		{
			System.out.println("참입니다.");
		}
		
		if (10>5) 
			System.out.println("참입니다."); // {} 생갹 가능
		
		System.out.println("프로그램 종료입니다.");
		
	}

}
 