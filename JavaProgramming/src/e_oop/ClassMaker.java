package e_oop;

public class ClassMaker {

	//연습1.전역변수 하나를 선언 및 초기화 해주세요
	int a = 10;

	//연습2.리턴타입과 파라미터가 없는 메서드 하나를 만들어주세요.
	//연습3.메서드 안에서 전역변수를 출력해주세요
	void a(){
		System.out.println(a);
	}

	//연습4.전역변수와 동일한 타입의 리턴타입이 있고 파라미터는 없는 메서드 하나를 만들어주세요.
	//연습5.메서드 안에서 전역변수를 리턴해주세요.
	int b(){
		return a;
	}

	//연습6.리턴타입은 없고 파라미터가 있는 메서드 하나를 만들어주세요.
	//연습7.메서드 안에서 파라미터를 출력해주세요.
	void c(String str){
		System.out.println(str);
	}

	//연습8.int타입의 리턴타입과 int타입의 파라미터 두 개가 있는 메서드 하나를 만들어주세요.
	//연습9.메서드 안에서 두 파라미처를 곱한 결과를 리턴해주세요.
	int d(int a, int b){
		return a * b;
	}

}


//return의 역할
//-메서드 종료
//-리터타입값을 돌려주는 역할
//-리턴타입에 없는 void 메서드에서 return을 사용한다면 여기서는 메서드를 종료시키는 역할을 한다.
//void e(String str1){
//	System.out.println(str1);
//	if(str1.equals("종료")){
//		return;
//	}