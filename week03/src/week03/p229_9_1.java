package week03;
//멘토씨리즈 자바 예제 코드작성 p229, 231
//생성자
public class p229_9_1 {
	//예제에서는 class Snack
	
	//필드 선언
	int price;
	
	//예제 9_3
	p229_9_1(int p){ //매개변수 1개 있는 생성자 선언
		price = p; //매개변수로 받은 값을 필드 price안에 넣기
	}
	
	
	void info() {
		System.out.println("과자의 가격은" + price + "원입니다.");
	}
	

	

}
