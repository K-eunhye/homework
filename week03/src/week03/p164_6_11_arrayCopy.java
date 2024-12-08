package week03;
//멘토씨리즈 자바 예제 코드작성 p164
import java.util.Arrays;

public class p164_6_11_arrayCopy {
	public static void main(String[] args) {
		
		int[] card = {1,6,4,5,3,2};
		//1차원 배열 선언과 생성
		int[] newCard = new int[card.length];
		//새 배열을 만드는데 배열의 길이는 card라는 변수와 같게 설정
		
		for(int i = 0; i < card.length; i++) {
			newCard[i] = card[i];
		}
		
		//Arrays.toString 메소드를 이용해 자동으로 배열값 보여줌
	 System.out.println("card 배열" + Arrays.toString(card));
	 System.out.println("newCard 배열" + Arrays.toString(newCard));
		
//	 출력물
//	 card 배열[1, 6, 4, 5, 3, 2]
//	 newCard 배열[1, 6, 4, 5, 3, 2]
	 

		
		
	}

}
