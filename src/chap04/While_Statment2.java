package chap04;

public class While_Statment2 {

	public static void main(String[] args) 
	{
		int a = 1;
		while (a > 0 )
		{
			System.out.println("무한 루프 작동 : " +a);
			if (a == 1000) break;
			
			a++;
		}

	}

}
