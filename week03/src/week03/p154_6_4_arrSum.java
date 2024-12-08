package week03;
//멘토씨리즈 자바 예제 코드작성 p154
//배열 값에서 짝수의 합 구하기
public class p154_6_4_arrSum {
	
	public static void main(String[] args) {
		
		int[] numbers = new int[10]; //10개 칸이 있는 1차원 배열 선언
		
		for(int i=0; i < numbers.length; i++) {
			numbers[i] = (int)((Math.random() *30))+1;
			//for문으로 배열의 길이만큼 돌리면서 각 인덱스값에 랜덤값을 넣어줌
		}
		
		int sum = 0;
		for(int i=0; i < numbers.length; i++) {
			if(numbers[i] % 2== 0) {
				sum += numbers[i];
				//for문으로 배열의 길이만큼 반복하는데 만약 해당 인덱스의 값이 2로 나눴을 때 값이 0이면 = 짝수이기 때문에 sum이라는 변수에 누적합산 해준다
			}
		}
		
		for(int i=0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " ");
			//배열에 들어있는 값을 순서대로 출력하기 위한 반복문, +""을 넣어서 문자열로 나오게 했다
		}
		
		System.out.println();
		System.out.println("배열들의 짝수들의 합 : "+ sum);
		
//		출력결과물
//		18 
//		23 
//		10 
//		30 
//		13 
//		21 
//		4 
//		12 
//		2 
//		16 
//
//		배열들의 짝수들의 합 : 92

		
		
	}

}
