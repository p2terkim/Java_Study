package Game;

public class Hero extends Character{

	 // 캐릭터 중에서 영웅은 공통적으로 힘, 방어력, 돈, 경험치라는 변수를 가지고 있다.
	 public int power;
	 public int defense;
	 public int money = 5000;
	 public int experience = 0;
	 
	 // 공격을 하는 함수
	 public int attack()
	 {
	  return power;
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