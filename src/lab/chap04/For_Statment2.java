package lab.chap04;

public class For_Statment2 {

	public static void main(String[] args) 
	{
	// 1~19단까지 , 옆으로 출력 , 6, 7, 12단 제외

		System.out.println("===== 구구단 ==========");	
		
		for(int i=1 ; i <= 19 ; i++ )
		{
			//System.out.println();
	    	System.out.println( i + " 단 " );	
	    	
			if (i == 6 || i == 7 || i == 12)
			{
				continue;
			}
	    	
			for (int j=1 ; j <= 9 ;  j++ )
			{	

			    //System.out.println( i + " * " + j + " = " + (i*j));
//				if (i == 6 || i == 7 || i == 12)
//				{
//					continue;
//				}
				
			    System.out.printf("%d * %d = %d \t ", i,  j, (i*j));				
		    		
			}
			System.out.println();
		}	
	}

}
