package lab.chap04;

public class While_Statment {

	public static void main(String[] args) 
	{
	// 1000 부터 1까지 5씩 감소하면서 출력	: for문, while 문으로 출력

		int cnt = 1000;
		
		System.out.println(" for " );
		/*
		for (int i = 0; i < 1000 ; i++)
		{
			 
			if (cnt <= 1)  break;
			System.out.println(" cnt = " + cnt);
			cnt -=5;
		}
		*/
		
		
		for (int i = 1000; i > 0 ; i -=5)
		{			 
			if (i <= 1)  break;
			System.out.println(" i = " + i);			
		}
		
		int cnt1 = 1000;
		System.out.println(" while " );
		
		while(cnt1 >1)
		{
			System.out.println(" cnt1 = " + cnt1);
			if (cnt1 < 1)  break;			
			cnt1 -=5;
		}
	}

}
