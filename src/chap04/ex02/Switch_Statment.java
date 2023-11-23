package chap04.ex02;

public class Switch_Statment {

	public static void main(String[] args) 
	{
		//switch : 기본적으로 case 문 내에서 break;
		
		
		/**********************************************************/
		int val1 = 2;
		switch(val1)   // 정수
		{
		    case 1 :
		    	System.out.println("A");
		    	break;
		    case 2 :
		    	System.out.println("B");
		    	break;
		    case 3 :
		    	System.out.println("C");
		    	break;
		    case 4 :
		    	System.out.println("D");
		    	break;
		    default :
		    	System.out.println("F");		    							
		}

		/**********************************************************/
		char ch = 'a';
		switch(ch)   // 문자
		{
		    case 'a' :
		    	System.out.println("A 학점입니다.");
		    	break;
		    case 'b' :
		    	System.out.println("B 학점입니다.");
		    	break;
		    case 'c' :
		    	System.out.println("C 학점입니다.");
		    	break;
		    case 'd' :
		    	System.out.println("D 학점입니다.");
		    	break;
		    default :
		    	System.out.println("F 학점입니다.");		    							
		}		
		
		/**********************************************************/
		String abc = "월요일";
		
		switch(abc)   // 문자열
		{
		    case "월요일" :
		    	System.out.println("월요일은 자바를 공부합니다.");
		    	break;
		    case "화요일" :
		    	System.out.println("화요일은 데이타베이스를 공부합니다.");
		    	break;
		    case "수요일" :
		    	System.out.println("수요일은 html javascipt를 공부합니다.");
		    	break;
		    case "목요일" :
		    	System.out.println("목요일은 JSP를 공부합니다.");
		    	break;
		    case "금요일" :
		    	System.out.println("금요일은 String를 공부합니다.");
		    	break;
		    case "토요일" :
		    	System.out.println("토요일은 운동을 공부합니다.");
		    	break;
		    case "일요일" :
		    	System.out.println("일요일은 TV를 시청합니다.");
		    	break;
		    default :
		    	System.out.println("end");		    							
		}	//switch
		
	}  //main
}
