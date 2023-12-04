package com.my.movie;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieMenu {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Movie> movieList = new ArrayList<>();
	MovieMgr mo1 = new MovieMgr();
	
    MovieMenu (){
		
	}
	
	// 영화 정보를 출력하는 메소드
	void movieMenu () {		
		out : do {						
		System.out.println("<<영화 관리 프로그램>>");
		System.out.println("1. 영화 정보 입력");
		System.out.println("2. 영화 정보 전체 검색");
		System.out.println("3. 영화명으로 검색");
		System.out.println("4. 영화 감독별 검색");
		System.out.println("5. 영화 장르별 검색");
		System.out.println("6. 영화제목으로 삭제");
	switch(sc.nextInt())
		{
	    case 1 :	    	
	    	mo1.add();
	    	break;
	    case 2 :
	    	mo1.search();
	    	break;
	    case 3 :
	    	System.out.println("영화제목을 입력하세요");
	    	mo1.search(sc.next());
	    	break;
	    case 4 :
	    	System.out.println("영화감독을 입력하세요");
	    	mo1.searchDirector(sc.next());
	    	break;
	    case 5 :
	    	System.out.println("영화장르을 입력하세요");
	    	mo1.searchGenre(sc.next());
	    	break;
	    case 6 :
	    	System.out.println("삭제할 영화제목을 입력하세요");
	    	mo1.delete(sc.next());
	    	break;	 	    	
	    default :
		
		        break out;
		    }
		}while(true);
		
		System.out.println("프로그램 종료");
		sc.close();

	}

	private Movie add() {
		// TODO Auto-generated method stub
		return null;
	}		

}
