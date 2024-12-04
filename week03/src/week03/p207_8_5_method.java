package week03;
//멘토씨리즈 자바 예제 코드작성 p207

public class p207_8_5_method {
	//예제에서는 class EX08_05

	//2개 이상의 메소드 P205_8_2_method 에서 선언하고 호출해서 여기서 사용하기
	public static void main(String[] args) {
		
		//P205_8_2_method에 있는 메소드 불러와서 사용하기  예제에서는 파일명 jogger로 되어있음
		
		P205_8_2_method jogger = new P205_8_2_method();
		//P205_8_2_method에 만들어 둔 메소드 가져와서 사용하기 선언!
		
		jogger.name = "김은혜"; //조거에 저장된 스트링변수 name에 김은혜를 넣어 값을 준다
		jogger.sayName(); //메서드를 호출해서 이름을 문장에 넣어 출력하도록 한다
		jogger.run(); //jogger클래스의 run메소드를 가져와서 사용한다
		
		
		
		
	}
	
}
