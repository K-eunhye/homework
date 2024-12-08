package week03;
//멘토씨리즈 자바 예제 코드작성 p170

public class p170_6_14_array {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];
		//2행 3열인 2차원 배열 선언과 생성
		
		//1행의 값 입력
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		//2행의 값 입력
		arr[1][0] = 11;
		arr[1][1] = 12;
		arr[1][2] = 13;
		
		//행의 주소값(참조값)출력
		System.out.println("2차원 배열 : " + arr);		
		//1행이 가진 주소값(참조값)출력
		System.out.println("2차원 배열의 1행 : " + arr[0]);
		
		//행의 크기 출력
		System.out.println("2차원 배열 : " + arr.length);	
		//각 행의 열 크기 출력
		System.out.println("2차원 배열의 1행 : " + arr[0].length);
		System.out.println("2차원 배열의 1행 : " + arr[1].length);
		//1행 1열의 값 출력
		System.out.println("arr[0][0] : " + arr[0][0]);
		
		//출력값
//					2차원 배열 : [[I@530612ba
//		           2차원 배열의 1행 : [I@f4168b8
//		           2차원 배열 : 2
//		           2차원 배열의 1행 : 3
//		           2차원 배열의 1행 : 3
//		           arr[0][0] : 1
		
	}

}
