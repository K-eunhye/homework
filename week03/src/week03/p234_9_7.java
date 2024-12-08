package week03;
//멘토씨리즈 자바 예제 코드작성 p234
//예제 9_9도 포함
public class p234_9_7 { //클래스 선언
//	예제에서 class Phone
	
	//필드
	String brand; 
	int series;
	String color = "검정색"; //필드값 초기화
	
	//생성자 - 오버로딩 : 하나의 생성자 이름으로 매개변수 다양하게 들어간 생성자를 만든다
	p234_9_7 (String b, int s){ //매개변수 2개인 생성자
		brand = b;
		series = s;
		
	}
	p234_9_7 (String b, int s, String c){ //매개변수 3개인 생성자
		brand = b;
		series = s;
		color = c;
	}
	
	//메소드
	void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
		
	}
	

}
