package lab.chap05;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Definition3 {

	public static void main(String[] args) 
	{
//		1.스캐너로 배열방 크기 지정 7의 배수와 8의 배수를 저장후 출력
//		2.스캐너로 배열방 크기 지정 1씩 증가하는데 4 빼고 저장 후 출력
//		3.스캐너로 배열방 크기 지정 3의 배수는 저장하고 6의 배수는 빼고 저장 후 출력
		Scanner sc = new Scanner(System.in);
		int num ;  // 배열
		int no ;   // switch case
		
		System.out.println("============================================================");
		System.out.println("1. 7,8의 배수 || 2. 1씩 증가(4제외) || 3. 3의 배수(6의배수 제외) >>>");
		System.out.println("============================================================");
		no = sc.nextInt();
		
		System.out.println("배열방 크기 지정 >>>");

		num = sc.nextInt();
		int[] arr = new int[num]; 
		
		switch(no)
		{		
		
		case 1 : 	   
		   System.out.println("7의 배수 배열의크기 => " +arr.length);
		   for(int i = 0 , j=0 ; i < arr.length ; i++)
		   {
		   	    j += 7;
		   	    arr[i] = j;
		   	    System.out.println("7의 배수 출력 arr[" + i + "] : " + arr[i]);
		   }
		   
		   System.out.println();
		   System.out.println("*****Arrays.toString 사용해서 출력");
		   System.out.println(Arrays.toString(arr));
		
		   System.out.println();
		   System.out.println("8의 배수");
		   for(int i = 0 , j=0 ; i < arr.length ; i++)
		   {
		   	j += 8;
		   	arr[i] = j;
		   	System.out.println("8의 배수 출력 arr[" + i + "] : " + arr[i]);
		   }
		   
		   System.out.println();
		   System.out.println("*****Enhanced for문을 사용해서 출력");
		   for (int k : arr)
			{
				System.out.println(k);		
			}
		   
		   System.out.println();
		   /***************************************************************************/
		   System.out.println("7, 8의 배수  => " );
		   for(int i= 0, j= 1 ; ; j++)
		   {
			   if(i == num) break;			   
			   	   			   
			   if ((j%7) == 0  || (j%8) == 0)
			   {				   
				   arr[i] = j;	
				   System.out.println("7,8의 배수 출력 arr[" + i + "] : " + arr[i]);
				   i++;				 
			   }		
		   }
		   
		   for(int i = 0  ; i < arr.length ; i++) 
		   {
			   System.out.println("7,8의 배수 출력 arr[" + i + "] : " + arr[i]);
		   }
		   
		   /***************************************************************************/		   
		   break;
		   
		case 2:
		    System.out.println("+ 1씩 증가 4빼고 출력 및 배열의크기 => " +arr.length);
		    for(int i = 0 , j=1 ; i < arr.length ; i++)
		    {
		    	
		    	if (j %4 != 0)
		    	{
		    	    arr[i] = j;
		    	   
		    	}else 
		    	{
		    		j += 1;
		    	    arr[i] = j; 
		    	 }
		    	j+= 1;
		    	System.out.println("1씩 증가 arr[" + i + "] : " + arr[i]);
		    	
		    }
		    
		    System.out.println("++ 1씩 증가 4빼고 출력 및 배열의크기 => " +arr.length);
		    for (int i=0 , j=1 ; i < arr.length ; j++)
		    {
		    	if(j%4 == 0 ) continue;
		    	
		    	arr[i] = j;
		    	System.out.println("1씩 증가 arr[" + i + "] : " + arr[i]);
		    	i++;
		    }
		    
		    break;
		    
		case 3 :
		    System.out.println("*3의 배수 출력 6의 배수는 제외 및 배열의크기 => " +arr.length);
		    for(int i = 0 , j=0 ; i < arr.length ; i++)
		    {
		    	
		    	if (j%6 != 0)
		    	{
		    	    arr[i] = j;
		    	    j += 3;
		    	}else
		    	{
		    		j += 3;
		    	    arr[i] = j; 
		    	 }
		    	j+= 3;
		    	System.out.println("3의 배수 arr[" + i + "] : " + arr[i]);
		    	
		    }
		    
		    System.out.println("**3의 배수 출력 6의 배수는 제외 및 배열의크기 => " +arr.length);
		    for(int i = 0 , j=1 ; i < arr.length ; j++)
		    {		    	
		    	if ((j%3 == 0) && (j%6 != 0))
		    	{
		    	    arr[i] = j;
		    	    System.out.println("3의 배수 arr[" + i + "] : " + arr[i]);
		    	    i += 1;
		    	}
		    }		    
		    
		    break;
		    
		 default : 
			 System.out.println("프로그램 종료");
			 break;
		}
		sc.close();

	}

}
