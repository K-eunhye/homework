package week02;

import java.util.Scanner;

//멘토씨리즈 자바 예제 코드작성 p112
public class p112_4_6_ifElse4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //스캐너 클래스를 sc라는 변수로 선언하고 입출력메소드를 사용하겠다고 불러움
		System.out.println("나이를 입력하세요");//출력문
		
		int age = sc.nextInt(); //int타입 변수에 int값으로 입력값받은 후 저장
		if( age > 19) { //만약 변수에 저장된 값이 19보다 크다면
			System.out.println("성인입니다"); //여기출력
		}else {
			System.out.println("미성년자입니다"); //그게 아닌 모든 경우에 여기 출력
		}
		
		sc.close();//방을 나갈 땐 불을 꼭 끄고 갈것
	}

}
