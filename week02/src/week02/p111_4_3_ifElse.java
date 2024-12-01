package week02;
//멘토씨리즈 자바 예제 코드작성 p111
public class p111_4_3_ifElse {
	public static void main(String[] args) {
		
		int num = 5; //int타입 변수 선언 후 5를 넣어 초기화
		
		if(num > 4) { //만약 num에 들어간 값이 4보다 크다면 = true였음
			System.out.println(num + "은(는) 4보다 큽니다"); //()안의 내용을 출력하라
		}else {//그게 아닌 모든 경우에
			System.out.println(num + "은(는) 4보다 작습니다");//()안의 내용을 출력하라
		}
		//결과값은 '5은(는) 4보다 큽니다'로 나옴
	}

}
