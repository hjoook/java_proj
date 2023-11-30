package lab.chap07;

//Ctrl +Shift + o : 자동 import
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_vs_ArrayList {

	public static void main(String[] args) 
	{
	/*
	    배열  : arr         : 100번방, 10의 배수만 저장 후 출력 , for, Arrays.toString
	    
	    컬렉션 : aList      : 20의 배수 100번까지, for문으로 출력
	 */
		
		/****************************************************************************/
		//배열		
		int[] arr = new int[100];
		
		for(int i = 0 , a= 0; i < arr.length ; i++) 
		{
			a = a+10;
			arr[i] = a;
		}
		
		System.out.println("====== 배열 ======");
		System.out.println(Arrays.toString(arr));
		for (int i = 0 ; i < arr.length ; i++)
		{
			System.out.println("Index " + i + ": " + arr[i]);
		}
		
		
		/****************************************************************************/
		/*
		   컬렉션 :  
		 		ArrayList :  자동으로 방크기가 늘어나고 줄어든다. 제너릭 타입으로 선언 
		 		          int : Integer
		                  double : Double
		                  long : Long
		                  boolean :Boolean
		                  byte : Byte
		                  char : Charcter
		        import 해서 사용
		        ArrayList 선언
		        매소드 사용해서 값을 넣고, 삭제 , 출력
		        aList.add(값)        // 마지막 방에 추가
		        aList.add(index, 값) // index 방번호에 값을 넣음.
		        aList.size()        // 방의 갯수
		        aList.remove(index) // index  값을 삭제
		        aList.get(index)    // index값을 출력
		                  
		 */
		// 선언 방법 3가지 
		List<Integer> aList         = new ArrayList<>();
		List<Integer> aList2        = new ArrayList<Integer>();		
		ArrayList<Integer> aList3   = new ArrayList<Integer>();
		//for(int i = 0 , a= 1; i < 100 ; i++)
		for(int i = 1 ; i <= 100 ; i++) 
		{
			//a = a+20;
			//aList.add(a);
			aList.add(i * 20);
		}
		
		//Enhanced
		for (int k : arr)
		{
			System.out.println(k);
		}
		
		System.out.println("====== 컬렉션(ArrayList) ======");
		System.out.println("ArrayList size : " +aList.size()); // ArrayList 건수 100
		System.out.println("====ArrayList 전체 출력");  
		System.out.println(aList);                             //  20, 40, 60, 80, 100, 120, 140, 160 ~
		
		System.out.println("====개별 출력");
		for (int i = 0 ; i < aList.size() ; i++)
		{
			System.out.println("Index " + i + ": " + aList.get(i));
		}
		
		aList.add(0, 1000);                                     // ArrayList 0번 index에 1000 추가
		System.out.println("ArrayList size : " +aList.size());  // 101
		System.out.println(aList);                              // 1000, 20, 40, 60, 80,  ~
		aList.remove(0);                                        // ArrayList 삭제
		aList.remove(1);  
		System.out.println("ArrayList size : " +aList.size());  // 99
		
		aList.add(10004);                                       // ArrayList index 마기막에 추가
		System.out.println("ArrayList size : " +aList.size());  // 100
		System.out.println(aList);                              // ~ 1960, 1980, 2000, 10004

	} // main

}
