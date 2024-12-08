package week03;
//멘토씨리즈 자바 예제 코드작성 p173
//for-each문
public class p173_6_17_foreach {
	public static void main(String[] args) {
		
		int[] score = {90,92,93};
		
		int sum = 0;
		double avg = 0;
		for (int val : score) {
			sum += val;
			//score라는 배열의 값을 val이라는 변수에 저장하고 sum이라는 변수에 하나씩 누적합산해줌
		}
		avg = (double) sum /3; //평균값구하는데 double로 형변환 하여 실수형으로 만들어줌
		System.out.println("총점 : " + sum + "점, 평균 : " + avg + "점");
		//출력결과
//		총점 : 275점, 평균 : 91.66666666666667점
		
	}

}
