package chap04.ex03;

public class For_Statment3 {

	public static void main(String[] args) 
	{
		// 무한루프에서 break; 를 사용해서 무한루프 빠져나오기
		
		for(int i =0 ; i >=0 ; i += 10)
		{
			System.out.println(i);
			
			if (i == 10000)
			{
				break;
			}
		}
		System.out.println("=========================");
		
		/* 이중 for		 
		  
		 */
		
		for(int i =0 ; i <10 ; i++)
		{
			System.out.println("바깥쪽 for문 : " + i);
			for(int j = 0; j <10 ; j++)
			{
				//i = 10;
				System.out.println(" i 변수 : " + i + " j 변수 : " + j );
			}
			System.out.println("===============");		
		}
		
		/* 구구단 */
		System.out.println("===== 구구단 ==========");	
		for(int i=1 ; i <= 9 ; i++ )
		{
			System.out.println( i + " 단 ");		
			for (int j=1 ; j <= 9 ;  j++ )
			{
			    System.out.println( i + " * " + j + " = " + (i*j));
			}
			
			System.out.println();
		}	
		
		
	
	}

}
