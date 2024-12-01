package week02;
//멘토씨리즈 자바 예제 코드작성 p69
public class p69_2_25_intDouble {

	public static void main(String[] args) {
		
		int num1 = 14; //정수형 int타입 변수 선언하고 14값을 넣어 초기화
		double num2 = 3.14; //실수형 double타입 변수 선언하고 3.14넣어 초기화
		
		
		//double num4 = num1; // num1을 자동으로 double로 형변환해줌
		//int num3 = (double)num2; // 자동형변환을 할수 없는 역방향! 컴파일에러발생
		
		int num4 = (int)num2; //정수형 변수 선언 후 num2에 저장된 실수형 3.14을 int형으로 변환하면 3이 되고 그 값을num4에 넣어줌
		System.out.println(num4); //결과는 3
		
		
		
		
		
	}
}
