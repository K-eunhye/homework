package week02;
////멘토씨리즈 자바 예제 코드작성 p54

public class p54_2_11_int1 {
	public static void main(String[] args) {
		
		byte num1 = 20; //정수형 byte 타입의 변수 num1을 선언하고 20이라는 값을 넣어서 초기화함
		//byte num5 = 128; 이 구문은 에러가 발생합니다. 이유가 무엇일까요?
		//byte가 저장할 수 있는 숫자의 범위(-128~127)를 벗어나기 때문에 저장할 수 없습니다.
		short num2 = 30;//정수형 short 타입의 변수 num2을 선언하고 30이라는 값을 넣어서 초기화함
		int num3 = 40;//정수형 int 타입의 변수 num3을 선언하고 40이라는 값을 넣어서 초기화함
		long num4 = 50;//정수형 long 타입의 변수 num4을 선언하고 50이라는 값을 넣어서 초기화함
		
		System.out.println(num1); //변수 num1에 있는 값 콘솔창에 출력
		System.out.println(num2); //변수 num2에 있는 값 콘솔창에 출력
		System.out.println(num3); //변수 num3에 있는 값 콘솔창에 출력
		System.out.println(num4); //변수 num4에 있는 값 콘솔창에 출력, 근데 롱타입에 long num4 = 50L;로 표기하지 않았는데도 잘 나오네?
		
		
		
		
	}

}
