package week02;
//멘토씨리즈 자바 예제 코드작성 p41

public class p41_2_5_printf3 {

	public static void main(String[] args) {
		System.out.printf("%5d" ,1); // 서식문자 출력시 %5d라고 쓰면 5칸을 확보하는데 넣을 데이터가 1개뿐이라면 왼쪽부터 공백으로 채우고 제일 오른쪽에 데이터를채운다
		System.out.println();
		System.out.printf("%5d" ,12);
		System.out.println();
		System.out.printf("%5d" ,123);
		System.out.println();
		System.out.printf("%5d" ,1234);
		System.out.println();
		System.out.printf("%5d" ,12345);
		System.out.println();

	}

}
