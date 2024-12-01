package week02;
////멘토씨리즈 자바 예제 코드작성 p120
public class p120_4_10_switch {
	public static void main(String[] args) {
		
		int num = 7; //정수형 변수 선언 하고 7을 넣어서 초기화
		
		switch(num) { //스위치문 선언, 조건은 num에 들어있는 값
		case 1://num에 들어있는 값이 1이면
			System.out.println("num은 1입니다"); //이렇게 출력하고
			break;//스위치문 끝내기
		case 7://num에 들어있는 값이 7이면
			System.out.println("num은 7입니다"); //이렇게 출력하고
			break;//스위치문 끝내기
			default : //조건 1,2번째를 다 만족하지 않는다면
				System.out.println("num은 1도 7도 아닙니다");//이렇게 출력
		}
		
		//switch() 소괄호 안에 들어갈 수 있는 자료형은
		//int, char, String, byte, short, enum
		//switch() 소괄호 안에 못들어가는 자료형은
		//long, double, float, boolean
		
		//if문은 ()에 들어가는 조건식이 참/트루로 나뉘고
		//switch문은 ()안의 변수가 어떤 값이냐에 따라 실행문이 결정된다
	}

}
