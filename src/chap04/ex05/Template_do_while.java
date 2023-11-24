package chap04.ex05;

import java.util.Scanner;

public class Template_do_while {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a;   // 스캐너로 입력
		
		do 
		{
			System.out.println("===============================================");
			System.out.println(" 1.평균출력 || 2.합계출력 || 3.이름출력|| 4.프로그램종료 ");
			System.out.println("===============================================");
			System.out.println("위 의 내용을 정수로 입력 하세요  >>");
			
			a = sc.nextInt();
			
			if ( a == 1 )
			{
				System.out.println("1.평균출력 ");
			}else if ( a == 2 )
			{
				System.out.println("2.합계출력 ");
			}else if ( a == 3 )
			{
				System.out.println("3.이름출력 ");
			}else if ( a == 4 )
			{
				System.out.println("4.프로그램을 종료 합니다. ");
				break;
			}
			
		}while(true);

		sc.close();  // 메모리에서 스캐너 제거 해야 함.

	}

}
