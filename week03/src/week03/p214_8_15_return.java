package week03;
//멘토씨리즈 자바 예제 코드작성 p214
public class p214_8_15_return {
	
	public static void main(String[] args) {
		
		 int[] nums = {500,200}; //1차원 배열 생성, 값도 다 넣어줌
		p209_8_8_method2 calc = new p209_8_8_method2();
		//클래스를 사용하기 위해 p209_8_8_method2의 클래스 주소값을 불러옴
		
		System.out.println("숫자들의 합은 " + calc.sum(nums)+ "입니다.");
		//메소드를 출력문안에 넣어서 불러옴, return값으로 반환되기 때문에 값으로 쓸 수 있음.
		//결과물은 
//		숫자들의 합은 700입니다.
		
		
		
	}

}
