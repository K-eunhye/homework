package week03;
//멘토씨리즈 자바 예제 코드작성 p171
public class p171_6_15 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		//5x5 짜리 2차원 배열생성
		
		int count = 1;
		
		//1부터 25까지 차례로 배열에 값을 넣는다
		for(int i=0; i<5; i++) {//행
			for(int j=0; j<5; j++) {//열
				arr[i][j] = count++; //1부터 넣고 다음열에 증가된 숫자가 들어가게 된다				
			}
		}
		
		//배열출력하기
		for(int i=0; i<5; i++) {//행
			for(int j=0; j<5; j++) {//열
				System.out.print(arr[i][j] + "\t"); //문자열로 볼수 있게 출력		
			}
			System.out.println();
		}
		
		
	}

}
