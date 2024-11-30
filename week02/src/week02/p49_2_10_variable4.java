package week02;

//멘토씨리즈 자바 예제 코드작성 p49

public class p49_2_10_variable4 {

	public static void main(String[] args) {

		int myAge = 20; //정수형 변수 myAge 선언하자마자 20이라는 값을 넣어 초기화 시킴
		int yourAge = 30; //정수형 변수 yourAge 선언하자마자 30이라는 값을 넣어 초기화 시킴
		int teamAge; //정수형 변수 teamAge를 선언함(초기화없음)
		
		
		teamAge = myAge; //teamAge에 myAge값인 20을 넣어 초기화시켜줌
		myAge = yourAge; //myAge 에 yourAge값인 30을 넣어 myAge는 30으로 바뀌었음
		yourAge = teamAge; // yourAge에 teamAge값인 20이 들어가서 yourAge는 20으로 바뀜
		
		
		System.out.println(myAge); //myAge에 있는 값 출력해보면 첫 선언은 20이었지만 위 과정을 통해 30으로 바뀜
		System.out.println(yourAge); //yourAge에 있는 값 출력해보면 첫 선언은 30이었지만 위 과정을 통해 20으로 바뀜

		

	}

}
