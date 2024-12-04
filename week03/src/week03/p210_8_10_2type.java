package week03;
//멘토씨리즈 자바 예제 코드작성 p210
public class p210_8_10_2type {
//예제에서 class는 Person
	//다른 자료형 2개를 매개변수로 받는 메소드 정의
	
	//메소드 1
	void introduce(String name, int age) { //문자열, 정수 2가지 타입의 매개변수를 받고 리턴값없는 메소드 선언
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세입니다."); //실행문
	}
	//메소드 2
	void hello() { //hello라는 이름의 메소드 선언 매개변수 없음
		System.out.println("안녕하세요");
	}
	
	
}
