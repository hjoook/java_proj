package lab.chap03;

import java.util.Scanner;

public class ConditionalOperator2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String str;  // 기본 자료형이 아니고 참조 자료형 str 변수의 값이 heap에 저장
		
		System.out.println("문자열을 입력하세요==>");
		
		str = sc.next();
		
		System.out.println((str.equals("안녕"))?  "안녕하세요." : "안녕 못합니다.");  
		System.out.println((str =="안녕"      )?  "안녕하세요." : "안녕 못합니다.");        // err 발생
		 
		// 참조 자료형일때 변수의 값은 Heap 공간에 저장
		// Stack 에는 변수명과 Heap에 저장된 값의 번지가 저장
	}

}
