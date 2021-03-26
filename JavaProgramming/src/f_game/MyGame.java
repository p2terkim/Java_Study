package f_game;

import Game.PotionStore;
import e_oop.ScanUtil;

public class MyGame {
	
	Character c;
	Item[] items;
	
	//변수 초기화
	//생성자
	MyGame(){
		c = new Character(100, 50, 20, 10, 2000);
		
		items = new Item[10];
		items[0] = new Item("무한의 대검", 0, 0, 10, 0, 100);
		items[1] = new Item("가시갑옷", 0, 0, 0, 10, 100);
		
	}
	
	public static void main(String[] args) {
		new MyGame().start();//객체 생성 후 start메서드 호출 - start라는 메서드를 따로 만들어서 그 안에서 게임을 실행, 메인 메서드는 static메서드라 인스턴스 변수 사용시 객체 생성해야하므로 번거롭다.
	}
	
	//게임 시작 메서드
	void start(){
		
		//캐릭터 이름 직접 만들기
		System.out.print("캐릭터의 이름을 입력하세요 : ");
		c.name = ScanUtil.nextLine();
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임에 입장하였습니다.");
		
		int input = 0;
		while(true){
			
			System.out.println("1.내정보\t2.사냥\t3.상점\t0.종료");
			input = ScanUtil.nextInt();
			
			switch (input) {
			case 1:
				c.showInfo();
				break;
			case 2:
				hunt(); //사냥 메서드 별도 생성
				break;
			case 3:
				store(); //상점 메서드 추가
				break;
			case 0:
			System.out.println("종료되었습니다.");
			System.exit(0); //프로그램 종료 메서드

			default:
				break;
			}
		}
	}
	

	//사냥 메서드 / 파라미터 : 사냥할 몬스터
	void hunt(){
		Monster m = new Monster("고블린", 20, 10, 15, 10, new Item[]{items[0], items[1]});
		System.out.println(m.name + "를 만났습니다. 전투를 시작합니다.");
		
		int input = 0;
		battle : while(true){
			System.out.println("1.공격\t2.도망");
			input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				c.attack(m);
				if (m.hp <= 0) {
					System.out.println(m.name + "를 처치하였습니다.");
					c.getExp(150);
					Item item = m.itemDrop();
					c.getItem(item);
//					c.getItem(m.itemDrop());
					c.getMoney();
					break battle;
				}
				m.attack(c);
				break;
			case 2:
				System.out.println("도망쳤습니다.");
				break battle;
			default:
				break;
			}
					
		}
	}
	
	private void store() {
		System.out.println("상점에 입장하였습니다.");
		
		Item w1 = new Item("검1", 0, 0, 10, 0, 1000);
		Item w2 = new Item("검2", 0, 0, 20, 0, 2000);
		Item s1 = new Item("방패1", 0, 0, 0, 10, 1000);
		Item s2 = new Item("방패2", 0, 10, 0, 20, 2000);
		
		int input = 0;
		store : while(true){
			System.out.println("===============아이템===============");
			System.out.println("1. 검1(1000원, 공격력 +10)");
			System.out.println("2. 검2(2000원, 공격력 +20)");
			System.out.println("3. 방패1(1000원, 방어력 +10)");
			System.out.println("4. 방패2(2000원, 방어력 +20)");
			System.out.println("0. 상점에서 나가기");
			System.out.println("===================================");
			input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				c.buyItem(w1);
				break;
			case 2:
				c.buyItem(w2);
				break;
			case 3:
				c.buyItem(s1);
				break;
			case 4:
				c.buyItem(s2);
				break;
			case 0:
				System.out.println("상점에서 나갔습니다.");
				break store;
			default:
				break;
			
			}
		}
	}

}












