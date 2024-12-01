package week02;

import java.util.Scanner;

//멘토씨리즈 자바 예제 코드작성 p117
public class p117_4_9_ifElseIf3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//스캐너 클래스 변수 선언 시스템입력메소드를 사용하는 스캐너를 새로 불러옴
		System.out.println("나이를 입력하세요");//지시문 출력
		int age = sc.nextInt();//정수형 변수 선언하고 거기에 사용자 입력값 정수형으로 받기
		
		if( age > 19) {//만약 변수에 입력된 값이 19보다 크면 아래처럼 출력
			System.out.println("성인입니다");
		}else if( age > 13) {//만약 변수에 입력된 값이 위의 조건에서 거짓으로 나오고 13보다 크면 아래처럼 출력
			System.out.println("청소년입니다");
		}else if( age > 6) {//만약 변수에 입력된 값이 위의 조건에서 거짓으로 나오고 6보다 크면 아래처럼 출력
			System.out.println("어린이입니다");
		}else {//위의 모든 조건에 거짓으로 나오면 아래처럼 출력
			System.out.println("유아입니다");
		}
		
		sc.close();//다쓰고 불끄기
		
	}

}
