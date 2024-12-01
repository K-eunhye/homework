package week02;
//멘토씨리즈 자바 예제 코드작성 p130
public class p130_5_1_for {
	public static void main(String[] args) {
		
		int sum = 0;
		//정수형 변수 선언하고 0을 대입해 초기화
		
		for(int i = 0; i <= 10; i++){
			//반복문 선언
			//초기식은 정수형 변수 i선언하고 0값 넣어 초기화함
			//조건식은 i가 10보다 작거나 같을 때까지 라고 쓰고
			// 한번 반복할 때 마다 증감식으로 i를 1늘려줌
			sum += i; 
			//sum이라는 변수에 i값을 더하고 대입해줌
		}
		
		System.out.println("합 : " + sum);
		//1부터 10까지 루프 돌면서 다 합친 값 출력 55
	}

}
