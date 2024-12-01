package week02;
//멘토씨리즈 자바 예제 코드작성 p59

public class p59_2_17_char3 {
	
	public static void main(String[] args) {
		
		int alphabetA = 'A';	//정수형 int 타입의 변수 선언하고 'A'라는 문자형 값으로 초기화함
		int alphabetB = 'B';	//정수형 int 타입의 변수 선언하고 'B'라는 문자형 값으로 초기화함

		System.out.println(alphabetA); //변수 alphabetA에 들어있는 유니코드 값 65 출력
		System.out.println(alphabetB); //변수 alphabetA에 들어있는 유니코드 값 66 출력
		
		char alphabetC = 67; //문자형 char에 67값을 넣어 유니코드로 매칭되게 함
		System.out.println(alphabetC); //변수 alphabetC에 들어있는 유니코드 값 67이 문자형으로 자동형변환되어 C 출력
		
		
	}

}
