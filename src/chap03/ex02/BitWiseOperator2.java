package chap03.ex02;

public class BitWiseOperator2 {

	public static void main(String[] args) 
	{
		/*
		  비트 연산자 : &(AND) , |(OR), ^(XOR), ~(NAT) 
		     2진법으로 변환해서 연산
		     
		 */
		
		System.out.println(3 & 10);  // 2진수  3(0011) & 10(1010) =>  2(0010) 결과 :2
		System.out.println(3 | 10);  // 2진수  3(0011) | 10(1010) => 11(1011) 결과 :11
		System.out.println(3 ^ 10);  // 2진수  3(0011) ^ 10(1010) =>  9(1001) 결과 :9
		System.out.println(~3);      // 2진수  3(0011) ~  결과 : -4

	}

}
