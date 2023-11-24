package chap04.ex04;

public class While_Statment {

	public static void main(String[] args) 
	{
		System.out.println("for 문 출력");
		for (int i=0; i <10; i++)
		{
			System.out.println("for 문으로 출력 i :" +i);
			
		}
		
		System.out.println("while 문 출력");
		
		int a = 0;
		while (a <10)
		{
			System.out.println("while 문으로 출력 a :" +a);
			a++;
		}
	}
}
