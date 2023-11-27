package chap05.ex04;

public class Array_Ditinition {

	public static void main(String[] args) 
	{
	/*
	   배열의 선언방법 	
	 */
		//1.
		int[] arr1 = new int[3];
				
		int[] arr2;
		arr2 = new int[3]; 
		
		//2.		
		int arr3[] = new int[3];
		
		int arr4[];
		arr4 = new int[3];
		
		//3.
		int[] arr5 = new int[] {10,20,30,40,50};  // 크기 지정하면 안됨
		
		System.out.println(arr5[0]);    // 10   
		System.out.println(arr5[1]);    // 20
		System.out.println(arr5[2]);    // 30
		System.out.println(arr5[3]);    // 40
		System.out.println(arr5[4]);    // 50
		
		System.out.println(arr5.length);  //5
		System.out.println();
		
		int[] arr6;
		arr6 = new int[] {100,200,300,400,500,600,700};
		
		int arr7[];
		arr7 = new int[] {100,200,300,400,500,600,700};		
		System.out.println(arr7[0]);    // 100   
		System.out.println(arr7[1]);    // 200
		System.out.println(arr7[2]);    // 300
		System.out.println(arr7[3]);    // 400
		System.out.println(arr7[4]);    // 500
		System.out.println(arr7[5]);    // 600
		System.out.println(arr7[6]);    // 700
		System.out.println();
		
		//4.
		int[] arr8 = {11,12,13,14,15,16};
		System.out.println(arr8[0]);    // 11   
		System.out.println(arr8[1]);    // 12
		System.out.println(arr8[2]);    // 13
		System.out.println(arr8[3]);    // 14
		System.out.println(arr8[4]);    // 15
		System.out.println(arr8[5]);    // 16
		System.out.println();
		// 오류발생
		//int[] arr9;
  	    //arr9 = {11,12,13,14,15,16};
		
		String [] arr10 = {"아버님","어머님","형제","동생"};
		
		for(int i = 0 ; i < arr10.length ; i++)
		{
			System.out.println("arr10[" +i +"] : " + arr10[i]);
		}
		System.out.println();
		
		arr10[0] = "BTS";
		arr10[1] = "걸스그룹";
		arr10[2] = "소녀시대";
		arr10[3] = "애플";
		
		for(int i = 0 ; i < arr10.length ; i++)
		{
			System.out.println("arr10[" +i +"] : " + arr10[i]);
		}
		


	}

}
