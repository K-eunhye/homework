package week02;
//멘토씨리즈 자바 예제 코드작성 p65
public class p65_2_22_intByte {

	public static void main(String[] args) {
		
		int i1 = 10; //정수형 int타입 i1변수 선언하고 10으로 값 초기화
		byte b1 = (byte)i1; //정수형 byte타입 b1 선언하고 i1의 값 10을 byte형으로 강제형변환하여 넣기
		System.out.println(b1); // byte는 127까지 표현할 수 있으므로 제대로 10이 나온다
		
		
		int i2 = 128;//정수형 int타입 i2변수 선언하고 128으로 값 초기화
		byte b2 = (byte)i2;//정수형 byte타입 b2 선언하고 i2의 값 128을 byte형으로 강제형변환하여 넣기
		System.out.println(b2); // byte타입은 128이라는 숫자를 담지 못해 오버플로우 현상이 일어났으므로 -128로 표기됨.
		
		
		
		
		
	}
}
