package lab.chap05;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Definition2 {

	public static void main(String[] args) 
	{
		//arr : String [6]
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[6];
		
		arr[0] = "자바";
		arr[1] = "html";
		arr[2] = "css";
		arr[3] = "JavaScript";
		arr[4] = "Oracle";
		arr[5] = "Spring";
		
		int Num; 			

		
		// do while
		do {
			System.out.println("정수값입력 >>>");
			Num = sc.nextInt();
			
			if (Num == 1)
			{
				    int selectNum; 		
				
					System.out.println("*****1.방번호 직접 찍어서 출력=>");
					selectNum = sc.nextInt();
					
					if (selectNum >=0 && selectNum <6 )
					{
						System.out.println("arr["+ selectNum +"] : " + arr[selectNum]);		
						
					}else 
					{
						System.out.println("프로그램 종료");
						break;
					}
					
			}else if  (Num == 2)
			{
				System.out.println("*****2.for문 사용해서 출력");
				for(int i =0 ; i < arr.length ; i++)
				{
					System.out.println("arr["+ i +"] : " + arr[i]);			
				}
			}
			else if  (Num == 3)
			{
				System.out.println("*****3.Enhanced for문을 사용해서 출력");
				
				for (String k : arr)
				{
					System.out.println(k);		
				}
			}
			else if  (Num == 4)
			{
				System.out.println("*****4.Arrays.toString 사용해서 출력");
				System.out.println(Arrays.toString(arr));
			}			
			else 
			{
				System.out.println("프로그램 종료");
				break;
			}
			
		}while(true);

		sc.close();

	}

}
