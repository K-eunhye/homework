package week02;

import java.util.Scanner; // 다른패키지에 있는 Scanner클래스를 이용하려고 불러옴

//멘토씨리즈 자바 예제 코드작성 p73
public class p73_2_30_Scanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//스캐너 클래스 변수명 선언후 = 불러운다 스캐너클래스(시스템에 있는.입력메소드)
		
		System.out.println("나이를 입력해주세요"); // ()안의 내용 출력하기
		int age = scanner.nextInt(); // 정수형 int타입 변수 age 선언 후 스캐너변수명.nextInt로 사용자에게 입력값을 받는다.
		System.out.printf("내 나이는 %d세 입니다", age); // 서식문자형식으로 출력해서 변수명 age에 있는 값을 불러온다
		
		scanner.close();
		//다 쓰면 종료하자. 그래야 더이상 입력을 기다리지 않고 메모리를 잡아먹지 않음
		
		
	}
}
