package week02;
//멘토씨리즈 자바 예제 코드작성 p92
public class p92_3_12_cal4 {
	public static void main(String[] args) {
		
		int x = 10; //int타입 x에 10을 저장해서 초기화
		int y = 1; //int타입 y에 1을 저장해서 초기화
		
		y += x; // y 1 에 x 10을 더한 후 11 이 되면 그걸 다시 y에 넣음
		System.out.println(y); // 그래서 결과는 11
		
		y *= x; // 현재 y는 11이고 거기에 x값 10을 곱한 후 110이 되면 다시 y에 저장함
		System.out.println(y); // 그래서 110이 출력된다
		
		y %= x; // 현재 110이 y 에 담겨있고 110을 x인  10으로 나눴을 때 나머지가 하나도 없으므로 0이 저장된다
		System.out.println(y); //그래서 결과값은 0
		
		//변수라는 것은 데이터를 몇번이고 수정해서 넣을 수 있는 상자같은 것
		
	}
}
