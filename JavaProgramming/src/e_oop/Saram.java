package e_oop;


class Saram{
	
	String name; //이름
	int account; //통장의 잔고
	
	void saveMoney(int money){
		account += money;
		System.out.println(name + "의 통장 잔고 : " + account + "원");
	}

	static int dateAccount; //데이트 통장의 잔고, static이 붙어있기 때문에 객체간에 값을 공유한다.
	
	static void saveDateMoney(int money){//메서드에 static을 붙이는 이유 1. 객체 생성없이 사용하기 위해서(너무 자주 사용되기 때문이다. 메모리의 낭비를 줄이기 위해서) 2. static 변수를 사용하기 위해서 메서드에 static을 붙인다.
		dateAccount += money;
		System.out.println("데이트 통장 잔고 : " + dateAccount + "원");
	}
}
