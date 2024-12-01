package week02;
//멘토씨리즈 자바 예제 코드작성 p136
public class p136_5_5_while {
	public static void main(String[] args) {
		
		int sum = 0; //정수형 변수 선언 = 0으로 초기화
		int i = 1; //정수형 변수 선언 = 1로 초기화
		while(i <= 10) { //언제끝날지 모르는 반복문은 while로 시작한다
			//()안에 false로 끝낼 지점을 조건식으로 정해놓고 가야한다
			//안그러면 무한루프에 빠지게 된다.
			sum += i; //한번 실행할 때마다 sum 이라는 변수에 i값을 더하고 대입한다.
			i++; // 계산이 끝나면 i값을 1개 늘려준다.
		}
		System.out.println("합 : " + sum);
		//그렇게 조건을 만족할 때까지 반복하면 while문으로도 1~10까지의 숫자를 더할 수 있다
		//결과 55
	}

}
