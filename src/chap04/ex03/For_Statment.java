package chap04.ex03;

public class For_Statment {

	public static void main(String[] args) 
	{
		/*
		제어문 : 프로그램의 조건에 따라서 순서를 바꿔 줌. if, switch
		반복문 : 프로그램을 계속 반복 하도록 하는 구분
		       조건이 무한 루프에 빠지지 않도록 처리.  for, while, do while
		       
		       for (변수의 초기값; 조건;증감식){}
		*/
		for (int i = 0 ; i <=10 ; i++) 
		{
			System.out.println("오늘 날씨는 좋습니다. : " + i);
		}
	
		int a;
		for (a= 0; a>=0 ; a++){
			System.out.println(a);
		}

		
	}

}
