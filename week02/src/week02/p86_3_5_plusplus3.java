package week02;
//멘토씨리즈 자바 예제 코드작성 p86
public class p86_3_5_plusplus3 {
	public static void main(String[] args) {
		
		int num = 30; //정수형 int타입 변수 선언 후 10을 넣어 초기화
		System.out.println(++num); // num값 30에 1을 먼저더하고 더한 결과 31을 출력
		System.out.println(num); // 이미 num에 더하기가 되어있으므로 31 값이 출력된다
		
		System.out.println(num++); // num값 31을 출력하고 그 이후에 1을 증가시킨다.
		System.out.println(num); // 1을 더한 값은 32이며 그 값이 출력된다
	}

}
