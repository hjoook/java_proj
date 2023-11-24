package chap04.ex05;

public class DoWhile_Statment {

	public static void main(String[] args) 
	{
		/*
		 * while : 조건이 true 일때 실행문이 실행
		 * do while 문 : 조건에 상관없이 1번은 실행문이 실행됨
		  
		  1. while 초기값
		  while(조건){     
		      실행문; => 조건이 true
		      증감식;
		      } 
		      
		   2. do while 초기값
		   do{
		        실행문;
		        증감식;
		     } while (조건);   
		  
		 */
		
		int a = 0;
		while ( a < 0 ) // 조건이 false 내용출력 없음
		{
			System.out.println("a : " + a);
		}
		
		
		// do ~ while (조건)
		int b = 0;
		do 
		{
			System.out.println("b : " + b);  // 조건과 상관없이 한번은 반드시 실행됨
		}while (b < 0);
		
		// do ~ while 에서 반복처리
		int c = 0;
		do 
		{
			System.out.println("c : " + c);
			c++;
		}while (c <100);
		
		// 반복 횟수가 100번인 경우 while 문 do while 문 비교
		
		System.out.println("===while===");
		
		a = 0;
		while (a <10)
		{
			System.out.println("a : " + a);
			a++;
		}
		
		System.out.println("===do while===");
		
		a = 0;
		do {
			System.out.println("a : " + a);
			a++;			
		}while (a <10);

	}

}
