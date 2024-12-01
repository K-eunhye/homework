package week02;
//멘토씨리즈 자바 예제 코드작성 p64
public class P64_2_21_intDouble {
	public static void main(String[] args) {
		
		
		int num1 = 11; //정수형 int타입 변수 num1선언 = 11이라는 값을 넣어 초기화함
		double num2 = 3.14; //실수형 double타입 변수 num2선언 = 3.14라는 값을 넣어 초기화함
		double num1Change = (double)num1;//실수형 double타입 변수 num1Change선언하고
										//num1변수에 있는 값을 double타입으로 형변환 한 후 값을 대입해줌
		
		System.out.println("num1 : " + num1); //num1값 11 출력
		System.out.println("num1Change : " + num1Change); //num1Change값은 11이 실수형으로 바뀌어서 11.0으로 출력됨
		System.out.println(num1Change + num2); // num1Change는 11.0이고 num2는 3.14이고 둘다 실수형이므로 14.14라는 결과가 나옴
		System.out.println((int)1.23); //실수형 1.23를 정수형으로 강제형변환하면 소숫점 아래 자리는 삭제되고 1만 나온다
		
		
		
		
		
		
		
	}
}
