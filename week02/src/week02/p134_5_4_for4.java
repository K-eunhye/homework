package week02;
//멘토씨리즈 자바 예제 코드작성 p134
public class p134_5_4_for4 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 7; i++){ //7줄짜리 삼각형 만들기
			//반복문 for 선언
			//초기식은 정수형 변수 i선언하고 0값 넣어 초기화함
			//조건식은 i가 7보다 작을 때까지 라고 쓰고
			// 한번 반복할 때 마다 증감식으로 i를 1늘려줌
			for(int j = 0; j < 7-i; j++) { //공백 넣는 for문
				//포문 안에 안쪽포문1 만들어서 공백을 넣어준다
				//초기식은 정수형 변수 j선언하고 
				//마지막줄에는 공백을 안넣어주니까 j< 7-i로 조건식 만든다
				//하나씩 숫자 늘려가야하니까 증감식 넣기
				System.out.print(" "); //줄바꿈없이 한줄에 나오게
			}
			for(int k = 0; k < (2*i)+1; k++) { //별 넣는 for문
				//포문 안에 안쪽포문2 만들어서 별을 넣어준다
				//초기식은 정수형 변수 k선언하고 
				//홀수로 늘어나야하니까 k < (2*i)+1로 조건식 넣기
				//하나씩 숫자 늘려가야하니까 증감식 넣기
				System.out.print("*");//줄바꿈없이 한줄에 나오게
			}
			System.out.println();//한줄끝날때마다 줄바꿈
		}
	}

}