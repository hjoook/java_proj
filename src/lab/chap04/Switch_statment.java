package lab.chap04;

import java.util.Scanner;

public class Switch_statment {

	public static void main(String[] args) 
	{
//		스캐너로 정수값 입력 
//		1  " 당신은 금메달을 획득했습니다."
//		2  " 당신은 은메달을 획득했습니다.
//		3  " 당신은 동메달을 획득했습니다.
//		  " 점수 1~3 중 하나의 값을 넣으세요 "
		
		 Scanner sc = new Scanner(System.in);
		 
		 int medal = 0;
		 
		 System.out.println("정수값을 넣으세요 ==>");
		 
		 medal = sc.nextInt();
		 
		 switch(medal)
		 {
    		 case 1 : case 20 :  case 30 :             // 다중 case
    			 System.out.println(" 당신은 금메달을 획득했습니다.");
    			 break;
    		 case 2 :
    			 System.out.println(" 당신은 은메달을 획득했습니다.");
    			 break;
    		 case 3 :
    			 System.out.println(" 당신은 동메달을 획득했습니다.");
    		     break;
    	     default :
    	    	 System.out.println(" 점수 1~3 중 하나의 값을 넣으세요 ");	    	 
	    	 
		 } // switch
		 
         if(medal==1)		
		 {
			 System.out.println(" 당신은 금메달을 획득했습니다.");
		 }else if (medal == 2)
		 {
			 System.out.println(" 당신은 은메달을 획득했습니다.");
		 }else if (medal == 3)
		 {
			 System.out.println(" 당신은 동메달을 획득했습니다.");
		 }else
		 {
			 System.out.println(" 점수 1~3 중 하나의 값을 넣으세요 ");	    	
		 } //if


	} // main

}
