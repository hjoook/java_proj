package chap05.ex02;

public class Array_Definition2 {

	public static void main(String[] args) 
	{
	/*
	   배열 : 방의 갯수를 선언 해야함. 방의 갯수를 수정할 수 없다 
	         배열 방에 들어갈 자료형을 선언해야함
	   
	    실수 배열	
	 */
		
		double[] arr = new double[5];
		
		System.out.println("arr 배열의 0번째 방의 값을 출력 : " + arr[0]);
		System.out.println("arr 배열의 1번째 방의 값을 출력 : " + arr[1]);
		System.out.println("arr 배열의 2번째 방의 값을 출력 : " + arr[2]);
		System.out.println("arr 배열의 3번째 방의 값을 출력 : " + arr[3]);
		System.out.println("arr 배열의 4번째 방의 값을 출력 : " + arr[4]);		
		
        arr[0]	= 10.1;			
        arr[1]	= 20.1;		
        arr[2]	= 30.1;	
        arr[3]	= 40.1;
        arr[4]	= 50.1;
        
		System.out.println("arr 배열의 0번째 방의 값을 출력 : " + arr[0]);
		System.out.println("arr 배열의 1번째 방의 값을 출력 : " + arr[1]);
		System.out.println("arr 배열의 2번째 방의 값을 출력 : " + arr[2]);
		System.out.println("arr 배열의 3번째 방의 값을 출력 : " + arr[3]);
		System.out.println("arr 배열의 4번째 방의 값을 출력 : " + arr[4]);		
		
		System.out.println( "=== for ===");
		for(int i= 0 ; i <5 ; i++)
		{
			System.out.println("arr 배열의 " + i +"번째 방의 값을 출력 : " + arr[i] );
		}
		
		// arr.length : 배열의 방의 갯수를 출력
		System.out.println(arr.length); // 5
		
		for(int i= 0 ; i <arr.length ; i++)
		{
			System.out.println("arr 배열의 " + i +"번째 방의 값을 출력 : " + arr[i] );
		}
		
		int[] arr2 = new int[100]; 
		
		//int j = 1;
		System.out.println( "=== arr2[] ===");
		for(int i=0 , j = 1; i < arr2.length ; i++) 
		{			
			arr2[i] = j;
			j++;
		}
		
		for(int i=0 ; i < arr2.length ; i++) 
		{	
			System.out.println("arr2 배열의 " + i +"번째 방의 값을 출력 : " + arr2[i] );
		}
		
	}

}
