package week02;

//멘토씨리즈 자바 예제 코드작성 p56

public class p56_2_13_float1 {

	public static void main(String[] args) {
		double marathon = 42.195; //실수형 double타입 변수선언 = 값을 넣어 초기화함
		//float halfMarathon = 24.0975; 구문오류발생
		float halfMarathon = 24.0975f; // 더블과 플롯을 구분하기 위해서 꼭 숫자 뒤에 f를 넣어준다.
		
		System.out.println("마라톤은 " + marathon + "km를 달립니다" );
		System.out.println("하프마라톤은 " + halfMarathon + "km를 달립니다" ); //float형은 꼭 숫자뒤에 f를 넣어주어야 오류가 안생김

	}

}
