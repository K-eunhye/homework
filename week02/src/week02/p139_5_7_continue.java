package week02;
//멘토씨리즈 자바 예제 코드작성 p139

public class p139_5_7_continue {
	public static void main(String[] args) {
		
//		1부터 100까지의 짝수구하기
		
		int sum = 0;//정수형 변수 선언하고 0으로 초기화
		for(int i=1; i <=100; i++ ) {
//			i를 1부터 시작해서 100번까지 루프돌리기
			
			if( i % 2 != 0){ //i값을 2로 나눴을 때 나머지가 0이 아니면 홀수니까
				continue; //건너뛰고 다시 처음으로 돌아간다.
			}
			sum += i;//그게 아닌 짝수일 경우 i값을 sum더하고 대입한다.
			
		}
		System.out.println("짝수 합 : " + sum);
		//짝수의 합계 2550이 나온다
		
	}

}
