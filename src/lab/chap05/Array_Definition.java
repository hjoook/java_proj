package lab.chap05;

public class Array_Definition {

	public static void main(String[] args) 
	{
		//1000개의 방에 3의 배수를 저장
		
		int[]     arr = new int[1000];
		String[] arr1 = new String[10];   // 문자열
		
			
		System.out.println(arr.length);
		System.out.println(arr1.length);
		
		arr1[0] = "자바";
		arr1[1] = "html";
		
		//for (int i=0 ; i < arr.length ; i++)
/*
		for (int i=0 ; i < 1000 ; i++)
		{
			arr[i] = i;
			
			if( arr[i] >0)
			{
				System.out.println("arr 3의 배수배열의 " + i +"번째 방의 값을 출력 : " + arr[i] );
			}
		}
		
		*/
		
		System.out.println(arr1[0]+ arr1[1]);
		
		for (int i=0, j=0 ; i < arr.length ; i++) // 0~999 , 1씩 증가
		{
			//j= j+3;
			
			j+=3;
			arr[i] = j;
			
			System.out.println("arr 3의 배수배열의 " + i +"번째 방의 값을 출력 : " + arr[i] );
			
		}

	}

}
