package lab.chap03;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 입력 : >>>");
		
		int aa = sc.nextInt();
		
		String str;
		
		/*
		if ((aa%2) == 0) 
		{
			str = "짝수";
		}else
	    {
	    	str = "홀수";	      	
	    }
		*/
		str = ((aa%2) == 0 )? "짝수" : "홀수"; 
		
		System.out.println("입력값은 " + aa + " 이고, "+ str +"입니다.");	
		
		//System.out.println((double)(aa%3));
	    
		if ((aa%3) == 0 || (aa%6) == 0 || (aa%9) == 0) 
		{
			System.out.println("입력값은 " + aa + " 이고, 3,6,9의 배수입니다.");
		}else
		{
			System.out.println("입력값은 " + aa + " 이고, 3,6,9의 배수가 아닙니다.");
		}
	}

}
