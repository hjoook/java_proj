package lab.chap05;

import java.util.Arrays;

public class Ractangle_Array {

	public static void main(String[] args) 
	{
		
		/* 
		  선언 arr [3][10] 
		            행 0~2 arr.length
		            열 0~9 arr[0].length
		  0행 : 1~ 1씩증가
		  1행 : 3의 배수
		  2행 : 7의배수, 8의 배수
		 */
		int[][] arr = new int[3][10];  
		
		System.out.println("행 : " + arr.length);
		System.out.println("열[0] : " + arr[0].length);
		System.out.println("열[1] : " + arr[1].length);
		System.out.println("열[2] : " + arr[2].length);
		System.out.println();
		
		for( int i = 0 ; i < arr.length ; i++  )  // 행 반복, 1차월 배열
		{
			int cnt = 0;
			for( int j = 0 ; j < arr[i].length ; j++  )  // 열 반복,
			{				
				if (i==0)  //+1씩 증가
				{					
					arr[i][j] = ++cnt; 
				}else if (i==1) // 3의배수
				{				
					arr[i][j] = cnt+=3;
				}else if (i ==2) // 7,8의 배수
				{				
					for (int t = cnt +1 ; ; t++ )
					{								
						if ((t%7) == 0 || (t%8) == 0)  
					    {
					        arr[i][j] = t;	
					        t++;
					        break;				    
					    }
					}					
					cnt = arr[i][j];
				} //if (i ==2)				
					
			} // j end		
		 
		} // i end
		
		System.out.println();
		System.out.println("for문 사용해서 출력"); 
		
		for (int i=0 ; i < arr.length  ; i++)           // arr1.length = 3
		{
			
			for(int j=0 ; j < arr[i].length ; j++)      // arr1[0].length  =4
			{
				//System.out.printf("arr1[%d][%d] = %d ", i, j, arr1[i][j] );
				System.out.print("arr[" + i + "]" + "[" +j + "] = " + arr[i][j] );
				System.out.print("\t");
				
			}
			System.out.println();					
		}
		
		System.out.println();
		System.out.println("Enhanced 사용해서 출력");
		
		for (int[] a : arr) 
		{
			for (int b : a) 
			{
				System.out.print(b);
			    System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Array.toString 사용해서 출력");
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));

	}

}
