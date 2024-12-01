package week02;
//멘토씨리즈 자바 예제 코드작성 p137
public class p137_5_6_doWhile {
	public static void main(String[] args) {
		
		int sum = 0; //정수형 변수 선언 = 0으로 초기화
		int i = 1; //정수형 변수 선언 = 1로 초기화
		
		do { //do-while문은 일단 do안에 있는것을 무조건 1회 실행하게됨
			sum += i; //i값이 1이니까 일단 값을 더해서 변수에 넣고
			i++; //i값을 하나 더한다
		}while(i <= 10); //조건이 만족할 때까지 do로 올라가서 실행문을 반복한다
		
		System.out.println("합 : " + sum);
		//1~10까지 더한 55가 나온다
	}

}
