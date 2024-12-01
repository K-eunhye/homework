package week02;

import java.util.Scanner;

//멘토씨리즈 자바 예제 코드작성 p140
public class p140_5_8_break {
	public static void main(String[] args) {
		
		//1~50 숫자맞추기 게임
		
		int magicNumber = (int)(Math.random() * 50) +1;
		//Math.random()이라는 기능도 인덱스값처럼 0부터 시작하기 때문에 1을 뒤에 붙여서 1부터 시작하게함
		Scanner sc = new Scanner(System.in); //스캐너 선언+임포트
		boolean isMatched = false;
		//논리형 변수 선언하고 false값으로 초기화함. 트루값이 되면 for문 멈추게 하려고.
		
		for( int i=0; i < 10; i++){
			//10번의 기회만 주기 위해서 조건식을 i < 10으로함
			System.out.println("찾는 숫자를 입력하세요 : "); //지시문출력
			int guess = sc.nextInt(); //guess라는 정수형 변수 선언하고 정수형으로 입력값받음
			
			if(guess == magicNumber) {
				//사용자값이 랜덤으로 뽑은 숫자와 일치하면
				System.out.println((i+1)+"번째에 맞췄습니다."); //횟수세고 + 맞췄다고 출력하고
				isMatched = true; // 논리형 변수 값을 true로 바꾼다.
				break;//그 다음 당장 포문을 탈출
			}else if(guess > magicNumber) { //만약 입력값이 랜덤숫자보다 크면
				System.out.println("맞춰야할 숫자가 더 작습니다"); //다운을 외친다
			}else if(guess < magicNumber) {//만약 입력값이 랜덤숫자보다 작으면
				System.out.println("맞춰야할 숫자가 더 큽니다");//업을 외친다
			}
			
			if(!isMatched) { //만약 포문이 10회 돌때까지 isMatched값이 false로 남아있다면
				System.out.println("정답을 맞추지 못했습니다.");	//이렇게 출력
			}
		}
		
		sc.close();//문닫고 나가
	}

}
