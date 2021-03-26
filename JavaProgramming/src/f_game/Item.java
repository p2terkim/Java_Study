package f_game;

public class Item {
	
	//아이템 속성
	String name;	//이름
	int hp; 		//체력
	int mp;			//마나
	int att;		//공격력
	int def;		//방어력
	int price;		//가격 추가

	//변수 초기화
	//생성자 생성
	Item(String name, int hp, int mp, int att, int def, int price){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.att = att;
		this.def = def;
		this.price = price; //가격추가
	}
	
	//아이템 정보창 메서드
	public String itemInfo(){
		String info = name + " :";
		if(0 < hp) info += " 체력+" + hp;
		if(0 < mp) info += " 마나+" + mp;
		if(0 < att) info += " 공격력+" + att;
		if(0 < def) info += " 방어+" + def;
		return info;
	}
	
}
