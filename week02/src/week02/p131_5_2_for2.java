package week02;
//멘토씨리즈 자바 예제 코드작성 p131
public class p131_5_2_for2 {
	public static void main(String[] args) {
		int sum = 0;
		//정수형 변수 선언하고 0을 대입해 초기화
		
		for(int i = 0; i <= 100; i++){
			//반복문 선언
			//초기식은 정수형 변수 i선언하고 0값 넣어 초기화함
			//조건식은 i가 100보다 작거나 같을 때까지 라고 쓰고
			// 한번 반복할 때 마다 증감식으로 i를 1늘려줌
			if(i % 2 == 0) { 
				//for문을 반복하는 중에 만약 i값을 2로 나눴을 때 나머지가 0이라면 짝수이기 때문에
				sum += i; 
				//sum이라는 변수에 i값(짝수)을 더하고 대입해줌
			}
			
		}
		
		System.out.println("합 : " + sum);
		//1부터 100까지 루프 돌면서 짝수만 다 더한값 2550
		
	}

}
