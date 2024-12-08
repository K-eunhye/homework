package week03;

import java.util.Scanner;

//멘토씨리즈 자바 예제 코드작성 p171
//2차원배열로 만드는 로또
public class p171_6_16_lotto {
	
	public static void main(String[] args) {
		//5행 6열짜리 2차원배열생성
		//당첨번호 리스트
		int[][] lotto = {{2,6,11,33,42,44},
						{1,6,17,22,24,33},
						{7,16,24,33,42,44},
						{11,27,32,34,43,46},
						{6,17,22,24,33,41}};
		
		//스캐너+임포트
		Scanner sc = new Scanner(System.in);
		String myNum = "";
		System.out.println("당첨 숫자 6개를 연속으로 입력해주세요 : ");
		myNum = sc.next();		//입력받고 변수에 저장
		
		//당첨여부 나타내는 변수
		boolean isWin = false;
		
		for(int i=0; i<lotto.length; i++) {
			
			//당첨번호를 만들기 위한 변수
			String lottoNumber = "";
			//한 행의 번호를 더해서 하나의 숫자로 만든다
			for(int j=0; j<lotto.length; j++) {
				lottoNumber += lotto[i][j];
			}
			
			if(myNum.equals(lottoNumber)) { //내가 입력한 번호가 로또넘버랑 같다면
				isWin =true; //당첨여부 true로 바꾸고
				break;//탈출
				
			}
			
		}
		
		if(isWin) {
			System.out.println(myNum + "번호당첨!!");			
		}else {
			System.out.println(myNum + "번호는 당첨이 아닙니다");			
		}
		
		sc.close();
		
	}

}
