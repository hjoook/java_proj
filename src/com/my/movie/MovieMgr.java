package com.my.movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieMgr  {
	
	String   title;     // 영화제목  
	String   director;  // 영화 감독
	int      grade;     // 영화 등급 
	String   genre;     // 영화 장르 
	
	Scanner sc = new Scanner(System.in);
	List<Movie> movieList  = new ArrayList<>();
	List<Movie> movieList2 = new ArrayList<>();  // 장르로 영화 정보를 검색시 ArrayList 재정의
	int index = 0;
	 
	MovieMgr (){}	 
	 
	 // /영화정보를 추가 1 // 스캐너로.. 
	 void add () {
		 
		 System.out.println("영화제목을 입력하세요");
		 title    = sc.next();
		 System.out.println("영화감독을 입력하세요");
		 director   = sc.next();
		 System.out.println("영화등급을 입력하세요");
		 grade = sc.nextInt();
		 System.out.println("영화장르을 입력하세요");
		 genre = sc.next();
		 movieList.add(new Movie(title, director, grade, genre));	 
		 System.out.println("=============================================");
		 System.out.println(title + " 영화 등록");		 
	 } // add

	 //영화 정보를 모두 출력 전체출력 2
	 void search() {		 
		 System.out.println(movieList);
		 System.out.println("=============================================");
		 System.out.println("   영화제목 | 영화감독 | 영화등급 | 영화장르  ");
		 System.out.println("=============================================");
		 for (int i = 0 ; i <movieList.size() ; i++)
         {
			 //System.out.println("   " + movieList.get(i).getTitle() + "  " + movieList.get(i).getdirector() + "  " + movieList.get(i).getgrade() + "  " + movieList.get(i).getgenre());
			 System.out.println("   " + movieList.get(i).getTitle() + "  " + movieList.get(i).getDirector() + "  " + movieList.get(i).getGrade() + "  " + movieList.get(i).getGenre());
         }
	 }  // search()
	 
	 // 제목으로 영화 정보를 검색  3
	 void search(String title){
		 
		 //System.out.println(movieList.get(i).getTitle() + " " + title);
		 
		 for (int i = 0 ; i <movieList.size() ; i++)
		 {
			 //if( movieList.get(i).title.equalsIgnoreCase(title))
			 if( movieList.get(i).getTitle().equalsIgnoreCase(title))	 
             {
				// System.out.println(movieList.get(0).title + " " + title);
            	 System.out.println(movieList.get(i));
             }			
	     }		 
	 } // search(String title)
	 
	 //감독명으로 영화 정보를 검색 4
	 void searchDirector(String name) {
		 for (int i = 0 ; i <movieList.size() ; i++)
		 {
			 
			 //if( movieList.get(i).director.equalsIgnoreCase(name))
			 if( movieList.get(i).getDirector().equalsIgnoreCase(name))
             {
            	 //System.out.println("   " + movieList.get(i).title + "  " + movieList.get(i).director + "  " + movieList.get(i).grade + "  " + movieList.get(i).genre);
				 System.out.println("   " + movieList.get(i).getTitle() + "  " + movieList.get(i).getDirector() + "  " + movieList.get(i).getGrade() + "  " + movieList.get(i).getGenre());
             }			
	     }			 
	 }  // searchDirector
	 
	 // 장르로 영화 정보를 검색  5
	 void searchGenre (String genre ){
		 
		 for (int i = 0 ; i <movieList.size() ; i++)
		 {
			// System.out.println(movieList.get(i).genre);
			 //if( movieList.get(i).genre.equalsIgnoreCase(genre))
			 if( movieList.get(i).getGenre().equalsIgnoreCase(genre))
             {
            	// System.out.println(movieList.get(i));				 
				 //movieList2.add(new Movie(movieList.get(i).title, movieList.get(i).director, movieList.get(i).grade, movieList.get(i).genre ));
				 System.out.println("   " + movieList.get(i).getTitle() + "  " + movieList.get(i).getDirector() + "  " + movieList.get(i).getGrade() + "  " + movieList.get(i).getGenre());
             }			
	     }
		 System.out.println(movieList2);
	 }  // searchGenre
	
	 // 제목으로 영화 정보 삭제 6
	 void delete(String title) {
		 for (int i = 0 ; i <movieList.size() ; i++)
		 {
			 //if( movieList.get(i).title.equalsIgnoreCase(title))
			 if( movieList.get(i).getTitle().equalsIgnoreCase(title))
             {
            	 movieList.remove(i);  // 삭제
             }			
	     }
		 
	 }  // delete
}
