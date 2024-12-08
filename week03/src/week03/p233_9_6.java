package week03;
//멘토씨리즈 자바 예제 코드작성 p233
public class p233_9_6 {
	public static void main(String[] args) {
		
		//클래스호출하면서 생성자에 값을 넣어 필드를 초기화함
		p233_9_5_Person p1 = new p233_9_5_Person("김자바", 20);
		p233_9_5_Person p2 = new p233_9_5_Person("이코딩", 40);
		
		//메소드 호출
		p1.introduce();
		p2.introduce();
		
		//각자 생성자에 들어간 값에 맞춰서 출력문이 나온다
		
		//츨략믄
//		안녕하세요, 저는 20세 김자바입니다
//		안녕하세요, 저는 40세 이코딩입니다

	}

}
