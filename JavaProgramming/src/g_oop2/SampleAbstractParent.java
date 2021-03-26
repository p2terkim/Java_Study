package g_oop2;

//추상클래스 - abstract 추가
public abstract class SampleAbstractParent {
	
	//지금 까지 배운 메서드의 모양
	void method(){
		
	}
	
	//추상메서드 : 선언부만 있고 구현부는 없는 메서드, abstract 추가
	//상속에서 사용 - 추상클래스가 부모 클래스
	//같은 이름의 메서드는 존재하지만 각각 다른 내용의 메서드를 생성해야할 때 추상 메서드를 사용한다.
	abstract void abstractMethod();
}

class sampleAbstractChild extends SampleAbstractParent{

	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
	}
	
}