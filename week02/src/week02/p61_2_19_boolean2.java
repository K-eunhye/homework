package week02;
//멘토씨리즈 자바 예제 코드작성 p61
public class p61_2_19_boolean2 {
	
	public static void main(String[] args) {
		
		boolean isStudent = true; //논리형 boolean 타입의 변수 이름은 isStudent이며 값은 true를 넣어 초기화 시켜준다.
		//boolean은 값이 true / false 총 2가지 방식으로만 나온다. 그래서 2byte다
		
		if(isStudent){ //만약 isStudent가 true이면 "저는학생입니다"를 출력하고
			System.out.println("저는 학생입니다");
		}else {//그게 아닌 나머지 경우의 수 모두(false) = 현재 여기서는 false인 경우밖에 없음
			System.out.println("저는 학생이 아닙니다"); //"저는 학생이 아닙니다"출력
		}
		
		
		
		
	}

}
