package week03;
//멘토씨리즈 자바 예제 코드작성 p188
public class p188_7_6_field_Main {//클래스 선언
//예제 class EX07_06
	
	public static void main(String[] args) {
		
		p188_7_5_field_car c = new p188_7_5_field_car();
		//클래스주소값을 c에 저장해서 사용하려고 호출함
		System.out.println("Wheel의 개수는 " + c.wheel + "개입니다"); //필드에 저장된 값 출력
		
		c.wheel = 5; //c객체의 데이터인 wheel의 값을 5로 변경함
		System.out.println("Wheel의 개수는 " + c.wheel + "개입니다"); //변경된 값 출력
		
		//출력문
//		Wheel의 개수는 4개입니다
//		Wheel의 개수는 5개입니다
		
	}
	
	
	
}
