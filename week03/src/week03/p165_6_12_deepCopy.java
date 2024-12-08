package week03;

import java.util.Arrays;

//멘토씨리즈 자바 예제 코드작성 p165
public class p165_6_12_deepCopy {
	public static void main(String[] args) {
		
		int[] card = {3,1,4,5,10};
		//1차원 배열 선언 및 생성
		
		int[] newCard = Arrays.copyOf(card, card.length);
		//newCard라는 새 배열 만드는데 Arrays.copyOf라는 메소드를 사용해 간단히 복사해옴
		// 값자체를 복사해왔기때문에 깊은 복사
		
		 System.out.println("card 배열" + Arrays.toString(card));

		 card[1] = 10;
		 //원본배열의 값을 바꿨다
		 
		 System.out.println("card 배열" + Arrays.toString(card));
		 System.out.println("newCard 배열" + Arrays.toString(newCard));
		 //원본의 값만 바뀌고 복사해온  newCard의 배열은 복사해온 그 시점과 같이 그대로이다
		
	}

}
