package chap02.ex04;

public class TypeCasting2 {

	public static void main(String[] args) 
	{
		int kor  = 77;   // 국어점수
		int eng  = 88;   // 영어점수
		int math = 98;   // 수학점수
		
		// 합계
		System.out.println("합계 : " + (kor+eng+math));
			
		//평균
		System.out.println("평균1 : " + (kor+eng+math) / 3);
		System.out.println("평균2 : " + ((double)(kor+eng+math)) / 3);
		
		int hap = kor+eng+math;
		
		double avg  = (double)hap / 3;  // int -> double 로 업캐스팅 후 3으로 나눔
		double avg1 = hap / 3;          // 87.0 정수/정수=> 정수 => 더블
		double avg2 = hap / 3.0;        // 87.666666  정수(더블)/더블 => 더블 = > 더블
		
		System.out.println("합계 hap  : " + hap);
		System.out.println("평균 avg  : " + avg);		
		System.out.println("평균 avg1 : " + avg1);		
		System.out.println("평균 avg2 : " + avg2);		
		
	}

}
