package week03;

import java.util.Arrays;

//멘토씨리즈 자바 예제 코드작성 p163
//얕은복사
public class p163_6_10_Copy {
	public static void main(String[] args) {
		
		int[] arr01 = {1,2,3};
		// 실험을 위한 1차원 배열선언과 생성
		
		int[] arr02 = arr01;
		//배열의 얕은 복사
		
		System.out.println("arr01배열 : " + Arrays.toString(arr01));
		//arr01을 출력함
		
		arr02[1] = 10;
		//arr02배열의 인덱스값 1, 그니까 2번째 자리의 값을 10으로 바꿈
		System.out.println("arr02배열 : " + Arrays.toString(arr01)); 
		System.out.println("arr01배열 : " + Arrays.toString(arr02));
		//둘의 참조값이 같기 때문에 한쪽의 값만 바꿨어도 arr01과 arr02의 값은 똑같아짐
		//출력값
//		arr01배열 : [1, 2, 3]
//		arr02배열 : [1, 10, 3]
//		arr01배열 : [1, 10, 3]
		
		
	}

}
