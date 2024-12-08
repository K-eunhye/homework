package week03;
//멘토씨리즈 자바 예제 코드작성 p195
//예제 7_12 ~ 7_15
public class p195_7_12_Student {
//예제에서 class Student

	static String schoolName = "코리아 고등학교"; //정적멤버 선언
	String studentName; //인스턴트 필드 선언
	
	static void goToSchool() {//정적 메소드 선언
		System.out.println("오늘은 학교에 가는 날입니다");
	}
	void hello() {
		System.out.println("안녕하세요, 제 이름은 " +studentName + "입니다");
	}
	
	
	

	public static void main(String[] args) {
		
		System.out.println(p195_7_12_Student.schoolName); //정적 필드 호출
		p195_7_12_Student.goToSchool(); //정적메소드 호출
		
		//출력결과
//		코리아 고등학교
//		학교에 갑니다
		
		//객체 stu1 생성
		p195_7_12_Student stu1 = new p195_7_12_Student();
		stu1.studentName = "김고이";
		stu1.hello();
		System.out.println("학교는 " +p195_7_12_Student.schoolName + "입니다");
		p195_7_12_Student.goToSchool();
		
		//객체 stu2 생성
		p195_7_12_Student stu2 = new p195_7_12_Student();
		stu2.studentName = "김고삼";
		stu2.hello();
		System.out.println("학교는 " +p195_7_12_Student.schoolName + "입니다");
		p195_7_12_Student.goToSchool();
		
		//객체를 따로 생성하면 그 안의 인스턴스 필드 값을 다르게 설정할 수 있다.
		
		//출력물
//		코리아 고등학교
//		오늘은 학교에 가는 날입니다
//		안녕하세요, 제 이름은 김고이입니다
//		학교는 코리아 고등학교입니다
//		오늘은 학교에 가는 날입니다
//		안녕하세요, 제 이름은 김고삼입니다
//		학교는 코리아 고등학교입니다
//		오늘은 학교에 가는 날입니다
		
		
		

	}






}
