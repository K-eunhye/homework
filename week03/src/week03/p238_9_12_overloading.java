package week03;
//멘토씨리즈 자바 예제 코드작성 p238
public class p238_9_12_overloading {
	public static void main(String[] args) {
		
		//클래스 호출
		p237_9_11_Book b1 = new p237_9_11_Book(); //생성자 1
		System.out.println("b1.title : " + b1.title); 
		System.out.println("b1.title : " + b1.series); 
		System.out.println("b1.title : " + b1.page); 
		
		p237_9_11_Book b2 = new p237_9_11_Book("멘토씨리즈 자바"); //생성자 2
		System.out.println("b2.title : " + b2.title); 
		System.out.println("b2.title : " + b2.series); 
		System.out.println("b2.title : " + b2.page); 
		
		p237_9_11_Book b3 = new p237_9_11_Book("신데렐라", 170); //생성자 3
		System.out.println("b3.title : " + b3.title); 
		System.out.println("b3.title : " + b3.series); 
		System.out.println("b3.title : " + b3.page); 
	
		p237_9_11_Book b4 = new p237_9_11_Book(5, "노인과바다"); //생성자 4
		System.out.println("b4.title : " + b4.title); 
		System.out.println("b4.title : " + b4.series); 
		System.out.println("b4.title : " + b4.page); 
		
		//생성자 오버로딩으로 각 객체마다 다른 매개변수값을 넣었을 때 다르게 표현된다.
		
		
		//출력결과
//		b1.title : 제목없음
//		b1.title : 1
//		b1.title : 100
//		b2.title : 멘토씨리즈 자바
//		b2.title : 1
//		b2.title : 100
//		b3.title : 신데렐라
//		b3.title : 1
//		b3.title : 170
//		b4.title : 노인과바다
//		b4.title : 5
//		b4.title : 100

		
	}

}
