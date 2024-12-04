package week03;
//멘토씨리즈 자바 예제 코드작성 p217
public class p217_8_19_Bus {
//예제에서 class EX08_19
	
	public static void main(String[] args) {
		int money = 10000;
		
		p216_8_18_Bus bus = new p216_8_18_Bus();
		//메소드 사용을 위해 p216_8_18_Bus의 주소값을 불러와서 bus라는 변수에 저장함
		bus.take(money);
//		bus라는 class의 take이라는 메소드를 사용했고 매개변수로 money값을 넣었다
		
		//출력값은 아래와 같다
//		버스를 탑니다
//		버스를 탑니다
//		버스를 탑니다
//		버스를 탑니다
//		버스를 탑니다
//		버스를 탑니다
//		교통카드를 충전하러 갑니다.
		
	}
	
}
