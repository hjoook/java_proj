package chap01;
// 패키지 : 클래스를 관리하는 폴더

public class ConsoleOutPut1
{ // 클래스 블락
	public static void main(String[] args) 
	{ // 메인 메소드 블락 : 클래스 블락 내부
      // 메인 메소드 내부에서 코드 작성  	

		/*
		1. System.out.Println();     // 콘솔에 출력후 라인을 개행
		2. System.out.Print();       // 콘솔에 출력후 라인을 개행하지 않음 \n : 라인을 개힝, \t :탭
		3. System.out.Printtf();     // 콘솔에 출력. 출력 문자열 라인의 변수 값을 불러 오도록 함. "%s, %d" ,%f  
		               
		*/
		System.out.println("안녕하세요");              // 문자열
		System.out.println("안녕하세요"+ " 반갑습니다");  // 문자열 연결  '+'
		System.err.println(2+3);                    // 정수
		System.out.println(10.5+20.11);             // 실수
		System.out.println("10.5" + 20.11);         // 문자열
		System.out.println("====================");
		System.out.println("안녕"+123+456.7);
		System.out.println(123+456.7+"안녕");
		
		/* 변수에 값을 할당후 출력 */
		String str = "안녕";		
		int      a = 10;		
		int      b = 20;

		System.out.println(str);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("====================");
		
		/* 문자열과 변수 연결 */
		System.out.println("str 변수에 담긴값 : " + str);
		System.out.println("a + b = " + (a+b));
		
		
		System.out.println("=====println()=====");
		System.out.println("오늘");
		System.out.println("날씨");
		System.out.println("맑음");
		
		System.out.println("=====print() \\n=====");		
		System.out.print("오늘\n");
		System.out.print("날씨\n");
		System.out.print("맑음\n");
		
		System.out.println("=====print() \\t=====");		
		System.out.print("오늘\t");
		System.out.print("날씨\t");
		System.out.print("맑음\t\n\n");		
				
			
		str = "맑음";
		a   = 50;
		b   = 30;
		double c = 123.4567;
		
		System.out.println("=====println()=====");
		System.out.println("오늘의 날씨는 " +str + " 입니다.");
		System.out.println("오늘 날씨 : " + str +" \n 변수 a + b : " +(a+b) + " \n 실수 c의 값 : " + c);
		
		System.out.println("=====printf()======");
		System.out.printf("오늘의 날씨는 %s 입니다. \n",str);
		System.out.printf("오늘 날씨 : %s \n 변수 a + b : %d \n 실수 c의 값 : %4.2f \n",str, (a+b), c);
		
		
		System.out.println("====================");
		
		String str1 = "오늘 ";
		String str2 = "날씨는 ";
		String str3 = "맑습니다.";
		int       d = 100;
		
		System.out.printf("%s %s %s 정수의 값은 : %d \n",str1,str2,str3, d);
		System.out.println(str1 + str2 + str3 + "정수의 값은 : " + d);
		
		
	}

//	System.out.Println("Helloworld");  /* 오류발생 */
 
}
