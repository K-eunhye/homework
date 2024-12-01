package week02;
//멘토씨리즈 자바 예제 코드작성 p116
public class p116_4_7_ifElseIF {
	public static void main(String[] args) {
		
		int favorite = 7; //int타입 변수 선언 후 7을 넣어준다
		
		//if문은 위부터 조건에 부합하는지 걸러져 나가기 때문에 조건을 잘 만들어야한다.
		if(favorite < 5) { //favorite에 저장된 값이 5보다 작다면 아래 출력
			System.out.println("좋아하는 숫자가 5보다 작습니다");
		}else if(favorite > 5) {//favorite에 저장된 값이 5보다 크다면 아래 출력
			System.out.println("좋아하는 숫자가 5보다 큽니다");
		}else {//favorite에 저장된 값이 5라면 아래 출력
			System.out.println("좋아하는 숫자가 5입니다");
		}
		
	}
}
