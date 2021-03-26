package b_operater;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교연산자
		 * - <, >, <=, >=, ==, !=
		 * - 문자열 비교 : equals()
		 */
		
		int x = 10;
		int y = 20;
		boolean b = x < y; //비교연산자의 연산 결과는 boolean 타입이다.
		System.out.println(b);
		
		b = x <= y - 15;
		System.out.println(b); //비교연산자와 산술 연산자가 같이 있는 경우 산술연산부터 하고 비교한다.
			
		String str1 = "abc";
		String str2 = "abcd";
		b = str1 == str2; //문자열의 내용이 아닌 주소를 비교한 것이다.
		System.out.println(b);
		
		b = str1.equals(str2);
		System.out.println(b);
		b = !str1.equals(str2);
		System.out.println(b);
		
		//다음의 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크다.
		b = x > y;		
		//2. x는 y보다 작거나 같다.
		b = x <= y;		
		//3. y는 홀수이다.
		b = y % 2 == 1;		
		//4. "기본형"과 "참조형"은 다르다.
		b = !"기본형".equals("참조형");
	}

}













