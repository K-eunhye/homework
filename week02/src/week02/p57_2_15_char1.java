package week02;

//멘토씨리즈 자바 예제 코드작성 p57

public class p57_2_15_char1 {
	public static void main(String[] args) {
		
		char ga = '가'; 			//문자형 char 타입의 변수 선언하고 '가'라는 값으로 초기화함
		char na = '나'; 			//문자형 char 타입의 변수 선언하고 '나'라는 값으로 초기화함
		char alphabetA = 'A';	//문자형 char 타입의 변수 선언하고 'A'라는 값으로 초기화함
		char alphabetB = 'B';	//문자형 char 타입의 변수 선언하고 'B'라는 값으로 초기화함
		
		System.out.println(ga); //변수 ga에 들어있는 값 출력
		System.out.println(na);//변수 na에 들어있는 값 출력
		System.out.println(alphabetA +", " +  alphabetB );//변수 alphabetA와 alphabetB에 들어있는 값 출력
		// 값을 문자형으로 그대로 출력하고 싶하면 가운데에 " "를 넣어 문자로 인식하게 만들어준다.
		// 그렇지 않다면 char에 들어있는 값들을 숫자로 인식하여 아스키코드로 나오기 때문이다
				
	}

}
