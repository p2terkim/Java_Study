package e_oop;

public class OOP {

	public static void main(String[] args) {

		/*
		 * 객체지향 프로그램 (Objected Oriented Programming)
		 * - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는것.
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 */
		
		SampleClass sc = new SampleClass();
		
		//변수 사용
		System.out.println(sc.field);
		
		//메서드 호출
		String returnValue = sc.method(5);
		System.out.println(returnValue);
		
		sc.method2();
		
		
		sc.flowTest1();
		
		//다음을 한 줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값  * 123456 
		//3. 2번의 결과값  / 123456 
		//4. 3번의 결과값  - 654321
		//5. 4번의 결과값  % 123456 
		
		Calculator cal = new Calculator();
		
		double result = cal.add(123456,  654321);
		result = cal.multiply(result, 123456);
		result = cal.divide(result, 123456);
		result = cal.subtract(result, 654321);
		result = cal.mod(result, 123456);
		System.out.println(result);

		
		
	}

}
