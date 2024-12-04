package week03;
//멘토씨리즈 자바 예제 코드작성 p210
public class p210_8_9_method2 {
//예제에서 class는 EX08_09
	//매개변수가 2개 이상인 메소드 호출
	
	public static void main(String[] args) {
		
		p209_8_8_method2 calc = new p209_8_8_method2();
		//클래스를 새로 불러와서 Calc라는 변수에 저장 한 후 그 안에 들어있는 메소드를 사용하기 위해 선언함
		
		calc.sum(5, 3); 
		//calc클래스의 sum메소드를 불러왔고 매개변수 2개를 넣어 메소드를 작동시킴
		//결과값 : 두 수의 합은 8입니다.
		calc.sum(10, 7);
		//calc클래스의 sum메소드를 불러왔고 매개변수 2개를 넣어 메소드를 작동시킴
		//결과값 : 두 수의 합은 17입니다.
		
		
		
		
		
		
	}
	
	
	
}
