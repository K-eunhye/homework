package week02;
//멘토씨리즈 자바 예제 코드작성 p95
public class p95_3_15_cal7 {
	public static void main(String[] args) {
		
		boolean b1 = true; 
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println("###논리곱###"); // 둘다 true여야 true 
		System.out.println(b1 && b2); // true와 false라서 false
		System.out.println(b1 && b3); // true와 true라서 true
		System.out.println(b2 && b4); // false와 false라서 false
		
		System.out.println("###논리합###"); // 둘중 하나라도 true여야 true 
		System.out.println(b1 || b2); // true와 false라서 true
		System.out.println(b1 || b3); // true와 true라서 true
		System.out.println(b2 || b4); // false와 false라서 false
		
		System.out.println("###배타적 논리합###"); // 둘의 값이 다르면 true 둘의 값이 같으면 false
		System.out.println(b1 ^ b2); // true와 false라서 true
		System.out.println(b1 ^ b3); // true와 true라서 false
	}

}
