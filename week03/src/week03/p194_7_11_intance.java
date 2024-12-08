package week03;
//멘토씨리즈 자바 예제 코드작성 p194
public class p194_7_11_intance {
	
	
	public static void main(String[] args) {
		

		p193_7_10_static father = new p193_7_10_static(); //같은 클래스로 아빠 객체 생성
		p193_7_10_static son = new p193_7_10_static(); //같은 클래스로 아들 객체생성
		
		father.adress = "인천";
		System.out.println(son.adress);
	}
	

}
