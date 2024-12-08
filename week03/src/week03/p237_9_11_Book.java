package week03;
//멘토씨리즈 자바 예제 코드작성 p237
public class p237_9_11_Book { //클래스선언
	//예제에서 class Book
	
	//필드
	String title = "제목없음";
	int series = 1;
	int page = 100;
	
	//생성자1 - 기본
	p237_9_11_Book() { 		
	}
	
	//생성자1 - 매개변수1개
	p237_9_11_Book(String t) { 
		title = t;
	}
	//생성자3 - 매개변수 2개
	p237_9_11_Book(String t, int p) { 
		title = t;
		page = p;
	}
	//생성자4 - 매개변수 2개인데 타입,순서가다름
	p237_9_11_Book(int s , String t) { 
		series = s;
		title = t;
	}
	
}
