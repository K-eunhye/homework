package week02;

import java.util.Scanner;

//멘토씨리즈 자바 예제 코드작성 p107
public class p107_4_2_if2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 스캐너 클래스를 쓰겠다고 변수명 정해서 선언, 입력메소드를 쓸 스캐너를 불러옴
		System.out.println("나이를 입력하세요");
		//지시문 출력
		
		int age = sc.nextInt(); //int타입 변수 선언후 그 안에 사용자가 입력한 값을 정수타입으로 입력받기
		if(age > 19) {//만약 입력한 값이 19보다 크다면 "성인입니다"출력
			System.out.println("성인입니다");
		}
		System.out.println("프로그램을 종료합니다"); //그게 아닌 모든 경우에 "프로그램을 종료합니다"출력
		
		sc.close();//다쓰면 꺼야지
	}

}
