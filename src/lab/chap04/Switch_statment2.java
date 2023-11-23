package lab.chap04;

import java.util.Scanner;

public class Switch_statment2 {

	public static void main(String[] args) 
	{
		// 월을 입력해서 해당 월은 00일 입니다.
		// 31을 출력되는 월 1,3,5,7,8,10,12
		// 30일 출력되는 월 4,,6,9,11
		// 28일 출력되는 월 2
		Scanner sc = new Scanner(System.in);
		
		int month = 0 ; 
		int day   = 30;
		
		System.out.println("월============>");
		
		month = sc.nextInt();
		
		switch(month)
		{
		    case 1  :
		    case 3  :	
		    case 5  :	
		    case 7  :	
		    case 8  :	
		    case 10 :	
		    case 12 : 
		    	System.out.println(month +"월은 31일 입니다.");
		    	break;
		    case 4  :
		    case 6  :	
		    case 9  :			    	
		    case 11 :
		    	System.out.println(month +"월은 30일 입니다.");
		    	break;
		    case 2 :
		    	System.out.println(month +"월은 28일 입니다.");
		    	break;
		    default :
		    	System.out.println("end");		 		    	
		} // switch

	}

}
