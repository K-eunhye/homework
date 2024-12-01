package week02;
//멘토씨리즈 자바 예제 코드작성 p112
public class p112_4_5_ifElse3 {
	public static void main(String[] args) {
		
		int a = 4; //int타입 변수에 4값을 넣어 초기화
		int b = 10;//int타입 변수에 10값을 넣어 초기화
		int max = 0; //int타입 변수에 0값을 넣어 초기화
		
		if( a > b ) { //만약 a>b가 참이면 = 4>10=거짓이다
			max = a; //max에 4를 넣고
		}else { //그게 아닌 모든 경우에 
			max = b; // max에 10을 넣는다
		}
		System.out.println(a + "와(과) " + b + "중에 큰 수는 " + max + "입니다");
		
	}

}
