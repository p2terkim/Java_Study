package Game;

import java.util.Scanner;
//전사 클래스
public class Warrior extends Hero{
	// 공격을 하는 함수
	public int attack() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 공격1");
		System.out.println("2. 공격2");
		System.out.print("공격 번호를 입력하세요 : ");
		int number = scanner.nextInt();

		// sum은 전체 공격력을 의미하는 변수이다.
		int sum = 0;

		// 공격1
		if(number == 1)
		{
			sum += level * 10;
			sum += power * 30;
			System.out.println("데미지는 " + sum + "입니다.");
			return sum;
		}
		// 공격2
		else if(number == 2)
		{
			sum += level * 20;
			sum += power * 15;
			sum += defense * 15;
			System.out.println("데미지는 " + sum + "입니다.");
			return sum;
		}
		System.out.println("데미지는 " + sum + "입니다.");
		return sum;
	}

	// 공격을 받는 함수
	public void attacked(int sum) {
		// 방어력이 받은 데미지보다 큰 경우
		if(defense >= sum)
			hp = hp - 0;
		else
			hp = hp + defense - sum;
	}
}