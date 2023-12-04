package com.my.movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieMgr  {
	
	String   title;     // 영화제목 : 접근제어자 private
	String   director;  // 영화 감독 : 접근제어자 private
	int      grade;     // 영화 등급 : 접근제어자 private
	String   genre;     // 영화 장르 : 접근제어자 privat
	
	Scanner sc = new Scanner(System.in);
	List<Movie> movieList = new ArrayList<>();
	List<Movie> movieList2 = new ArrayList<>();
	int index = 0;
	 
	MovieMgr (){}	 
	 
	 // /영화정보를 추가 // 스캐너로.. 
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
		 
		 System.out.println(movieList);
		 
	 }

	//영화 정보를 모두 출력 전체출력
	 void search() {
		 
		 System.out.println(movieList);
		 //for (int i = 0 ; i <movieList.size() ; i++)
		// movieList.get(i).
	 }
	 
	 // 제목으로 영화 정보를 검색  3
	 void search(String title){
		 
		 System.out.println(movieList.get(0).title + " " + title);
		 
		 for (int i = 0 ; i <movieList.size() ; i++)
		 {
			 if( movieList.get(i).title.equalsIgnoreCase(title))
             {
				 System.out.println(movieList.get(0).title + " " + title);
            	 System.out.println(movieList.get(i));
             }			
	     }
		 
	 }
	 
	 //감독명으로 영화 정보를 검색 4
	 void searchDirector(String name) {
		 for (int i = 0 ; i <movieList.size() ; i++)
		 {
			 if( movieList.get(i).director.equalsIgnoreCase(name))
             {
            	 System.out.println(movieList.get(i));
             }			
	     }	
		 
	 }
	 
	// 장르로 영화 정보를 검색  5
	 void searchGenre (String genre ){
		 
		 for (int i = 0 ; i <movieList.size() ; i++)
		 {
			 System.out.println(movieList.get(i).genre);
			 if( movieList.get(i).genre.equalsIgnoreCase(genre))
             {
            	 System.out.println(movieList.get(i));
				 //movieList2.addAll(movieList.);	 
				 movieList2.add(new Movie(movieList.get(i).title, movieList.get(i).director, movieList.get(i).grade, movieList.get(i).genre ));          	 
            	 
             }			
	     }
		 System.out.println(movieList2);
	 }
	
	// 제목으로 영화 정보 삭제
	 void delete(String title) {
		 for (int i = 0 ; i <movieList.size() ; i++)
		 {
			 if( movieList.get(i).title.equalsIgnoreCase(title))
             {
            	 movieList.remove(i);
             }			
	     }
		 
	 }
}
