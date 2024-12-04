package week03;
//멘토씨리즈 자바 예제 코드작성 p203

public class p203_8_1_method {
	//예제에서는 class EX08_03임
	
	public static void main(String[] args) {
		printHello();
		//메인메소드에서 printHello메소드를 호출해서 그 안의 내용 출력함
		
		P205_8_2_method jogger = new P205_8_2_method();
		jogger.run(); // 예제 8_3 : 예제 8_2에서 만든 run 메소드 불러오기
	}

	static void printHello() { //printHello라는 이름의 메소드, 매개변수 없음
		System.out.println("안녕하세요");
		System.out.println("만나서 반갑습니다.");
	}
}
