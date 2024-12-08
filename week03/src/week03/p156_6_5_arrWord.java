package week03;
//멘토씨리즈 자바 예제 코드작성 p156
//배열에서 단어만 추출하여 출력하기
public class p156_6_5_arrWord {
	public static void main(String[] args) {
		
		char[] cards = {'1', 'L', 'O', '2', 'V', '3', 'E'};
		String myWord = " ";
		
		for(int i=0; i < cards.length; i++) {
			//문자는 아스키코드표에 의해 10진수 숫자로 대응된다
			int word = cards[i];
//			
			//65~90사이는 대문자 A~Z 또는 97~122사이는 a~z이다
			
			if((word >=65 && word <= 90) || (word >= 97 && word <= 122)) {
//				cards라는 배열의 인덱스에 저장되어 있는 각각의 값을 word라는 변수에 한번씩 저장하는데
//				그 값이 65~90사이거나  97~122사이는 a~z이면 myWord라는 문자열 변수에 문자형으로 변환하여 저장한다.
				myWord += (char)word;
			}			
			
		}
		
		System.out.println("단어 : " + myWord);
//		출력값
//		단어 :  LOVE
		
	}

}
