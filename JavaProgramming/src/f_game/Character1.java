package f_game;

public class Character1 {

	//캐릭터 속성
	String name; //이름
	int maxHp;//최대체력
	int maxMp;//최대마나
	int hp;//체력
	int mp;//마나
	int att;//공격
	int def;//방어
	int level;//레벨
	int exp;//경험치
	Item1[] items;//아이템
	int money;//***돈 추가

	//변수 초기화
	//생성자
	Character1(String name, int hp, int mp, int att, int def){
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = maxHp;
		this.mp = maxMp;
		this.att = att;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.items = new Item1[10]; // Item 클래스
		this.money = 1000000;//***돈 추가
	}

	//캐릭터 정보창 메서드
	void showInfo(){
		System.out.println("======================================");
		System.out.println("------------------상태-----------------");
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level + "(" + exp + "/100)");
		System.out.println("체력 : " + hp + "/" + maxHp);
		System.out.println("마나 : " + mp + "/" + maxMp);
		System.out.println("공격 : " + att);
		System.out.println("방어 : " + def);
		System.out.println("보유 금액 : " + money);//***돈 추가
		System.out.println("-----------------아이템-----------------");
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
				System.out.println(items[i].itemInfo()); //만들고 싶은 메서드를 먼저 적어놓고 'Ctrl + 1'을 누르면 자동으로 해당 클래스에 메서드를 만들어준다. 
			}
		}
		System.out.println("======================================");
	}

	//몬스터 공격 메서드 / 파라미터 : 공격대상 - 몬스터
	void attack(Monster1 m){
		int damage = att - m.def; //캐릭터 공격력 - 몬스터 방어력 , 데미지 > 0 이어야한다.
		damage = damage <= 0 ? 1 : damage; //데미지가 0보다 작으면 1이 되게한다.
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;
		System.out.println(name + "가 공격으로" + m.name + "에게" 
				+ damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 HP : " + m.hp);

	}

	//경험치 획득 메서드 / 파라미터 : 몬스터에 따라 차등적 경험치 획득
	void getExp(int exp){
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		this.exp += exp;
		//경험치가 일정 수준을 넘으면 레벨업을 하는 로직
		while (100 <= this.exp) {
			levelUp();
			this.exp -= 100;
		}
	}

	//레벨업 메서드 / 파라미터 : 없음
	void levelUp(){
		level++;
		maxHp += 10;
		maxMp += 5;
		att += 2;
		def += 2;
		hp = maxHp;
		mp = maxMp;
		money += 100000; //레벨업 시 돈 획득
		System.out.println("LEVEL UP!!");
	}

	//아이템 획득 메서드 / 파라미터 : 어떤 아이템을 획득할 것인가
	void getItem(Item1 item){
		System.out.println(item.name + "을 획득하였습니다.");
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = item;
				break;
			}
		}
		maxHp += item.hp;
		maxMp += item.mp;
		att += item.att;
		def += item.def;
	}
	
	//아이템 구매 메서드 / 파라미터 : 어떤 아이템을 구매할 것인가
		void buyItem(Item1 item){
			System.out.println(item.name + "을 구매하였습니다.");
			for (int i = 0; i < items.length; i++) {
				if (items[i] == null) {
					items[i] = item;
					break;
				}
			}
			maxHp += item.hp;
			maxMp += item.mp;
			att += item.att;
			def += item.def;
		}

}



















