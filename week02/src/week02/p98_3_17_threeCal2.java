package week02;
//멘토씨리즈 자바 예제 코드작성 p98
public class p98_3_17_threeCal2 {
	public static void main(String[] args) {
		
		int num = 0;//int타입 변수 num에 초기값 0을 넣어준다
		
		if(7 > 1) { // 만약 1보다 7이 큰게 참이라면 num에 1값을 넣고
			num = 1;
		}else { //그게 아닌 모든 경우에 num에 2를 넣어라
			num = 2;
		}
		
		System.out.println(num); // 7>1이 참이었으므로 결과값은 1이 나온다
	}

}
