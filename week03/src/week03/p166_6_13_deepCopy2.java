package week03;

import java.util.Arrays;

//멘토씨리즈 자바 예제 코드작성 p166
//깊은복사
public class p166_6_13_deepCopy2 {
	
	public static void main(String[] args) {
		
		int[] card = {1,6,4,5,3,2};
		int[] newCard = new int[card.length];
		//배열 2개 생성, newCard라는 배열은 card의 배열길이와 똑같게만 만들고 안에 값은 없다
		
		System.arraycopy(card, 0, newCard, 0, card.length);
		//System.arraycopy를 통해 배열복사를 쉽게 할 수 있다.
		
		 System.out.println("card 배열" + Arrays.toString(card));
		 System.out.println("newCard 배열" + Arrays.toString(newCard));
		
		
		
	}

}
