package chap05.ex07;

import java.util.Arrays;

public class Ractangle_Array {

	public static void main(String[] args) 
	{
		/* 2차원 배열 선언 방법 4가지
		   
		 */
		//1.
		int[][] arr1 = new int[3][4];
		
		int[][] arr2;
		arr2 = new int[3][4];
		
		//2. 배열 변수명[][]
		int arr3[][] = new  int[3][4];
		
		int arr4[][];
		arr4 = new int[3][4];
	    	
		//3. 배열변수선언시 값을 바로 할당 : 방크기 지정하면 오류발생
		int[][] arr5 = new int[][] { {1,2,3,4,5}, {10,20,30,40,50}, {100,200,300,400,500}};
		System.out.println(arr5[2][4]);  // 500
		
		int[][] arr6;
		arr6 = new int[][] { {1,2,3,4}, {10,20,30,40}, {100,200,300,400}};
		System.out.println(arr5[2][3]);  // 400
		
		System.out.println(Arrays.toString(arr6[0])); // 1,2,3,4,5
		System.out.println(Arrays.toString(arr6[1])); // 10,20,30,40,50
		System.out.println(Arrays.deepToString(arr6)); // [[1, 2, 3, 4], [10, 20, 30, 40], [100, 200, 300, 400]]
	
		//4. 배열 변수 선언시 값을 바로 할당 new int[][] 생략 사용
		//   주의 :  선언과 값을 분리할 수 없다. 오류발생
		int[][] arr7 =  { {1,2,3}, {10,20,30}, {100,200,300}};
		
		//int[][] arr8;
		//int[][] arr8 =  { {1,2,3}, {10,20,30}, {100,200,300}};   // 에러 발생

		
		
	}

}
