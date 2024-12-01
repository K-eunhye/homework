package week02;

//멘토씨리즈 자바 예제 코드작성 p70
public class p70_2_27_intByte {
	public static void main(String[] args) {

		//int > byte형 강제형변환(값이 작을 경우)
		int i = 10; // 정수형 int 타입 변수선언 후 10을 넣어 초기화
		byte b = (byte) i ; // 정수형 byte타입 변수 선언 후 i에 들어있는 10을 byte타입으로 변환후 넣어줌
		System.out.println("[int > byte]i의 값 : " + i + " b의 값 : " + b);
		//[int > byte]i의 값 : 10b의 값 : 10으로 출력됨 = 오류없음
		
		//int > byte형 강제형변환(값이 큰 경우)
		int j = 1000;// 정수형 int 타입 변수선언 후 1000을 넣어 초기화
		byte c = (byte) j ;//강제형변환을 하지 않으면 에러발생
		// 정수형 byte타입 변수 선언 후 j에 들어있는 1000을 byte타입으로 변환후 넣어줌
		System.out.println("[int > byte]j의 값 : " + j + " c의 값 : " + c);
		//[int > byte]j의 값 : 1000c의 값 : -24으로 출력됨 = 오류발생
		
		
		
	}
}
