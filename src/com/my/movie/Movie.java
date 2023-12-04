package com.my.movie;

public class Movie  {
	
    Movie (){}
	
	
	Movie (String title , String director , int grade , String genre )
	{
        this.title = title;
        this.director = director;
        this.grade = grade;
        this.genre = genre;		
	}
	
	private String   title;     // 영화제목 : 접근제어자 private
	private String   director;  // 영화 감독 : 접근제어자 private
	private int      grade;     // 영화 등급 : 접근제어자 private
	private String   genre;     // 영화 장르 : 접근제어자 privat
	
	
	public final String getTitle() {
		return title;
	}


	public final void setTitle(String title) {
		this.title = title;
	}


	public final String getDirector() {
		return director;
	}


	public final void setDirector(String director) {
		this.director = director;
	}


	public final int getGrade() {
		return grade;
	}


	public final void setGrade(int grade) {
		this.grade = grade;
	}


	public final String getGenre() {
		return genre;
	}


	public final void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", grade=" + grade + ", genre=" + genre + "]";
	}
	
	
	

}
