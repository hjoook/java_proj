package lab.chap04;

import java.util.Scanner;

public class do_While_Statment2 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int a;   // 스캐너로 입력
		int aa  = 0;
		
		int sum = 0;
		int cnt = 0;
		
		do 
		{
			System.out.println("======================================================================================================================================");
			System.out.println(" 1.구구단 출력 || 2.19단 출력 || 3.1~1000까지 3의배수 출력 || "
					         + " 4.10개의 정수를 입력받아 그 수 중 짝수의 개수가 몇개인지? 4.프로그램종료 ");		    				
			System.out.println("======================================================================================================================================");
			System.out.println("위 의 내용을 정수로 입력 하세요  >>");
			
			a = sc.nextInt();
			
			if ( a == 1 )
			{
				System.out.println("1.구구단 출력 ");

				for(int i=1 ; i <= 9 ; i++ )
				{
					//System.out.println();
			    	System.out.println( i + " 단 " );	
			    				    	
					for (int j=1 ; j <= 9 ;  j++ )
					{							
					    System.out.printf("%d * %d = %d \t ", i,  j, (i*j));				
				    		
					}
					System.out.println();
				}
			}else if ( a == 2 )
			{
				System.out.println("2.19단 출력 ");
				
				for(int i=1 ; i <= 19 ; i++ )
				{
					//System.out.println();
			    	System.out.println( i + " 단 " );	
			    				    	
					for (int j=1 ; j <= 19 ;  j++ )
					{							
					    System.out.printf("%d * %d = %d \t ", i,  j, (i*j));				
				    		
					}
					System.out.println();
				}
				
			}else if ( a == 3 )
			{ // for, while, do while
				System.out.println("3.1~1000까지 3의배수 출력 ");
				
				System.out.println(" for 문  ");
				for (int i = 1 ; i <= 1000 ; i++)
				{
					if (i%3 == 0)
					{
						System.out.println(" for 문 3의 배수 " + i);
					}
				}			
				
				System.out.println(" while 문  ");
				while (aa <= 1000)
				{
					if (aa%3 == 0)
					{
						System.out.println(" while 문 3의 배수 " + aa);
					}
					aa++;
				}
				
				aa = 0;
				System.out.println(" do while 문  ");
				do
				{
					if (aa%3 == 0)
					{
						System.out.println(" do while 문 3의 배수 " + aa);
					}
					aa++;
					
				}while (aa <= 1000); 
				
			}else if ( a == 4 )
			{
				int j   = 0;
				
				System.out.println(" 정수를 10번 입력하세요 => ");
				
			    for (int i = 1 ; i <=10 ; i++)
			    {			        
			    	cnt = sc.nextInt();
			    	
			    	if (cnt <= 0) continue;  // 음수 제외
			    	
			    	if (cnt % 2 == 0)
			    	{
			    		j++;
			    		sum = sum+cnt;
			    	}
			    }
			    
				System.out.println(" 짝수의 갯수는 : " + j +" 짝수의 합은 : " + sum);
				
			}else if ( a == 5 )
			{
				System.out.println("5.프로그램을 종료 합니다. ");
				break;
			}
			
		}while(true);

		sc.close();  // 메모리에서 스캐너 제거 해야 함.
		

	}

}
