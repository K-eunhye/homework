package week03;
//멘토씨리즈 자바 예제 코드작성 p211
public class p211_8_11_2type {
	//예제에서 class EX08_11
	
	public static void main(String[] args) {
		
		p210_8_10_2type hong = new p210_8_10_2type();
		//p210_8_10_2type라는 클래스에서 메소드를 사용하기 위해 불러옴
		
		hong.introduce("홍길동", 20);
		//p210_8_10_2type라는 클래스의 메소드를 호출하기 위해 주소값을 hong에 저장했고
		// hong으로 주소값을 불러온 후 그 안의 메소드명을 넣어 또 호출해주었다.
		//매개변수 2개를 넣음
		hong.hello();
		
	}

}
