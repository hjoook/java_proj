package chap10.ex01;

//자식 클래스
public class Student extends Human{
	
	// Human 클래스의 필드와 메소드가 Student 클래스로 상속
	
	// 기본 생성자 생략됨
	Student(){      // 생략가능
		super();    // Human(부모클래스)의 생성자를 호출,
		
	}
	
    Student(int studentID){
    	//super(); // 생략가능, 첫라인에 작성
    	super("김똘똘", 20);                  // 부모클래스(Human)의 인풋이 2개인 생성자 호출  (Human.name , Human.age) 
    	this.studentID  =  studentID;
    	this.stuName    =  super.name;      // Student.stuName = Human.name 
    	//super.eat();
    	eat(); // super생략가능
    	
    }
    
	// 필드
    String stuName;
	int    studentID;
	
	//메소드
	void goToSchool() {
		System.out.println("모든 학생은 학교를 갑니다. ");
	}
	
	void stuInfo() {
		//Human 부모클래스의 ,name, age 를 상속 
		System.out.println("학생 이름은 "+ name + "이고 나이는 " + age + " 입니다." );
	}

}
