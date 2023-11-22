package chap03.ex01;

public class AritheticcOpeator {

	public static void main(String[] args) 
	{
		/*
		   산술 연산자 : +, -, *, /, %(나머지)
		   증감 연산자 : ++, -- 
		 */
		
		int a = 5;
		int b = 10;
		
		System.out.println(a + b);  // 15
		System.out.println(a - b);  // -5
		System.out.println(a * b);  // 50
		System.out.println(a / b);  // 0
		System.out.println(a % b);  // 5

		
		System.out.println(2+ (double)3);  // 5.0
		System.out.println(10%3);          //나머지 3
		System.out.println(8/5);           // 1
		System.out.println(8/5.0);         // 1.6
		
		int val1 = 3;
		int val2 = 3;
		
		System.out.println("val1=3");
		System.out.println(++val1);  // 4 값을 증가 후 출력 
		System.out.println(val1);    // 4
		System.out.println(--val1);  // 3
		System.out.println(val1--);  // 3
		System.out.println(val1);    // 2

		System.out.println("val2=3");
		System.out.println(val2++);  // 3 값을 출력 후 증가
		System.out.println(val2);    // 4
		
		System.out.println("============");
		
		int val7 = 3;
		int val8 = 4;
		int val9 = 2 + val7-- + ++val8;
 
		System.out.println("val9 : " + val9);  // 10
		System.out.println("val7 : " + val7);  // 2
		System.out.println("val8 : " + val8);  // 5
		
		int val10 = 30;
		int val11 = 40;
		int val12 = 50;
		int val13 = 7 + --val10 + ++ val11 + val12-- ;  // 7+29+41+50
		
		System.out.println("============");
		System.out.println("val10 : " + val10);  // 29
		System.out.println("val11 : " + val11);  // 41 
		System.out.println("val12 : " + val12);  // 49
		System.out.println("val13 : " + val13);  // 127
		
						

	}

}
