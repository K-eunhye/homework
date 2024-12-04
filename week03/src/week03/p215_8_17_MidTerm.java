package week03;
//멘토씨리즈 자바 예제 코드작성 p215
public class p215_8_17_MidTerm {
	//예제에서 class EX08_17
public static void main(String[] args) {
	
	int[] studentA = {97,53}; //1차원 배열 선언 및 생성
	int[] studentB = {95,66};//1차원 배열 선언 및 생성
	
	p214_8_16_MidTerm mid = new p214_8_16_MidTerm();
	// 메소드 사용을 위해 클래스 주소를 불러옴

	int sumA = mid.score(studentA); //메소드를 호출한 결과값을 sumA에 저장
	int sumB = mid.score(studentB); //메소드를 호출한 결과값을 sumB에 저장
	
	if(sumA > sumB) { //if문으로 결과값을 필터링한다 sumA값이 높으면 다음과 같이 출력
		System.out.println("A학생의 중간고사 총점이 더 높습니다");
	}else if(sumA < sumB){ //sumB값이 높으면 다음과 같이 출력
		System.out.println("B학생의 중간고사 총점이 더 높습니다");
	}else { // 두 변수의 합이 같으면 다음과 같이 출력
		System.out.println("두 학생의 중간고사 총점이 같습니다");
	}
	
	
}
	
}
