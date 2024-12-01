package week02;
//멘토씨리즈 자바 예제 코드작성 p
public class p117_4_8_ifElseIf2 {
	public static void main(String[] args) {
		
		int favorite = 7; //int타입 변수 선언 후 7을 넣어준다
		
		if(favorite > 5) { //favorite에 저장된 값이 5보다 크다면 아래 출력
			System.out.println("좋아하는 숫자가 5보다 큽니다");
		}else if(favorite == 7) {//favorite에 저장된 값이 7이면 아래 출력
			System.out.println("좋아하는 숫자가 7입니다");
		}
		
		//if문은 위부터 차례로 실행해서 윗 조건에 맞으면 그 다음 조건은 보지 않고 넘어가기 때문에 조건설정을 잘 해줘야한다.
	}

}
