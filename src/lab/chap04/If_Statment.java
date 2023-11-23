package lab.chap04;

import java.util.Scanner;

public class If_Statment {

	public static void main(String[] args) 
	{
		// 콘솔에서 월요일 입력되었을때 출력  월요일은 자바를 공부합니다.
		// 콘솔에서 화요일 입력되었을때 출력  화요일은 데이타베이스를 공부합니다.
		// 콘솔에서 수요일 입력되었을때 출력  수요일은 html javascipt를 공부합니다.
		// 콘솔에서 목요일 입력되었을때 출력  목요일은 JSP를 공부합니다.
		// 콘솔에서 금요일 입력되었을때 출력  금요일은 String를 공부합니다.
		// 콘솔에서 토요일 입력되었을때 출력  토요일은 운동을 공부합니다.
		// 콘솔에서 일요일 입력되었을때 출력  일요일은 TV를 시청합니다.
		
		String week;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요일을 입력 하세요==>");
		
		//week = sc.next();
		week = sc.nextLine(); // enter 이전의 문자열

		
		if ( week.equals("월요일")) 
		{
			System.out.println("월요일은 자바를 공부합니다.");
			System.out.println(week + " 출력합니다.");
		}else if ( week.equals("화요일")) 
		{
			System.out.println("화요일은 데이타베이스를 공부합니다.");
		}else if ( week.equals("수요일")) 
		{
			System.out.println("수요일은 html javascipt를 공부합니다.");
			
		}else if ( week.equals("목요일")) 
		{
			System.out.println("목요일은 JSP를 공부합니다.");
			
		}else if ( week.equals("금요일")) 
		{
			System.out.println("금요일은 String를 공부합니다.");
			
		}else if ( week.equals("토요일")) 
		{
			System.out.println("토요일은 운동을 공부합니다.");
			
		}else if ( week.equals("일요일")) 
		{
			System.out.println("일요일은 TV를 시청합니다.");
		}else
		{
			System.out.println("end");
		}

	}

}
