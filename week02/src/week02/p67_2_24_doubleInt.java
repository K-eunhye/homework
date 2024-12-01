package week02;
//멘토씨리즈 자바 예제 코드작성 p67
public class p67_2_24_doubleInt {

	public static void main(String[] args) {
		
		//실수형 > 정수형
		double pie = 3.14; // 실수형 double타입 변수 선언하고 3.14값 넣기
		int pieInt = (int)pie; 
		//정수형 int타입 변수 선언하고 pie에 있는3.14값을 int로 강제형변환하여 3으로 바꾸고 넣음.
		System.out.println(pieInt);//3으로 출력됨
		
		//정수형 > 실수형(범위내)
		int num = 100; //정수형 int타입 변수 선언 후 100을 넣어줌
		double numD = (double) num; 
		// 실수형 double타입 변수 선언 후 num에 있는 100을 100.0으로 형변환 후 넣어줌
		float numF = (float) 100;
		//실수형 float타입 변수 선언 후 100이라는 숫자를 float형태로 형변환 하여 100.0으로 바꾸고 넣어줌
		System.out.println(numD); //100.0d으로 출력
		System.out.println(numF); //100.0d으로 출력
		
		//정수형 > 실수형(범위밖)
		int i = 99999999; //정수형 int타입 변수 i선언하고 99999999값을 넣어 초기화함
		float f = (float) i; //실수형 float타입 변수 f선언하고 i에 담긴 값을 float으로 형변환하여 저장
		System.out.println(f); // 범위를 초과한 값이라 1.0E8로 출력됨
				
		
	}
}
