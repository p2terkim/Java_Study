package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
//		과제) 탄수화물 중독 자가진단.
		
		Scanner sc = new Scanner(System.in);
		
		String answer = null;
		int sum = 0;
		
		
		System.out.println("아래의 질문에 대답해주세요.(y/n)");
		
		System.out.println("1. 식사후 얼마되지 않아서 금방 허기가 진다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("2. 식사후 단맛이 도는 디저트를 즐긴다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("3. 원두커피보다는 설탕을 넣은 커피를 즐긴다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("4. 스트레스를 받으면 식욕이 당긴다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("5. 스트레스를 받았을 때에 간식을 먹게 되면 기분이 안정이 된다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("6. 무언가 먹지 않으면 불안한 느낌이 들면서 일이나 공부 등에 집중하기가 힘들다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("7. 습관적으로 빵이나 과자를 찾게 된다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("8. 아침을 거른 날보다, 아침을 먹은 날이 점심 시간이 되기 전에 더욱 배가 고프다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("9. 패스트푸드나 인스턴트 식품을 즐겨먹는다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("10. 식사후 졸리고 나른한 경우가 종종 있다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("11. 빵이나 과자, 케익을 먹기 시작하면 양을 조절하지 못하고 끊임없이 먹게된다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("12. 많이 먹어도 배가 부른 느낌이 쉽게 들지 않는다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("13. 배가 불러도 입에서 음식이 당겨 음식을 제한하지 못한다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("14. 부모님 중 혈압, 당뇨, 심장병, 고지혈증 등의 순환기질환을 가진 분이 계신다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("15. 잡곡밥보다는 흰쌀밥을 선호한다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("16. 밀가루 음식(스파게티, 흰식빵, 케익류 등)을 선호하며 일주일에 3회 이상 밀가루 음식을 먹는다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("17. 맛있는 음식을먹는 상상을 하거나 음식을 보아도 먹고 싶은 욕구가 강하게 든다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("18. 평소 운동을 규칙적으로 하지 않고 생활 운동량도 많지 않다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("19. 체중을 감량하더라도 다시 쉽게 찐다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("20. 부모형제나 친인척 중에 비만인 사람이 있다.>");
		answer = sc.nextLine();
		
		if (answer.equals("y") || answer.equals("Y")){
			sum++;
		}
		
		System.out.println("6개 이하 : 정상");
		System.out.println("7 ~ 13개 : 탄수화물 중독의 위험");
		System.out.println("14개 이상  : 탄수화물 중독증");
		
		if (sum < 6){
			System.out.println(sum + "개 이므로 정상입니다.");
		}else if(7 <= sum && sum <= 13){
			System.out.println(sum + "개 이므로 탄수화물 중독 위험입니다.");
		}else {
			System.out.println(sum + "개 이므로 탄수화물 중독증입니다.");
		}
		
		
		
		
		
	}

}
