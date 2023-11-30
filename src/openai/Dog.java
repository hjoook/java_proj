package openai;

public class Dog {
    // 멤버 변수 (데이터)
    String name;
    int age;
    String breed;

    // 생성자 메서드 (객체를 생성할 때 호출되는 메서드)
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // 메서드 (동작)
    public void bark() {
        System.out.println("멍멍!");
    }

    public void displayInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "살");
        System.out.println("품종: " + breed);
    }

    public static void main(String[] args) {
        // Dog 클래스의 객체 생성
        Dog myDog = new Dog("멍멍이", 3, "푸들");

        // 객체의 메서드 호출
        myDog.bark();
        myDog.displayInfo();
    }
}
