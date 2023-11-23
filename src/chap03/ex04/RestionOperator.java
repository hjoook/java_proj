package chap03.ex04;

public class RestionOperator {
	public static void main(String[] args) 
	{
		/*
		  비트 연산자 : 결과를 True, False 를 리턴
		   크기비교 : >, <, >=, <=
		   등가비교 : ==, !=
		*/    
		
		System.out.println( 5 > 2 ); // true
		System.out.println( 5 < 2 ); // false
		System.out.println( 5 >= 2 ); // true
		System.out.println( 5 <= 2 ); // false
		System.out.println( 5 == 2 ); // false
		System.out.println( 5 != 2 ); // true
		
		char a = 'a';
		char b = 'a';
		System.out.println( a == b ); // true
		System.out.println( a != b ); // false		
		
		
		System.out.println(" =====참조자료형일때 등가비교===== ");
		
		String str1 = new String("안녕");  // stack 메모리 영역에 저장, str1값이 저장된 heap의 주소정보를 가지고 있음
		String str2 = new String("안녕");
		
		System.out.println( str1 == str2 );  // false 오류발생		
		/********* 사용*********/
		System.out.println(" 사용=>" + str1.equals(str2));  // true  참조자료형일때 heap영역의 값을 비교할려면 .()를 사용하여 비교
		
		String str3 = "오늘";
		String str4 = "오늘";
		
		System.out.println( str3 == str4 );      // true  stack에 저장된 변수의 값을 비교
		System.out.println( str3.equals(str4));  // true  heap에 저장된 값을 비교
		
		
		
		
	}

}
