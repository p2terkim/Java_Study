package Game;

public class WeaponStore extends Map{
	 int commonWeapon = 100;
	 int commonShield = 100;
	 
	 public int show(int money, int number)
	 {
	  name = "무기 상점";
	  System.out.println(name + "에서 물건을 구매 시도하는 중입니다.");
	  if(number == 1)
	  {
	   // 힘 포션 가격보다 돈이 더 많을 때
	   if(commonWeapon <= money)
	    return money - commonWeapon;
	  }
	  if(number == 2)
	  {
	   // 방어력 포션 가격보다 돈이 더 많을 때
	   if(commonShield <= money)
	    return money - commonShield;
	  }
	  // 돈이 부족할 때
	  return -1;
	 }
	}