package week02;
//멘토씨리즈 자바 예제 코드작성 p121
public class p121_4_11_switch2 {
	public static void main(String[] args) {
		
		int num = 7; //정수형 변수 선언 하고 7을 넣어서 초기화
		
		switch(num) { //스위치문 선언, 조건은 num에 들어있는 값
		case 1://num에 들어있는 값이 1이면
			System.out.println("num은 1입니다"); //이렇게 출력
		case 7://num에 들어있는 값이 7이면
			System.out.println("num은 7입니다"); //이렇게 출력
			default : //조건 1,2번째를 다 만족하지 않는다면
				System.out.println("num은 1도 7도 아닙니다");//이렇게 출력
		}
		//case7에 조건이 맞으므로 실행이 됐고 break문이 없어서
		//이어지는 default에 있는 실행문도 작동했다.
		
	}

}
