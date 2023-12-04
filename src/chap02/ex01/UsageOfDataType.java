package chap02.ex01;

public class UsageOfDataType { // 클래스 영역

	public static void main(String[] args) 
	{   // 메인 메소드
		/* 변수 : 한번 선언 후 변수의 값을 다른 값을 할당할 수 있다. 소문자로 시작해서 계열케이스 이름 작성
		   상수 : 변수 선언 앞에 final 키가 등록됨 상수명은 대문자로만 지정 . 한번 값을 할당하면 그 값을 수정할 수 없다
		   자료형 : 변수/상수를 정의할때 반드시 자료형 
		       기본 자료형 (8개) 메모리의 Stack 공간에 변수의 값이 할당
		        boolean, byte, int, shot, long, floot, double, char		       
		       참조 자료형(무한대) 메모리의 Stack 공간에는 변수명, 값은 heap 메모리에 저장
		        객체, 배열 인터페이스
		        String : 참조자료형, 문자열을 담는다
		*/
		
		/* 변수선언방법 
		   1.변수 선언과 값은 나중에 할당 
		 */
		int a;
		int b;
		
		a = 1;
		
		System.out.println(a);
		//System.out.println(b);    // 오류 발생 : 변수 선언후 값이 할당이 안되어 있어

		/*
           2.변수 선언과 동시에 값을 할당		 
		 */
		int c = 10;
		int d = 20;
		
		System.out.println(c);
		System.out.println(d);
		
		//리터럴 : 변수, 상수에 들어가는 값
		
		// 변수 : 새로운 값 할당
		 c = 50;
		 d = 60;
		
		System.out.println(c);
		System.out.println(d);		
		
		//상수 : 한번 값이 할당되면 다른 값을 넣을 수 없다. final 키를 넣어서 상수 선언
	    final int ABC = 200;
		final double PI = 3.14;
		
		System.out.println(ABC);
		
		
		System.out.println("===========8가지 자료형===========");
		
		//1. boolean
		boolean abc; // true, false 값만 넣을 수 있다
		abc = true;
		
		System.out.println(abc);
		
		//2.정수값을 넣을 수 있는 자료형(byte:1byte, short :2byte, int :4byte, long : 8byte)
		byte aa;
		byte bb;
		aa =-128;
		bb = 127;		
		System.out.println(aa);
		System.out.println(bb);
		
		//page 60 참조
		
		long gg;
		long nn;
		
		gg = -9223372036854775808L;
		nn = 9_223_372_036_854_775_807L;   // 리터럴 L 적용
		System.out.println(gg);
		System.out.println(nn);
				
		long ll;
		ll = 5000; // int  범위 내의 값을 가질때 L을 명시 하지 않아도 됨.
		
		//실수 fload , double Page 66 참조
	    float jj;
	    jj = 3.148888888888888F;  // 리터럴 F 적용
	    System.out.println(jj);   // 소수점 7자리까지
	    
	    double kk;
	    kk = 3.1488888888888888888888888;
	    System.out.println(kk); // 소수점 15자리까지
	    
	    char ii;
	    ii = 'a';
	    char mm;
	    mm = 97;            //아스키코드
	    char pp ='\u0061';  //유니코드
	    
	    System.out.println(ii);
	    System.out.println(mm);
	    System.out.println(pp);
	    
	    char firstName1 = '\uC8Fc';
	    char firstName2 = '\uC625';
	    char lasttName = '\uD55c';
	    
	    System.out.println("나의 이름은 " + lasttName + " " + firstName1 + firstName2 + " 입니다.");
	    System.out.printf("나의 이름은 %c %c%c 입니다.", lasttName,firstName1, firstName2 );
		
	}
}
