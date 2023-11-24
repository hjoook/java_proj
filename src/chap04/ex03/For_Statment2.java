package chap04.ex03;

public class For_Statment2 {

	public static void main(String[] args) 
	{
		/*
		for (초기식; 조건; 증감식) {
			반복할 구문 
		}
		*/
		
		// 초기식과 증감식에 여러개의 변수가 적용될 수 있다.
		for (int i=0 , j=0 ; i <= 100 ; i += 3, j++)
		{
			System.out.println("i 변수의 값 : " + i + "\t j 변수의 값 : " + j);
		}
		
		// 1~100까지 3애의 배수 출력
		for(int i=1 ; i <=100 ; i++ )
		{
			if (i % 3 == 0)
			{
				System.out.println("i=>" + i);
			}				
		} 

	}

}
