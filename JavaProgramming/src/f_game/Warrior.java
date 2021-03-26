package f_game;

import java.util.Scanner;

import e_oop.ScanUtil;

public class Warrior extends Character {

	void attack(Monster m){
		
		System.out.println("1. 공격1");
		System.out.println("2. 공격2");
		System.out.print("공격 번호를 입력하세요 : ");
		int number = ScanUtil.nextInt();
		
//		int damage = att - m.def;//캐릭터의 공격력 - 몬스터의 방어력(하지만 캐릭터의 공격력 보다 몬스터의 방어력이 높을 수도 있으므로 결과값이 0보다 작게 나오게 해줘야한다.)
//		damage = damage <= 0 ? 1 : damage; 
//		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;//체력이 0 밑으로 떨어지지 않게 해준다.
//		System.out.println(name + "가 공격으로" + m.name + "에게 " 
//				+ damage + "만큼 데미지를 주었습니다.");
//		System.out.println(m.name + "의 남은 HP : " + m.hp);
	}

}
