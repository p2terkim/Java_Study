package Game;

import java.util.Scanner;

//게임의 진행을 담당하는 클래스
public class GameMain {
	
	public static void main(String[] args) {
		
		// 기본적인 변수 설정
		Scanner scanner = new Scanner(System.in);
		Hero hero = new Hero();

		// 게임의 기본적인 세팅을 하는 부분
		System.out.println("********RPG 게임********");
		System.out.println("1. 전사");
		System.out.println("2. 궁수");
		System.out.print("직업의 번호를 입력하세요 : ");
		int number = scanner.nextInt();

		// 전사가 선택된 경우
		if(number == 1)
		{
			System.out.println("전사가 선택되었습니다.");
			hero = new Warrior();
			hero.defense = 25;
			hero.power = 15;
			hero.level = 1;
			hero.hp = 80;
			hero.mp = 0;
		}

		// 궁수가 선택된 경우
		else if(number == 2)
		{
			System.out.println("궁수가 선택되었습니다.");
			hero = new Archer();
			hero.defense = 5;
			hero.power = 20;
			hero.level = 1;
			hero.hp = 50;
			hero.mp = 0;
		}
		System.out.print("영웅의 이름을 입력하세요 : ");
		hero.name = scanner.next();
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임에 입장하였습니다.");

		// 게임 시작
		while(true)
		{
			// 영웅의 능력치 보여주기
			System.out.println("***********************");
			System.out.println("현재 당신의 이름 : " + hero.name);
			System.out.println("현재 당신의 레벨 : " + hero.level);
			System.out.println("현재 당신의 힘 : " + hero.power);
			System.out.println("현재 당신의 방어력 : " + hero.defense);
			System.out.println("현재 당신의 HP : " + hero.hp);
			System.out.println("현재 당신의 MP : " + hero.mp);
			System.out.println("현재 당신의 돈 : " + hero.money + "원");
			System.out.println("현재 당신의 경험치 : " + hero.experience);
			System.out.println("***********************");
			
			// 이동 경로 선택
			System.out.println("1. 사냥터");
			System.out.println("2. 무기 상점");
			System.out.println("3. 포션 상점");
			System.out.println("4. 내정보");
			System.out.println("0. 종료");
			number = scanner.nextInt();
			
			// 사냥터에 입장
			if(number == 1)
			{
				Monster monster = new Monster();
				System.out.println("사냥터 입니다.");
				System.out.println("1. 개");
				System.out.println("2. 고양이");
				System.out.print("사냥 상대를 입력하세요 : ");
				number = scanner.nextInt();

				//개와 전투하는 경우
				if(number == 1)
				{
					monster = new WildDog();
					monster.name = "개";
					monster.hp = 100;
					monster.mp = 0;
					monster.level = 1;
					monster.power = 20;
					monster.defense = 5;
					monster.money = 10;
					monster.experience = 10;
				}
				//고양이와 전투하는 경우
				if(number == 2)
				{
					monster = new WildCat();
					monster.name = "고양이";
					monster.hp = 300;
					monster.mp = 0;
					monster.level = 5;
					monster.power = 100;
					monster.defense = 20;
					monster.money = 30;
					monster.experience = 50;
				}

				// 전투 시작
				while(true)
				{
					System.out.println("영웅의 공격입니다.");
					monster.attacked(hero.attack());
					// 몬스터의 체력이 0보다 작거나 같은 경우
					if(monster.hp <= 0)
					{
						System.out.println("몬스터가 죽었습니다.");
						hero.experience += monster.experience;
						hero.money += monster.money;
						break;
					}
					System.out.println("몬스터의 공격입니다.");
					hero.attacked(monster.attack());
					// 영웅의 체력이 0보다 작거나 같은 경우
					if(hero.hp <= 0)
					{
						System.out.println("영웅이 죽었습니다.");
						// 영웅의 체력을 1로 만듬
						hero.hp = 1;
						System.out.println("영웅이 체력 " + hero.hp + "으로 부활했습니다.");
						break;
					}
				}
			}
			// 무기 상점에 입장하는 경우
			else if(number == 2)
			{
				WeaponStore weaponStore = new WeaponStore();
				System.out.println("무기 상점에 입장하였습니다.");
				System.out.println("1. 무기(100원)");
				System.out.println("2. 방패(100원)");
				System.out.print("원하시는 물건을 입력하세요 : ");
				number = scanner.nextInt();
				int temp = hero.money;
				if((hero.money = weaponStore.show(hero.money, number)) != -1)
				{
					System.out.println("구입이 완료되었습니다.");
					if(number == 1)
						hero.power += 5;
					if(number == 2)
						hero.defense += 5;
				}
				else
				{
					System.out.println("돈이 부족합니다.");
					hero.money = temp;
				}
			}
			// 포션 상점에 입장하는 경우
			else if(number == 3)
			{
				PotionStore potionStore = new PotionStore();
				System.out.println("포션 상점에 입장하였습니다.");
				System.out.println("1. 힘 증강 포션(100원)");
				System.out.println("2. 방어력 증강 포션(100원)");
				System.out.println("3. 경험치 증강 포션(300원)");
				System.out.println("4. HP 증강 포션(10원)");
				System.out.println("5. MP 증강 포션(10원)");
				System.out.print("원하시는 물건을 입력하세요 : ");
				number = scanner.nextInt();
				int temp = hero.money;
				if((hero.money = potionStore.show(hero.money, number)) != -1)
				{
					System.out.println("구입이 완료되었습니다.");
					if(number == 1)
						hero.power += 3;
					if(number == 2)
						hero.defense += 3;
					if(number == 3)
						hero.experience += 50;
					if(number == 4)
						hero.hp += 50;
					if(number == 5)
						hero.mp += 50;
				}
				else
				{
					System.out.println("돈이 부족합니다.");
					hero.money = temp;
				}
			}
			if(hero.experience >= hero.level * 100)
			{
				hero.level += 1;
				System.out.println("영웅의 레벨이 " + hero.level + "이 되었습니다.");
				hero.money += hero.level * 50;
				System.out.println("레벨업 기념으로 돈이" + hero.level * 50 + "원 증가했습니다.");
				hero.experience = 0;
			}
		}
	}
}
