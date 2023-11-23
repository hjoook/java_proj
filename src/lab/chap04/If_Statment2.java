package lab.chap04;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class If_Statment2 
{
	public static void main(String[] args) 
	{
		/* 정수값 입력 받으세요. 자산의 자산을 입력
		   0 ~ 1000 만원 : 버스나 지하철을 타고 다닙니다.
		   1000만원 ~ 1억  : 택시를 타고 다닙니다.
		   1억이상         : 비행기를 타고 다닙니다. 
		 */
		 Scanner sc                = new Scanner(System.in);
		 DecimalFormat decFormat   = new DecimalFormat("###,###");   // 금액을 표현할 때 숫자 3자리마다 콤마(,)를 찍고 싶을 때
		 NumberFormat numberFormat = NumberFormat.getInstance();     // 이것도 가능 
		 
		 int cap = 0;
		
		 System.out.println("자산을 입력하세요 ===>");
		 
		 cap = sc.nextInt();
		 
		 if (cap >= 100000000) 
		 {			 
		 	 System.out.println("입력자산은 " + cap + "원. 비행기를 타고 다닙니다.");
		 }else if (cap >= 10000000)
		 {
			 System.out.println("입력자산은 " + cap + "원. 택시를 타고 다닙니다."); 
		 }else if (cap >=0 ) 
		 {
			 System.out.println("입력자산은 " + cap + "원. 버스나 지하철을 타고 다닙니다.");
		 }else
		 {
			 System.out.println("입력자산은 " + cap + "원.");
		 }
		
		 System.out.println("입력자산은 " + decFormat.format(cap)    + "원");  // 천단위 , 출력
		 System.out.println("입력자산은 " + numberFormat.format(cap) + "원");
		
	}


}
