package week02;

//멘토씨리즈 자바 예제 코드작성 p57

public class p57_2_14_float2 {

	public static void main(String[] args) {
		double pieDouble = 3.141592653589793; //실수형 double타입 변수 선언 = 값대입
		float piefloat = 3.141592653589793f;//실수형 float타입 변수 선언 = 값대입
		
		System.out.println("double : " + pieDouble); //더블형은 15자리까지 정확하게 나온다.
		System.out.println("float : " + piefloat); //float은 7자리까지만 나오고 마지막숫자는 반올림해서 표기된다.
		//그래서 정밀도 면에서 double이 낫기 때문에 실수형을 쓸 땐 double을 기본으로 사용한다.

	}

}
