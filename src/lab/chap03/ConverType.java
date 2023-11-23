package lab.chap03;

import java.util.Scanner;

public class ConverType {

	public static void main(String[] args) 
	{
		/*
		  String 으로 입력 받은 값을 정수나 실수 타입으로 변환하여 출력
          Integer.parseInt   : 문자열을 정수로
          Double.parseDouble : 문자열을 실수로
		 */
		
		Scanner sc = new Scanner(System.in);

		String kor ;
		String eng ;
		String math ;
		
//		int kor ;
//		int eng ;
//		int math ;
				
		
		int    hap;
		double avg;
		
		System.out.println("국어점수 영어점수 수학점수를 공백으로 구분해서 넣으세요>>>");
		
		kor  = sc.next();
		eng  = sc.next();
		math = sc.next();

//		kor  = sc.nextInt();
//		eng  = sc.nextInt();
//		math = sc.nextInt();
		
		hap = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math);
		
		avg = (double)hap / 3;
		//avg = (Double.parseDouble(kor) + Double.parseDouble(eng) + Double.parseDouble(math)) / 3;
		
		
		System.out.println("모든 점수의 합  : " + hap);
		System.out.println("모든 과목의 평균 : " + avg);
	}

}
