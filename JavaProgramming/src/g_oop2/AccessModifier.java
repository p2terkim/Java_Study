package g_oop2;

public class AccessModifier {
	
	public String publicVar = "public : 접근제한이 없음";
	protected String protectedVar = "protected : 같은패키지 + 상속받은 클래스에서 접근 가능";
	String defaultVar = "dafault : 같은패키지에서만 접근 가능";
	private String privateVar = "private : 클래스 내에서만 접근 가능";
	
	public void publicMethod(){
		System.out.println(publicVar);
	}
			
	protected void protectedMethod(){
		System.out.println(protectedVar);
	}
	
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	
	private void privateMethod(){
		System.out.println(privateVar);
	}
	
	public static void main(String[] args){
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
			
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();
		
		
		Time t = new Time();
		
		//set에 입력하고
		t.setHour(23);
		t.setMinute(57);
		t.setSecond(58);
		
		//get으로 출력하고
		System.out.println("입력시간 : " + t.getTime()); //결과 : 9:330:-20, 말도 안되는 데이터 입력 - > 접근제어자가 필요한 이유
		//변수에 직접 접근을 한다면 아무 데이터가 막 들어간다.
		//변수에 private을 붙여주고 (아무나 접근 못하게)
		//변수에 접근 가능한 메서드를 만들어준다.
		
		
		System.out.print("초시계 : ");
		t.clock();
		
	}
	
}
















