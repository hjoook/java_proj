package chap05.ex06;

import java.util.Arrays;

public class Ractangle_Array {

	public static void main(String[] args) 
	{
		/*
		   다차원 배열 : 2차원 정방형 배열
		 */
	
		/* 1. 2차원 정방향 배열
		 * 
		        int[][] arr1 = new int[3][4]  //  [행][열]
		             0    1     2    3
		         0 |----|----|----|----|
		         1 |----|----|----|----|
		         2 |----|----|----|----|
		         
		         arr1.length : 1차원일때는 열의 갯수
                               2차원일때는 행의 갯수 (3)		         
                 arr1[0].length  : 열의 갯수 (4)              
		*/
		
		int[][] arr1 = new int[3][4];       //  [행][열] heap 의 값을 저장
		
		//2. 각 index (방번호)에 값을 넣음.
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[0][3] = 4;
		
		arr1[1][0] = 10;
		arr1[1][1] = 20;
		arr1[1][2] = 30;
		arr1[1][3] = 40;
		
		arr1[2][0] = 100;
		arr1[2][1] = 200;
		arr1[2][2] = 300;
		arr1[2][3] = 400;
		
		//arr1[2][4] = 500;  // 실행할때 오류 발생
		
		//3. 출력 
		System.out.println("직접출력");
		System.out.println(arr1[0][0]);
		System.out.println(arr1[1][1]);
		System.out.println(arr1[2][3]);
		
		System.out.println();
		System.out.println("for문 사용해서 출력"); 
		
		System.out.println("arr1의 length (행의 갯수)    : " + arr1.length   ); // 3
		System.out.println("arr1[0]의 length (열의 갯수) : " + arr1[0].length); // 4
		
		System.out.println();
		
		for (int i=0 ; i < arr1.length  ; i++)           // arr1.length = 3
		{
			
			for(int j=0 ; j < arr1[i].length ; j++)      // arr1[0].length  =4
			{
				//System.out.printf("arr1[%d][%d] = %d ", i, j, arr1[i][j] );
				System.out.print("arr[" + i + "]" + "[" +j + "] = " + arr1[i][j] );
				System.out.print("\t");
				
			}
			System.out.println();					
		}
			 
		System.out.println();
		System.out.println("Enhanced 사용해서 출력");
		
		for (int[] a : arr1) 
		{
			for (int b : a) 
			{
				System.out.print(b);
			    System.out.print("\t");
			}
			System.out.println();
		}
		
		//출력 5
		System.out.println();
		System.out.println("Array.toString 사용해서 출력");
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		System.out.println(Arrays.toString(arr1[2]));
		
		System.out.println("Array.deepToString 사용해서 출력");
		System.out.println(Arrays.deepToString(arr1));  //deepToString
	
		
		

	}

}
