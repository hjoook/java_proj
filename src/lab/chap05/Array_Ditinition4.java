package lab.chap05;

import java.util.Arrays;

public class Array_Ditinition4 {

	public static void main(String[] args) 
	{		/*
		   arr : 배열변수명 2차원배열 [5][10]
		   arr[0] : 짝수
		   arr[1] : 홀수 3의 배수 제외하고 저장
		   arr[2] : 4, 5의 배수 저장, 
		   arr[3] : 10의 배수 저장
		   arr[4] : 8단을 입력 
		  
		 */
		
		int[][] arr = new int[5][10];
		
		System.out.println("for문 사용해서 출력"); 
		
		for (int i=0 ; i < arr.length  ; i++)          
		{
			int cnt = 0;
			for(int j=0 ; j < arr[i].length ; j++)    
			{
				
				if (i==0)
				{
					++cnt;
					arr[i][j] = cnt * 2;					
					
				}else if (i==1)
				{
					++cnt;
					if (cnt % 3 == 0 || cnt%2 == 0 )
					{
						cnt++;
					}
					arr[i][j] = cnt ;	
					
				}else if (i==2)
				{
					for (int t = cnt +1 ; ; t++ )
					{								
						if ((t%4) == 0 || (t%5) == 0)  
					    {
					        arr[i][j] = t;	
					        t++;
					        break;				    
					    }
					}					
					cnt = arr[i][j];
				
				}else if (i==3)
				{
					for (int t = cnt +1 ; ; t++ )
					{								
						if ((t%10) == 0 )  
					    {
					        arr[i][j] = t;	
					        t++;
					        break;				    
					    }
					}					
					cnt = arr[i][j];
				}else if (i==4)
				{
					++cnt;
					arr[i][j] = 8 * cnt;					
					
				} // if end			
				
				System.out.print("arr[" + i + "]" + "[" +j + "] = " + arr[i][j] );
				System.out.print("\t");
			}  // j end
			
		} // i end 
	
//		System.out.println("for문 사용해서 출력"); 
//		for (int i=0 ; i < arr.length  ; i++)           // arr1.length = 3
//		{
//			
//			for(int j=0 ; j < arr[i].length ; j++)      // arr1[0].length  =4
//			{
//				//System.out.printf("arr1[%d][%d] = %d ", i, j, arr1[i][j] );
//				System.out.print("arr[" + i + "]" + "[" +j + "] = " + arr[i][j] );
//				System.out.print("\t");
//				
//			}
//			System.out.println();					
//		}
		
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
		
		
//		System.out.println();
//		System.out.println("Array.toString 사용해서 출력");
//		System.out.println(Arrays.toString(arr[0]));
//		

	}

}
