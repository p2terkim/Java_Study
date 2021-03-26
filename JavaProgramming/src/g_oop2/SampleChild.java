package g_oop2;

public class SampleChild extends SampleParent{
	
	void childMethod(){
		System.out.println(var); //상속받은 변수
		System.out.println(method(7,13)); //상속받은 메서드
	}
	
	//오버라이딩
	//super, super()
	//다형성	
	
	//오버라이딩 - 상속받은 메서드의 내용을 재정의(변경) 하는 것
	@Override //어노테이션 : 클래스, 변수, 메서드 등에 표시해 놓는 것.
	int method(int a, int b){ //리턴타입 메서드명 차라미터 모두 같아야한다.(= 선언부가 같아야한다.)
		return a * b;
	}
	
	//super, super()
	int var;
	
	void test(double var){ //세 개의 똑같은 변수가 있다.(부모 테이블의 var, 자식 테이블의 var, 파라미터 var)
		System.out.println(var); //지역변수
		System.out.println(this.var); //인스턴스 변수
		System.out.println(super.var); //부모 클래스의 인스턴스 변수
		//super : 부모클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10, 20)); //오버라이딩한 메서드
		System.out.println(super.method(10, 20)); //부모 클래스의 메서드
	}
	
	SampleChild(){
		super();//부모클래스의 생성자 호출, 반드시 필요하다. 생략시 컴파일러가 자동 생성해준다.(*하지만 부모클래스의 생성자에 파라미터가 있는 경우 컴파일러가 자동으로 생성해주지 못한다.)
	}
	
	//다형성
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		SampleParent sp = new SampleChild(); //다형성 : 자식 객체를 부모변수에 넣어서 사용하는 것
		//sp = new SampleChild2();
		//sp = new SampleChild3(); 
		
		sc = (SampleChild)sp;
		sp = (SampleParent)sc;
		//자식타입 -> 부모타입으로 형변환은 생략할 수 있다.
		
		
//		SampleChild sc2 = (SampleChild)new SampleParent();//자손이 SampleChild타입으로 형변환 생략불가
		
		SampleParent sp2 = (SampleParent)new SampleChild();
		System.out.println(sp2.var);
		System.out.println(sp2.method(10, 20));
	}
	
	
	
}


































