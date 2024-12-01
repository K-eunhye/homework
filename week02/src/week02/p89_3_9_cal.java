package week02;
//멘토씨리즈 자바 예제 코드작성 p89
public class p89_3_9_cal {
	public static void main(String[] args) {
		
		int x = 100; //정수형 int타입 변수 선언 후 100을 넣어 초기화
		int y = 200;//정수형 int타입 변수 선언 후 200을 넣어 초기화
		
		System.out.println( x + y ); //100 + 200 = 300
		System.out.println( x - y ); //100 - 200 = -100
		System.out.println( x * y ); //100 * 200 = 20000
		System.out.println( x / y ); //100 / 200 = 결과는 1/2 = 0.5이지만 정수형이기 때문에 소수점밑은 삭제해버리므로 결과는 0으로 나온다
		System.out.println( x % y ); //100 % 200 = 100
		
		
	}

}
