package lab.chap10;

public class Animal {

	String ani;  // 동물
	
	
	void Animal(String ani) {
		this.ani = ani;
		System.out.println("동물의 종류는 " + ani + "입니다");
	}
	
	void AniEtc()  {
		System.out.println("동물 end");
	}
	
}
