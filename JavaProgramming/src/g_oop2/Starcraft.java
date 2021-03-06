package g_oop2;

public class Starcraft {

	public static void main(String[] args) {
		Marine marine = new Marine();
		Tank tank = new Tank();
		Dropship droship = new Dropship();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(droship);
		
//		scv.repair(marine);//마린은 컴파일 오류 발생
	}

}

class Unit{
	int hp;
	final int MAX_HP;
	
	Unit(int hp) {
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marine extends Unit{
	Marine(){
		super(40);
	}
}

class Tank extends Unit implements Repairable{
	Tank() {
		super(150);
	}
}

class Dropship extends Unit implements Repairable{
	Dropship() {
		super(125);
	}
}

class SCV extends Unit{
	SCV() {
		super(60);
	}
	
	void repair(Repairable r){
		if(r instanceof Unit) { //Unit으로 형변환 가능한지 확인
			Unit u = (Unit) r;
			
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
		}
		
	}
	
}

interface Repairable{
	
}






















