package chap03.ex05;

public class AssignmentOperator {

	public static void main(String[] args) 
	{
		/* 대입 연산자 : =, += , -=, *=, /= */
		
		int val1 = 3;
		//val1 = val1 + 3;
		val1 += 3;        
		
		System.out.println(val1);

		/* 삼항연산자 : if ~ else 의 축약 
		   (참 또는 거짓)? x:y 
		   
		 */
		
		int a = (3>5)? 6:9;
		System.out.println(a);  // false 9
				
				
	}

}
