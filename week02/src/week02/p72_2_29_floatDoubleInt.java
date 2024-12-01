package week02;
//멘토씨리즈 자바 예제 코드작성 p72
public class p72_2_29_floatDoubleInt {
	public static void main(String[] args) {
		
		//float > int 강제형변환
		float f1 = 12345.67f;
		int i1 = (int) f1; //실수형float값을 int형으로 바꿔서 넣으면 .밑의 값은 다 없어지고 12345만 남음
		System.out.println("[float > int] f1의 값 : " + f1 + ", i1의 값 : " + i1);
		
		
		//double > int 강제형변환
		double d1 = 12345.678;
		int i2 = (int) d1;//실수형double값을 int형으로 바꿔서 넣으면 .밑의 값은 다 없어지고 12345만 남음
		System.out.println("[double > int] d1의 값 : " + d1 + ", i2의 값 : " + i2);
	}

}
