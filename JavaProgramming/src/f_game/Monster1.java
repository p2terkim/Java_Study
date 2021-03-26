package f_game;

public class Monster1 {
	
	//몬스터의 속성
		String name;	//이름
		int maxHp;		//최대 체력
		int maxMp;		//최대 마나
		int hp; 		//체력
		int mp;			//마나
		int att;		//공격력
		int def;		//방어력
		Item1[] items;	//보유아이템

		//변수 초기화
		//생성자
		Monster1(String name, int hp, int mp, int att, int def, Item1[] items){
			this.name = name;
			this.maxHp = hp;
			this.maxMp = mp;
			this.hp = this.maxHp;
			this.mp = this.maxMp;
			this.att = att;
			this.def = def;
			this.items = items;//몬스터가 죽었을때 가지고있는 아이템들 중 랜덤하게 몇 개만 떨어지게 만든다.
		}

		//캐릭터 공격 메서드 / 파라미터 : 공격할 대상-캐릭터
		void attack(Character1 c){
			int damage = att - c.def;//몬스터의 공격력 - 캐릭터의 방어력(하지만 몬스터의 공격력 보다 캐릭터의 방어력이 높을 수도 있으므로 결과값이 0보다 작게 나오게 해줘야한다.)
			damage = damage <= 0 ? 1 : damage; 
			c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage;//체력이 0 밑으로 떨어지지 않게 해준다.
			System.out.println(name + "가 공격으로" + c.name + "에게 " 
					+ damage + "만큼 데미지를 주었습니다.");
			System.out.println(c.name + "의 남은 HP : " + c.hp);
		}

		//죽을 때 아이템 드랍 메서드
		Item1 itemDrop(){
			return items[(int)(Math.random() * items.length)];
		}
}