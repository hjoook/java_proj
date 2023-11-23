package chap03.ex02;

import java.util.Scanner;

/* 문자타입 숫자로 
 *  Integer.parseInt
 *  Double.parseDouble
 * */
public class BitWiseOperator {

	public static void main(String[] args) 
	{
		/*
		   다양한 진법 표현, 비트연산자
		   10진수, 2진수, 8진수, 16진수, calc(계산기)
		   
		 */
		
		int data = 13;
		
		System.out.println(Integer.toBinaryString(data));  // 2진수 1101
		System.out.println(Integer.toOctalString(data));   // 8진수 15
		System.out.println(Integer.toHexString(data));     // 16진수 d
		
		System.out.println("3"+"5");  // 35		
		System.out.println(Integer.parseInt("3")+ Integer.parseInt("5")); // 8  문자열을 정수로
		
		System.out.println("13.5" + "17.77"); // 13.517.77
		System.out.println(Double.parseDouble("13.5") + Double.parseDouble("17.77")); // 31.27  문자열을 double 형으로..
		 
		System.out.println("+++++++++++++++++++");
		
		Scanner sc = new Scanner(System.in);  //Ctrl +Shift + o
				
		String kor ;
		String eng ;
		String avg ;
		
		System.out.println("국어점수(정수) 영어점수(정수) 평균(실수) 로 입력해 주세요>>>");
		
		kor = sc.next();
		eng = sc.next();
		avg = sc.next();
		
		int hap = Integer.parseInt(kor) + Integer.parseInt(eng);
		
		System.out.println("국어점수 + 영어점수 : " + (Integer.parseInt(kor) + Integer.parseInt(eng)));
		System.out.println("평균 출력 : " + Double.parseDouble(avg));
		
	}

}
