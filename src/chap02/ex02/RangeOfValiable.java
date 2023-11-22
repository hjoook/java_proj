package chap02.ex02;

public class RangeOfValiable {

	public static void main(String[] args) 
	{
		/*main 메소드 코드 자성
		  메소드 : 객체지향언어에서 함수를 메소드라고 호칭함. (메소드 == 함수)
		  변수의 사용 범위 : 전역 변수, 지역 변수		  
		  */
		int a =10;
		{
			int b = 20;
			System.out.println("a 변수의 값을 출력(내부블락) : "+ a);
			System.out.println("b 변수의 값을 출력(내부블락) : "+ b);
			
			{
				int c = 30;
				System.out.println("블락의 블락 a :" + a);
				System.out.println("블락의 블락 b :" + b);
				System.out.println("블락의 블락 c :" + c);							
			
			}
			
			//System.out.println("블락의 블락 c :" + c); 에러 발생			
		
		}

		System.out.println("a 변수의 값을 출력(외부블락) : "+ a);
		//System.out.println("b 변수의 값을 출력(외부블락) : "+ b);  에러 발생			
			
	}
}
