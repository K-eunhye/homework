package week03;

import java.util.Arrays;
import java.util.Comparator;

//멘토씨리즈 자바 예제 코드작성 p161
public class p161_6_9_ArraySort {

	public static void main(String[] args) {
		//Arrays.sort()를 이용한 배열의 오름차순 정렬
		
		int[] arr = {1,6,2,3,10,7,4,5,8,9};
		//정렬에 쓰기위해 1차원 배열 선언과 생성한다
		System.out.println("정렬전 배열 : " + Arrays.toString(arr));
//		Arrays.sort(arr , Comparator.reverseOrder()); //자동으로 내림차순 정렬해주는 메소드
		System.out.println("내림차순 정렬 후 배열 : " + Arrays.toString(arr));
		
		
	
	
	
	
	}
}
