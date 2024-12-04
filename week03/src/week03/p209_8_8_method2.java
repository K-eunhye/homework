package week03;
//멘토씨리즈 자바 예제 코드작성 p209
public class p209_8_8_method2 {
	//예제에서 class는 Calc
	//매개변수가 2개 이상인 메소드 정의
	
	void sum(int num1, int num2) { //int타입 매개변수 2개가 있고 리턴값없는 메소드 선언
		System.out.println("두 수의 합은 " + (num1+num2) + "입니다."); //구현부의 실행문 매개변수 2개를 더한 값과 문장을 출력한다
	}
	
	//예제코드 8_12의 내용
	//매개변수를 배열로 받는 메소드 정의
	
//	
//	void sum(int[] nums) {//리턴값없고 매개변수는 정수타입배열로 받음
//		int result = 0;//합을 모두 저장하기 위해 선언한 변수
//		for(int i = 0; i < nums.length; i++) {
//			result += nums[i];
//			//배열에 들어가 있는 값을 인덱스 0번부터 시작해서 배열의 길이만큼 for문을 반복한 후
//			//그 값을 result에 누적해서 저장해줌
//		}
//		System.out.println("숫자들의 합은 " +result + "입니다.");//결과는 이렇게 나오도록 한다
//	}
	
	//예저코드 8_14 result를 반환하는 메서드 정의
	
	public int sum(int[] nums) {//매개변수 있고 리턴값도 있는 메소드
		int result = 0;//합을 모두 저장하기 위해 선언한 변수
		for(int i = 0; i < nums.length; i++) {
			result += nums[i];
			//배열에 들어가 있는 값을 인덱스 0번부터 시작해서 배열의 길이만큼 for문을 반복한 후
			//그 값을 result에 누적해서 저장해줌
		}
		return result; //매개변수로 받은 값을 모두 더한 result값을 다시 반환함
	}
	

}
