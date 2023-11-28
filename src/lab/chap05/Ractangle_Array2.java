package lab.chap05;

import java.util.Arrays;

public class Ractangle_Array2 {

	public static void main(String[] args) 
	{
		/*
		   arr : 배열변수명 2차원배열 [5][10]
		   arr[0] : 짝수
		   arr[1] : 홀수 3의 배수 제외하고 저장
		   arr[2] : 4, 5의 배수 저장, 
		   arr[3] : 10의 배수 저장
		   arr[4] : 8단을 입력 
		  
		 */
		
		int[][] arr = new int[5][10];
		int[][] arr2 = new int[5][10];
		
        //arr[0].equals(args)
		
		
		
		
		for (int i=0 ; i < arr.length  ; i++)          
		{
			int cnt = 0;
			int cnt1 =1;
			for(int j=0 ; j < arr[i].length ; j++)    
			{
				
				if (i==0)  // 짝수
				{
					++cnt;
					arr[i][j] = cnt * 2;					
					
				}else if (i==1)  // 홀수 3의배수 제외
				{	
					
					if(cnt ==0) cnt =1;
			    	if(cnt %3 ==0)
					{
						cnt = cnt +2;					
					}			
					
					arr[i][j] = cnt ;
					cnt = cnt +2;
					
					
					/*  *** 강사님
					 for (int j =0 ; j < arr[i].length; cnt1++) { 
					 if (cnt1%2 !=0 )  // 홀수 
					 {
					     if( cnt1%3 != 0 )  // 3의 배수가 아닐때
					     {
					         arr[i][j] = cnt1 ;
					         j++;
					     }
					 }  
					 }
					 */
					 
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
				
			}  // j end			
			
		} // i end 
	
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
		
		
		System.out.println();
		System.out.println("Array.toString 사용해서 출력");
		
		for (int i = 0 ; i < arr.length ; i++)
		{
			System.out.println(Arrays.toString(arr[i]));

		}
		
		System.out.println(" 한방에 출력 ");
		System.out.println(Arrays.deepToString(arr));  //값으로 출력
		System.out.println(Arrays.toString(arr));      // heap으로 출력
		
		// 비교처리
		// 1차원일때 Arrays.equals()
		// 2차원일때 Arrays.deepEquals()
		
		arr2 = arr;
		System.out.println(" equals 출력 ");
		System.out.println(Arrays.equals(arr,arr2));  //값으로 출력
		System.out.println(Arrays.deepEquals(arr,arr2));      // heap으로 출력
		
		// 배열값을 비교
		System.out.println(" 배열값을 비교 ");
		if(arr[0][0] != arr[0][1])
		{
           System.out.println("배열 방의 값이 동일여부 "+arr[0][0] +", " + arr[0][1]);
        }
		
		
		arr[0][0] = 10;
		arr[0][1] = 10;
		
		if(arr[0][0] != arr[0][1])
		{
           System.out.println("배열 방의 값이 동일여부");
        }
		  

	}
}
