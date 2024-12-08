package week03;
//멘토씨리즈 자바 예제 코드작성 p233
public class p233_9_5_Person { //클래스 선언
	//예제에서 class Person
	
	//필드
	String name;
	int age;
	
	//생성자
	p233_9_5_Person(String n, int a){
		name = n;
		age = a;
	}
	//메소드
	void introduce() {
		System.out.println("안녕하세요, 저는 " + age + "세 " + name + "입니다");
	}

}
