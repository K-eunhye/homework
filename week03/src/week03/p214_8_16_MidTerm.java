package week03;
//멘토씨리즈 자바 예제 코드작성 p214
public class p214_8_16_MidTerm {
//	예제에서 class는 MidTerm
	
	public int score(int[] scores) { // int형 배열 매개변수 1개인 메소드 선언 , 리턴값있음
		int result = 0;  //합계누적할 변수선언
		for(int i = 0; i < scores.length; i++) {
			result += scores[i]; //배열의 길이만큼 for문 돌리면서 배열에 들어있는 값들을 result에 계속 누적 합산 해준다.
		}
		return result; //결과를 result로 반환하며 이 식 전체를 값으로 쓴다
	}

}
