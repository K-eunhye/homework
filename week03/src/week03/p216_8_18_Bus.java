package week03;
//멘토씨리즈 자바 예제 코드작성 p216
public class p216_8_18_Bus {
	//예제에서 calss Bus
	
	void take(int m) {
		while(true) {
			if(m < 3000) {
				System.out.println("교통카드를 충전하러 갑니다.");
				return; //메소드 종료, break랑 같은 역할이다
			}
			System.out.println("버스를 탑니다");
			 m -= 1250;
			
		}
	}

}
