package week03;
//멘토씨리즈 자바 예제 코드작성 p209
public class p209_8_7_call {
	//예제의 class는 EX08_07
	
	public static void main(String[] args) {
		p209_8_6_method myBook = new p209_8_6_method();
		//p209_8_6_method에 저장된 메소드를 사용하기 위해 클래스를 불러왔다
		
		myBook.count(3);
		//p209_8_6_method에 저장된 count라는 매개 변수가 있는 메소드를 호출함
		// 인수입력하는 곳에 3을 넣어서 책은 3권 입니다.라는 출력문이 나오게 됨
	}

}
