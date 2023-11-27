package chap05.ex03;

import java.util.Arrays;

public class Array_Definition3 {

	public static void main(String[] args) 
	{
	/*
	   배열의 값을 출력하는 방법
	   배열 출력 방법 4가지	
	 */
		
		int[] arr = new int[1000];  // 정수 배열 선언
		String[] arr1 = new String[10];   // 문자열
		
		arr1[0] = "자바";
		arr1[1] = "html";
		
		// 6의 배수
		for(int i=0, j=0; i < arr.length ; i++)
		{
			j +=6;
			arr[i] = j;			
		}
	
		//1. 방번호 직접 출력
		System.out.println("1.========");
		System.out.println(arr[999]);
		
		//2. for문 사용해서 출력
		System.out.println("2.========");
		for(int i =0 ; i < arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	
		//3.형상된 for 문을 사용해서 출력 : 배열의 처음부터 마지막방까지 (모든 방의 내용 출력)
		System.out.println("3.========");
		for(int k : arr)
		{
			System.out.println(k);  //배열의 처음부터 마지막방까지 출력
		}


		for(String k : arr1)
		{
			//if (k.equals(null)) break; //continue;  
			System.out.println(k);  //배열의 처음부터 마지막방까지 출력
		}		
		
		
		//4. Array.toString(배열변수) : 배열의 모든값을 출력
		System.out.println("4.========");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
	}

}
