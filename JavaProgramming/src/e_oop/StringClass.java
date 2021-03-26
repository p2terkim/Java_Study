package e_oop;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
	/*
	 * String
	 * - 여러개의 문자를 사용하기 쉽게 만들어 놓은 클래스
	 * 
	 * String의 주요 메서드
	 * - equals() : 문자열의 내용이 같은지 반환한다.
	 * - length() : 문자열의 길이를 반환한다.
	 * - charAt() : 특정 인덱스에 위치한 문자를 반환한다.  *반환 타입이 String이 아니라 char이다.
	 * - substring() : 문자열의 특정 부분을 잘라서 반환한다.
	 * - indexOF() : 문자열 내의 특정 문자의 인덱스를 반환한다.
	 * - contains() : 문자열이 특정 문자열을 포함하고 있는지 여부를 반환한다.
	 * - split() : 문자열을 특정 문자를 기준으로 나누어 배열 형태로 반환한다.
	 * - trim() : 문자열 앞뒤의 공백을 제거해 반환한다. *문자열 중간의 공백은 제거해주지 않는다. 주로 실수 방지용으로 사용한다.
	 * - valueOf() : 다른 타입의 데이터를 문자열로 변환해 반환한다.
	 */
		////////////////////////////////////////equals
		boolean equals = "문자열".equals("문자열");
		System.out.println(equals); //결과 : true
		
		String str1 = "문자열";
		String str2 = null;
		System.out.println(str1.equals(str2)); //결과 : false
//		System.out.println(str2.equals(str1)); //결과 : java.lang.NullPointerException
		//null이 있을 수 있는 변수를 앞에두지 않는다.
		////////////////////////////////////length, charAt
		String str = "12345";
		int length = str.length();
		for (int i = 0; i < length; i++) {
			char charAt = str.charAt(i);
			System.out.print(charAt); //결과 : 12345
		}
		System.out.println();
		//문자열 뒤집기
		String rev = "";
		for (int i = str.length() - 1; 0 <= i; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev); //결과 : 54321
		
		
		//////////////////////////substring
		str = "0123456789";
		String sub1 = str.substring(3); //3번 인덱스부터 잘라서 반환한다.
		System.out.println(sub1); //결과 : 3456789
		String sub2 = str.substring(5,8);
		System.out.println(sub2); //결과 : 567
		
		//////////////////////////////////////indexOf
		str = "수박 오렌지 귤 블루베리";
		int index = str.indexOf("오렌지"); //"오렌지" 시작 인덱스 번호 반환한다.
		System.out.println(index); //결과 : 3
		
		/////////////////////////////////////substring과 indexOf를 조합해서 문자열 자르기
		String[] menu = {
				"수박 20000원",
				"오렌지 100000원",
				"귤 500원",
				"블루베리 3000원"
		};
		
		for (int i = 0; i < menu.length; i++) {
			String name = menu[i].substring(0, menu[i].indexOf(" "));
			System.out.print(name);
		} //결과 : 수박오렌지귤블루베리
		
		
		//가격만 잘라서 int 타입 변수에 저장해주세요.

		System.out.println();
		for (int i = 0; i < menu.length; i++) {
			int price = Integer.parseInt(menu[i].substring(menu[i].indexOf(" ") + 1, menu[i].indexOf("원")));
			System.out.print(price);
		} //결과 : 200001000005003000
		
		///////////////////////////////////////////contains
		System.out.println();
		str = "abcd";
		boolean contains = str.contains("c");
		System.out.println(contains);
		
		
		//오렌지가 메뉴의 몇 번 인덱스에 있는지 찾기
		for (int i = 0; i < menu.length; i++) {
			if (menu[i].contains("오렌지")) {
				System.out.println("오렌지는 " + i + "번 인덱스에 있습니다."); // 결과 : 오렌지는 1번 인덱스에 있습니다.
			}
		}
		
		
		
		///////////////////////////////////////////split
		str = "a/b/c";
		String[] split = str.split("/");
		System.out.println(Arrays.toString(split)); // 결과 : [a, b, c]
		
		
		for (int i = 0; i < menu.length; i++) {
			split = menu[i].split(" ");
			System.out.println("메뉴명 : " + split[0] + " / 가격: " + split[1]);
		}
		
		//////////////////////////////////////////trim
		str = "     문 자 열        ";
		String trim = str.trim();
		System.out.println("[" + str + "] -> {" + trim + "]");
		
		
		String id = " myId";
		String password = "myPassword ";
		System.out.println(id); //결과 : ' myId'
		System.out.println(password); //결과 : 'myPassword '
		System.out.println(id.trim()); //결과 : 'myId'
		System.out.println(password.trim()); //결과 : 'myPassword'
		//* ''는 출력되지 않는다.
		
		
		////////////////////////////////////valueOf
		
		int number = 10;
		str = String.valueOf(number);
		str = number + ""; //또 다른 방법, *다른  타입에 문자열 타입을 더하면 무조건 문자열로 바뀐다.
		
		
		
		
		
		
		
	}

}
