package week02;
//멘토씨리즈 자바 예제 코드작성 p42

public class p42_2_6_printf4 {
	public static void main(String[] args) {
		System.out.printf("%.1f" ,1.1234567); // 서식문자 출력시 %.1f라고 쓰면 실수에서는 소숫점 1자리까지 표기해준다.
		System.out.println();
		System.out.printf("%.2f" ,1.1234567);
		System.out.println();
		System.out.printf("%.3f" ,1.1234567);
		System.out.println();
		System.out.printf("%.4f" ,1.1234567);
		System.out.println();
		System.out.printf("%.5f" ,1.1234567);
		System.out.println();
		
		//%5.6f 은 어떻게 나오나 궁금해졌다. 
		System.out.printf("%5.6f" ,15.1234567); //소숫점앞의 숫자는 실수일때 의미가 없었다.... 좋은 실험이었다
		System.out.println();

	}
}
