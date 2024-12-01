package week02;
//멘토씨리즈 자바 예제 코드작성 p69

public class p69_2_26_intCharDouble {

	public static void main(String[] args) {
		
		int i = 100; //정수형 int타입에 100을 넣고 초기화
		char c = 'a'; //문자형 char 타입에 a라는 글자하나 넣고 초기화
		int j = c; 
		// 정수형 int타입변수 j선언하고 c의 값인 'a'를 넣어주는데 아스키코드로 자동형변환이 되어서 97이 들어감
		double d = i;
		//실수형 double 타입 변수 선언하고 i의 값 100을 넣어주면 실수형으로 자동형변환이 되어 100.0이된다
		
		System.out.println("int형 변수 j의 값 : " + j); // 정수형이라서 문자a와 아스키코드가 매칭되는 97이 출력됨
		System.out.println("double형 변수 d의 값 : " + d); //실수형으로 100.0이 출력됨		
		
		
		
	}
}
