package chap05.ex08;

import java.util.Arrays;
import java.util.Iterator;

public class NonRactangle_Array {

	public static void main(String[] args) 
	{
		//2차원 배열 : 비정방형 배열 . 형에 대해서 열의 갯수가 다른 배열
		
		//1. 비정방형 배열 선언(행만정의)
		int[][] arr = new int[3][];  //행만 정의
		
		//2. 행에 대한 열의 방의 크기 지정
		arr[0] = new int[2];   // 0번 행에 2개의 열 지정
		arr[1] = new int[3];   // 1번 행에 3개의 열 지정
		arr[2] = new int[5];   // 2번 행에 5개의 열 지정

		System.out.println(arr[0].length);  //2
		System.out.println(arr[1].length);  //3
		System.out.println(arr[2].length);  //5
		
		System.out.println(Arrays.toString(arr[0]));  //2
		System.out.println(Arrays.toString(arr[1]));  //3
		System.out.println(Arrays.toString(arr[2]));  //5
	}

}
