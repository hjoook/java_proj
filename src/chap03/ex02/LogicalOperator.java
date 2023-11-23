package chap03.ex02;

public class LogicalOperator {

	public static void main(String[] args) 
	{
	/*
	     논리연산자 : 결과 값으로 true/false를 리턴
	         && (AND) , ||(OR), ^(XOR) , !(NOT)
	 
	 */
		
		System.out.println(true && true);
		System.out.println(true || false);
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);
		System.out.println(!true);
	
		
/*   ****** 중요
 *  쇼트서킷(Short Circuit ) : 연산 수행시 결과가 이미 확정된 경우 나머지 연산 과정을 수행하지 않음 
 *  논리 연산자는 쇼트서킷이 발생될수 있다. 이를 방지하기 위해 비트 연산자를 사용해서 방지
*/
/*************************************************************************************/
		
		/* 쇼트서킷 발생 */
		System.out.println("=====쇼트서킷 발생 논리연산자 사용=====");
		int val10 = 3;
		System.out.println(false && ++val10>6);  // AND 연산으로  쇼트서킷 발생 무조건  false 
		System.out.println(val10);               // 3 쇼트서킷이 발생되어 ++val10 이 작업안됨
		
		int val11 = 3;
		System.out.println(true || ++val11>6);   // OR 연산으로  쇼트서킷 발생 무조건 true
		System.out.println(val11);               // 3 쇼트서킷이 발생되어 ++val11 이 작업안됨
		
		/* 쇼트서킷 방지 
		    비트 연산자를 사용해서 쇼트 서킷을 방지 : &(AND), |(OR)
		 */
		
		System.out.println("=====쇼트서킷 방지 비트연산자 사용=====");
		int val12 = 3;
		System.out.println(false & ++val12>6);   // AND 비트연산으로  쇼트서킷 발생도지 않음
		System.out.println(val12);               // 4  ++val12 적용
		
		int val13 = 3;
		System.out.println(true | ++val13>6);    // OR 비트연산으로  쇼트서킷 발생도지 않음
		System.out.println(val13);               // 4  ++val13 적용		
		
/**************************************************************************************/
		
		
	}

}
