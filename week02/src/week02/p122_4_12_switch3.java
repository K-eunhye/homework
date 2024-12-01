package week02;

import java.util.Scanner;

//멘토씨리즈 자바 예제 코드작성 p122
public class p122_4_12_switch3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//스캐너 클래스 변수 선언 시스템입력메소드를 사용하는 스캐너를 새로 불러옴
		System.out.println("원하는 숫자를 입력하세요 (1~5)");//지시문 출력
		int num = sc.nextInt();//정수형 변수 선언하고 거기에 사용자 입력값 정수형으로 받기
		
		switch(num) { //num이라는 변수에 들어가는 값에 따라 결정되는 switch문
		case 5:
			System.out.println("5를 입력했습니다");
			break;
		case 4:
			System.out.println("4를 입력했습니다");
			break;
		case 3:
			System.out.println("3를 입력했습니다");
			break;
		case 2:
			System.out.println("2를 입력했습니다");
			break;
		case 1:
			System.out.println("1를 입력했습니다");
			break;
			default: //모든 조건에 부합하지 않으면 아래처럼 출력
				System.out.println("1~5까지의 숫자를 입력하세요");
				
		}
		
		sc.close(); //스캐너종료
	}

}
