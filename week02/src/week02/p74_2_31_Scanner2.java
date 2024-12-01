package week02;

import java.util.Scanner;

//멘토씨리즈 자바 예제 코드작성 p74
public class p74_2_31_Scanner2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//스캐너 클래스 변수명 선언후 = 불러운다 스캐너클래스(시스템에 있는.입력메소드)
		
		String name, address; // 문자형 변수 2개 선언
		int age; //정수형 변수 선언
		double weight; //실수형 변수선언
		
		System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요");
		name = scanner.next(); // 문자형변수 name에 next로 문자형 입력값받기
		address = scanner.next(); // 문자형변수 address에 next로 문자형 입력값받기
		age = scanner.nextInt(); // 정수형 변수 age에 nextInt로 정수형 입력값받기 
		weight = scanner.nextDouble(); // 실수형 변수 weight에 nextDouble로 실수형 입력값받기 
		
		System.out.printf("당신의 이름은 %s입니다.%n", name); //서식문자로 출력 %s는 문자열
		System.out.printf("당신의 주소는 %s입니다.%n", address); 
		System.out.printf("당신의 나이는 %d입니다.%n", age); // %d는 정수형
		System.out.printf("당신의 체중은 %.1fkg입니다.%n", weight); //%.1f는 실수형인데 소숫점 1번째까지 출력
		//%n이 서식문자에서 줄바꿈인걸 알게되었다!
		
//		출력결과
//		당신의 이름은 김은혜입니다.
//		당신의 주소은 서울입니다.
//		당신의 나이은 20입니다.
//		당신의 체중은 40.0kg입니다.
		scanner.close();
		//다 쓰면 종료하자. 그래야 더이상 입력을 기다리지 않고 메모리를 잡아먹지 않음
	}
}
