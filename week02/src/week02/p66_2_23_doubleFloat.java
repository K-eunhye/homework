package week02;
//멘토씨리즈 자바 예제 코드작성 p66
public class p66_2_23_doubleFloat {

	public static void main(String[] args) {
		
		double d1 = 1.0e100; // 1.0 x (10의 100승) (float의 최대범위를 넣음)
		float f1 = (float)d1; // d1에 저장된 1.0e100의 값을 float으로 강제형변환 하여 f1에 넣음 
		System.out.println(f1); // 출력해보면 Infinity로 나옴
		
		double d2 = 1.0e-100; // 1.0 x (10의 -100승) (float의 최소범위를 넣음)
		float f2 = (float)d2;// d2에 저장된 1.0e-100의 값을 float으로 강제형변환 하여 f2에 넣음 
		System.out.println(f2);		//출력해보면 0.0으로 나옴
		
		
		
	}
}
