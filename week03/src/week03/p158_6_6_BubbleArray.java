package week03;
//멘토씨리즈 자바 예제 코드작성 p158
public class p158_6_6_BubbleArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,6,2,3,10,7,4,5,8,9};
		//정렬에 쓰기위해 1차원 배열 선언과 생성한다
		
		int temp = 0;
		//값을 치환하기 위한 임시 변수
		
		//버블정렬이란????
		//맨뒤의 큰 수부터 배치해서 전체적으로 오름차순이(숫자작은게 왼쪽 큰게 오른쪽) 되는 정렬이다
		
		for(int i = arr.length - 1; i > 0 ; i--) {  //i는 배열의 길이로 시작해서 점점 하나씩 줄어간다
			//int i = arr.length - 1 부터 시작하는 이유는 맨뒤의 2번째부터 오른쪽값과 비교하며 자리를 바꿔야하기 때문이다
			
			for(int j=0; j<i; j++) {
				
				if(arr[j] > arr[j+1]) { //왼쪽값이 오른쪽값보다 크다면 정렬을 진행한다
					
					temp = arr[j+1]; //왼쪽값이 오른쪽보다 크면 일단 오른쪽값을 임시값에 저장
					arr[j+1] = arr[j]; // 왼쪽값을 오른쪽으로 보낸다
					arr[j] = temp; //아까 저장해둔 오른쪽값을 왼쪽에 보낸다.
					// 그러면 왼쪽과 오른쪽의 값이 바뀌어 있다.					
				}				
			}	
		}
		
		System.out.println("정렬 후 출력 : ");
		for(int i=0; i < arr.length; i++) { //for문으로 숫자를 하나씩 차례대로 출력해준다
			System.out.print(arr[i] + " ");
		}
		
		//출력값
//		정렬 후 출력 : 
//		1 2 3 4 5 6 7 8 9 10 
		
		
		
	}

}
