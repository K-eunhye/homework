package week03;
//멘토씨리즈 자바 예제 코드작성 p205
public class P205_8_2_method {
	//예제에서는 class jogger

	void run() {
		System.out.println("run run run!");
//		예제 8_1에서 호출당할 메소드
	}
	
	//2개 이상의 메소드 선언하기
	//예제 8_4
	
	String name; //밖에서 스트링타입 변수 선언하고 
	void sayName() {
		System.out.println("제 이름은 " + name + "입니다"); //메소드 안에서 name 변수를 사용함
	}
	
	
	
	
}
