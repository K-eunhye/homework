package week02;
//멘토씨리즈 자바 예제 코드작성 p71
public class p71_2_28_doubleFloat {
	public static void main(String[] args) {
		
		
		//double형 > float형 강제형변환(float형 범위 내 값)
		double d1 = 1.1234;
		float f1 = (float) d1; // d1의 1.1234를 float으로 형변환 시 똑같이 1.1234 나옴
		System.out.println("[double > float] d1의 값 : " + d1 + ", f1의 값 : " + f1);
		
		//double형 > float형 강제형변환(float형 최소값보다 작은 경우)
		double d2 = 1.0e-50;
		float f2 = (float) d2; // d2의 1.0e-50을 float으로 형변환 시 범위초과로 0.0 출력
		System.out.println("[double > float] d2의 값 : " + d2 + ", f2의 값 : " + f2);
		
		//double형 > float형 강제형변환(float형 최대값보다 작은 경우)
		double d3 = 1.0e100;
		float f3 = (float) d3;//d3의 1.0e100을 float으로 형변환시 범위초과로 Infinity 출력
		System.out.println("[double > float] d3의 값 : " + d3 + ", f3의 값 : " + f3);
		
		//double형과 float형의 정밀도 차이
		double d4 = 9.123456789;
		float f4 = (float) d4; //float은 소수점 6~7자리까지만 표현할 수 있기때문에 그보다 더 많은 소숫점자리는 반올림되어 6자리까지만 나온다
		System.out.println("[정밀도차이] d4의 값 : " + d4 + ", f4의 값 : " + f4);
		
		
	}

}
