package lab.chap06;

import lab.chap06.Product;

public class Product_Test {

	public static void main(String[] args) {
		// . Product 객체 4개 생성
		// setter 를 사용해서 객체의 필드값 주입
		// 배열 arr , 방크기는 10개 0 ~9 , 각 방에 4개의 객체를 배열 방에 넣음
		// 배열의 값을 끄집어내서  Product 변수에 담고 출력 : for
		
		//1. 객체 생성
		Product pr1 = new Product();
		Product pr2 = new Product();
		Product pr3 = new Product();
		Product pr4 = new Product();
		
		int k = 1000;
		pr1.setIdx(k+1);
		pr1.setProName("ab3-cd");
		pr1.setQty(k+1-100);
		pr1.setYear(k+1+1001);
		pr1.setProColor("red");
		
		pr2.setIdx(k+2);
		pr2.setProName("abcd2");
		pr2.setQty(k+2-100);
		pr2.setYear(k+2+1001);
		pr2.setProColor("redpint");
		
		
		pr3.setIdx(k+3);
		pr3.setProName("abcd3");
		pr3.setQty(k+3-100);
		pr3.setYear(k+3+1001);
		pr3.setProColor("black");
		
		
		pr4.setIdx(k+5);
		pr4.setProName("abcd4");
		pr4.setQty(k+5-100);
		pr4.setYear(k+5+1001);
		pr4.setProColor("yellow");
		
		Product[] arr = new Product[10];
		
		arr[0] = pr1;
		arr[1] = pr2;
		arr[2] = pr3;
		arr[3] = pr4;
		
		for (int i = 0 ; i < arr.length ; i++)
		{
		//	if (arr[i].equals(null)) continue;
			if(arr[i] != null){
			    Product ppr1 = arr[i];
			    System.out.println(ppr1);
			    
		    }

		}
		
		String mm = pr1.getProName();
		String[] mm1 = mm.split("-");
		System.out.println(mm.split("-")[0]);
		System.out.println(mm.split("-")[1]);

	}

}
