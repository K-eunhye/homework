package week02;
//멘토씨리즈 자바 예제 코드작성 p111
public class p111_4_4_ifElse2 {
	public static void main(String[] args) {
		
		int a = 4; //int타입 변수에 4값을 넣어 초기화
		int b = 10;//int타입 변수에 10값을 넣어 초기화
		
		if(a > b) {//만약 a가 b보다 큰게 참이라면 = 4 > 10 = false
			System.out.println("a가 b보다 큽니다");
		}else {
			System.out.println("a가 b보다 작거나 같습니다");		//이 출력문이 나옴
		}
	}

}
