package g_oop2.test;

import g_oop2.AccessModifier;//import 해줘야한다.

public class AccessTest extends AccessModifier {
	
	public static void main(String[] args) {
		
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		//상속을 받은 상태에서 다른 패키지에서도 사용 가능
//		System.out.println(am.protectedVar);
//		am.protectedMethod(); //상속받았으니까 내꺼처럼 사용해야한다.
		
		//접근 불가(같은 패키지 안에서만 접근 가능)
//		System.out.println(am.defaultVar);
//		am.defaultMethod();
		
		//접근 불가(클래스 내에서만 접근 가능)
//		System.out.println(am.privateVar);
//		am.privateMethod();
		
		//상속 받은거니까 내꺼 처럼 사용한다.
		AccessTest at = new AccessTest();
		
		System.out.println(at.protectedVar);
		at.protectedMethod();
	}

}
		


