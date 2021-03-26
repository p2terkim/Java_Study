package f_game;

import e_oop.ScanUtil;

public class MyGame1 {
	
	Character1 c;
	Item1[] items;
	
	//변수 초기화
	//생성자
	MyGame1(){
		c = new Character1("가렌", 100, 50, 20, 10);
		
		items = new Item1[10];
		items[0] = new Item1("무한의 대검", 0, 0, 10, 0, 500);
		items[1] = new Item1("가시갑옷", 0, 0, 0, 10, 300);
		items[2] = new Item1("검1", 0, 0, 10, 5, 1000);
		items[3] = new Item1("검2", 0, 0, 15, 5, 1500);
		
	}
	
	public static void main(String[] args) {
		new MyGame1().start();//객체 생성 후 start메서드 호출 - start라는 메서드를 따로 만들어서 그 안에서 게임을 실행, 메인 메서드는 static메서드라 인스턴스 변수 사용시 객체 생성해야하므로 번거롭다.
	}
	
	//게임 시작 메서드
	void start(){
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
				store(); //상점 메서드 별도 생성
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
		Monster1 m = new Monster1("고블린", 20, 10, 15, 10, new Item1[]{items[0], items[1]});
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
					c.getItem(m.itemDrop());
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
	//상점 메서드
	void store(){
		
		System.out.println("상점입니다. 필요한 아이템을 확인하세요");
		
		int input = 0;
		choice : while(true){
			for (int i = 0; i < items.length; i++) {
//				System.out.print((i+1)+ ". " + items[i] + "\t");
				System.out.println(items[i].itemInfo());
			}
			System.out.println("필요한 아이템을 선택하세요");
			for (int i = 0; i < items.length; i++) {
				System.out.print((i+1)+ ". " + items[i] + "\t");
			}System.out.println();
			
			input = ScanUtil.nextInt();
			for (int i = 0; i < items.length; i++) {
				if(input - 1 == i){
					if(items[i].money <= c.money){
						c.buyItem(items[i]);
						c.money -= items[i].money;
						break choice;
					}System.out.println("돈이 부족합니다.");
					break choice;
				}
			}
			

		}
	}
	
}