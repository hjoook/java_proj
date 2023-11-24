package lab.chap04;

public class For_Statment {

	public static void main(String[] args) 
	{
		// 구구단 7단 출력

		for(int i=1 ; i <= 9 ; i++ )
		{
			System.out.println("7 * " + i + " = " + (7*i));
		}
		
		System.out.println("7단을 tab으로 구분해서 한 라인으로 출력");
		
		for(int i=1 , j=7 ; i <= 9 ; i++ )
		{
			System.out.printf("%d * %d = %d \t ", j, i, (i*j));
		}

		
//		for(int i=1 ; i <= 9 ; i++ )
//		{
//			for (int j=1 ; j <= 9 ;  j++ )
//			{
//			    if (j == 1 )
//			    {
//			    	System.out.println( i + " 단 ");				
//			    }
//			    
//			    
//			    System.out.println( i + " * " + j + " = " + (i*j));
//			}
//		}
		
		System.out.println();
		System.out.println("===== 구구단 ==========");	
		
		for(int i=1 ; i <= 9 ; i++ )
		{
			System.out.println();
	    	System.out.println( i + " 단 ");	
	    	
			for (int j=1 ; j <= 9 ;  j++ )
			{	    
			    //System.out.println( i + " * " + j + " = " + (i*j));
			    System.out.printf("%d * %d = %d \t ", i,  j, (i*j));
			}
			System.out.println();
		}		
	}		

}
