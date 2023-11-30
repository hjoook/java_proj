package chap07.ex01;

//Ctrl +Shift + o : 자동 import
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {

		/*
		 * 배열 : 하나의 변수에 많은 값을 저장 : 방번호가 있다. (index 0 부터) 동일한 타입의 자료를 저장 할 수 있다. 기본자료형,
		 * 참조자료형 int[] arr = new int[50]; Student[] arr2 = new Student[50]; 단점 : 배열의 중간에
		 * 값을 삭제할 경우 자동으로 담겨지고 늘어나지 않는다 배열의 방의 크기가 지정되면 수정이 불가능, 새로운 배열의 방크기를 지정하고 기존
		 * 배열의 값을
		 * 
		 * 컬렉션(프레임워크) : 배열의 단점을 보완해서 만든 클래스 List (인터페이스) : ArrayList, LinkedList, Vector
		 * <메소드 선언> : <메소드 구현> Set (인터페이스) : hashSet, LinkedHashSet, TreeSet Map (인터페이스)
		 * : HashMap... 하나의 변수에 많은 값을 저장 장점 : 값을 넣으면 무한히 저장할 수 있따 . 방크기를 선언하지 않는다 중간에 값을
		 * 삭제하면 자동으로 당겨진다. 중간에 값을 넣었을 경우 자동으로 이동이된다. 제너릭 타입으로 타입을 지정함. < >
		 * 
		 */

		// 배열
		String[] arr1 = new String[] { "가", "나", "다", "라", "마", "바", "사" };

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ","); // 가,나,다,라,마,바,사,
		}
		System.out.println();
		System.out.println(arr1.length); // 7

		// 특정 방의 값을 삭제 <= 자동으로 줄어 들지 않는다. 방크기도 줄어들지 않는다.
		arr1[2] = null;
		arr1[3] = null;

		System.out.println(Arrays.toString(arr1)); // 가, 나, null, null, 마, 바, 사

		System.out.println("======ArrayList=======");
		// 컬렉션 ArrayList
		// 1.ArrayList 선언 :
		List<String> aList = new ArrayList<String>();
		List<String> aList2 = new ArrayList<>();

		ArrayList<String> aList3 = new ArrayList<>();

		// ArrayList : 메소드를 사용해서 값을 넣고, 삭제
		// aList.size() : 방의 갯수를 출력
		// aList.add("가"), aList.add("나") : 값을 넣을때
		// aList.remove("가") : 값을 삭제할 때
		// aList.get(index) ; : 방번호

		// 방의 크기를 출력
		System.out.println("ArrayList size : " + aList.size()); // 방의 갯수 0
		// 값을 입력
		aList.add("가"); // 방의 마지막 방에 추가
		System.out.println("ArrayList size : " + aList.size()); // 방의 갯수 1
		// 방의 값을 출력
		System.out.println(aList); // 콜렉션은 toString() 가 Overriding 되어 있다.

		// 값 추가입력
		aList.add("나");
		aList.add("다");
		aList.add("라");
		aList.add("마");
		aList.add("바");
		aList.add("사");

		System.out.println("ArrayList size : " + aList.size()); // 방의 갯수 7
		System.out.println(aList); // 가, 나, 다, 라, 마, 바, 사

		// 중간에 값을 넣기
		System.out.println("======중간에 값 추가=======");
		aList.add(3, "안녕"); // index 3번방의 값 추가
		System.out.println("ArrayList size : " + aList.size()); // 방의 갯수 8
		System.out.println(aList); // 가, 나, 다, 안녕, 라, 마, 바, 사

		// 중간에 값 삭제
		System.out.println("======중간에 값 삭제=======");
		aList.remove(3); // index 3번방의 값 삭제
		System.out.println("ArrayList size : " + aList.size()); // 방의 갯수 7
		System.out.println(aList); // 가, 나, 다, 라, 마, 바, 사

		aList.remove("라"); // 문자 삭제 가능
		System.out.println("ArrayList size : " + aList.size()); // 방의 갯수 7
		System.out.println(aList); // 가, 나, 다, 마, 바, 사

		// 특정 방의 내용을 출력 aList.get(index);
		System.out.println("======특정 방의 내용을 출력 =======");
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}

		// 배열의 모든 값 출력 : Arrays.toString(arr)
		// 컬렉션은 객체 자체를 출력 : toString() 메소드가 재정의됨
		System.out.println("=====전체 출력 =======");
		System.out.println(aList);

		System.out.println("=====aList2 =======");

		/*
		 * 랩퍼 클래스 : 기본 자료형을 객체형으로 만들어놓은 클래스 int : Integer double : Double long : Long
		 * boolean :Boolean byte : Byte char : Charcter
		 */

		List<Integer> aList4 = new ArrayList<>();

		for (int i = 0, a = 1; i < 100; i++) {
			a += 10;
			aList4.add(a);
		}

		System.out.println(aList4.size());
		System.out.println(aList4);

		for (int i = 0; i < aList4.size(); i++) {
			System.out.println(aList4.get(i));
		}

	}

}
