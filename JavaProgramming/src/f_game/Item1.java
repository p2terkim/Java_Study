package f_game;

public class Item1 {
	
	//아이템 속성
	String name;	//이름
	int hp; 		//체력
	int mp;			//마나
	int att;		//공격력
	int def;		//방어력
	int money;		//돈 ************

	//변수 초기화
	//생성자 생성
	Item1(String name, int hp, int mp, int att, int def, int money){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.att = att;
		this.def = def;
		this.money = money;//돈***********
	}
	
	//아이템 정보창 메서드
	public String itemInfo(){
		String info = name + " :";
		if(0 < hp) info += " 체력+" + hp;
		if(0 < mp) info += " 마나+" + mp;
		if(0 < att) info += " 공격력+" + att;
		if(0 < def) info += " 방어+" + def;
		return info + "금액 : " + money;//돈***********
	}
}