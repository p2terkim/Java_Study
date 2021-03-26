package a_variable; //클래스 위치(이 클래스가  a_variable 패키지에 속해있다)

import java.util.Scanner;

public class Variable { //클래스 : 변수와 메서드로 구성된다.

	public static void main(String[] args) {//'main'이라는 이름을 가진 메서드
		// main 메서드 : 프로그램의 시작과 끝

		// 주석 : 프로그램 코드로 인식하지 않는 문장 (주로 코드를 설명하는데 사용한다.)

		//		한줄 주석 : Ctrl + Shift + C 또는 Ctrl + /
		
		/*범위 주석 : Ctrl + Shift + /(해제: \)*/

		/*
		 * 데이터
		 * -기본형
		 * -배열
		 * -클래스
		 * 
		 * 조작
		 * -산술연산
		 * -비교연산
		 * -논리연산
		 * -조건문
		 * -반복문
		 */

		/*
		 * 기본형 타입(byte크기)
		 * - 정수 : byte(1), short(2), *int(4), long(8)
		 * - 실수 : float(4), *double(8)
		 * - 문자 : char(2)
		 * - 논리 : boolean(1)
		 * 
		 */

		int x; //정수 저장 가능한 변수 'x' 생성(변수는 하나의 그릇이라고 볼 수 있다.)
		//변수를 만드는 것을 변수 선언이라고 표현한다.


		//		double x; //블럭{} 안에서 이름이 중복될 수 없다. 컴파일 에러 발생
		double y;
		//=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장
		x = 10; //초기화 : 변수에 처음으로 값을 저장하는 것
		y = 3.14; //변수의 타입에 맞는 값을 저장해야한다.

		int abc = 30; //일반적으로 선언과 초기화를 한 번에 한다.
		long l = 40L; //접미사 L을 붙어야 long타입이 된다.
		float f = 5.5f; //접미사 f를 붙여야 float타입이 된다.

		////////////////////////////////////////////////////////////

		char c = '한'; //따옴표 안에 반드시 한 글자를 넣어야한다. 없어도 안됨
		boolean b = true; //true, false 두 가지만 가능

		//8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
		byte B = 127;
		short S = 254;
		int I = 123;
		long L = 13241235L;
		float F = 12.34f;
		double D = 1234.1234132412;
		char C = '가';
		boolean Bo = false;

		x = 20; //기존에 저장되어있는 10이라는 값은 사라지고 20이라는 값이 저장된다.
		//		int x = 30; //변수를 만들때만 타입을 붙인다. 변수를 사용하기 위해서는 이름만 있으면 된다.
		y = 5.5;

		//위에서 만든 8개의 변수에 새로운 값을 저장해주세요.
		B = 126;
		S = 200;
		I = 100;
		L = 1243214L;
		F = 123.456f;
		D = 123124.1234;
		C = '나';
		Bo = true;

		//콘솔창에 출력
		System.out.println(100);
		System.out.println(x);
		//실행 단축키 : Ctrl +F11

		//위에서 만든 8개의 변수의 값을 출력해주세요.
		System.out.println(B);
		System.out.println(S);
		System.out.println(I);
		System.out.println(L);
		System.out.println(F);
		System.out.println(D);
		System.out.println(C);
		System.out.println(Bo);

		//문자열 문자열은 있을수도 있고 없을수도 있다.
		String str = "문자 여러개..."; //클래스는 참조형타입 데이터이다. 참조형 타입이란 문자 여러개를 묶어놓은것의 주소를 변수에 저장한 것. 
		System.out.println(str);
		//문자열과 다른 타입의 데이터가 결합되면 문자열의 결과를 얻는다.
		System.out.println(str + 50);
		System.out.println(10 + 20 + str);
		System.out.println(str + 10 + 20);
		System.out.println(10 + str + 20);

		//형변환
		//다른 타입의 값을 저장하기 위해서는 값의 타입을 변경해 주어야 하는데 이를 형변환(type casting)이라고 한다.
		int small = 10;
		long big = 10L;

		small = (int)big;
		big = small;//표현범위가 작은 쪽에서 큰 쪽으로의 형변환은 생략이 가능하다.

		///////////////////////////////////////////////////////////

		/*
		 * 명명규칙
		 * - 영문자 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다.                                                                                                                                     		 * - 영문자 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어는 사용할 수 없다.(진한 글씨들은 예약어)
		 * - [낙타식 표기법을 사용한다.(mySampleVariable)]
		 * - [클래스명의 첫글자는 대문자로 한다.(MySampleClass)]		
		 */

		/*
		 * 상수 
		 * - 값을 변경 할 수 없는 그릇
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 */
		final int MAX_NUMBER = 10; //final이 붙으면 값 변경 불가. 상수는 대문자만 사용해서 이름을 지어준다. 
		//		MAX_NUMBER = 20; //컴파일 에러 발생

		System.out.print("줄바꿈을 하지 않는다.");
		System.out.print("줄바꿈을 하지 않는다.\n"); // '\' : 탈출문자, 뒤에 오는 문자에 새로운 기능 부여
		System.out.println("줄바꿈을\t 한다.");
		System.out.printf("문자열 : %s, 숫자 : %d\n", str, x); //출력 포맷을 지정한다.

		//입력
		Scanner sc = new Scanner(System.in); //입력받기 위한 클래스
		//다른 패키지의 클래스를 사용하기 위해서는 import해서 클래스의 위치를 알려줘야한다. package와 class사이에 import 작성.(단축키 Ctrl + Shift + O)
		//	java.lang에 있는 패키지는 import 하지 않아도 사용가능

		//		System.out.print("아무거나 입력해주세요>");
		//		String str2 = sc.nextLine();
		//		System.out.println(str2);
		//		
		//		//문자열이 아닌 숫자열을 입력받고 싶을 때
		//		int nextInt = sc.nextInt();
		//		double nextDouble = sc.nextDouble();
		//이런 것들이 잇지만 버그로 인해 사용하지 않는 것이 좋다.

		//		System.out.println("int 입력>");
		//		int nextInt = sc.nextInt();
		//		System.out.println(nextInt);
		//		System.out.println("문자열 입력>");
		//		String nextLine = sc.nextLine();
		//		System.out.println(nextLine);
		//		System.out.println("입력 끝!");

		System.out.println("int 입력>");
		int number = Integer.parseInt(sc.nextLine());
		//		double number = Double.parseDouble(sc.nextLine());
		System.out.println(number);

		//자신의 이름을 저장할 변수를 선언해주세요.
		String myName;

		//위에서 선언한 변수를 초기화하기 위해 이름을 입력받아주세요
		System.out.println("이름을 입력해주세요>");
		myName = sc.nextLine();
		//		System.out.println(myName);
		System.out.printf("당신의 이름은 %s 입니다.\n\n", myName);

		//////////////////////////////////////////////////////////

		//자신의 나이를 저장할 변수를 선언해주세요.
		int myAge;

		//위에서 선언한 변수를 초기화하기 위해 나이를 입력받아주세요
		System.out.println("나이를 입력해주세요>");
		myAge = Integer.parseInt(sc.nextLine());
		//		myAge = sc.nextInt();
		//		System.out.println(myAge);
		System.out.printf("당신의 나이 %d세 입니다.\n", myAge);


		System.out.println("이름 :" + myName + " / 나이 :" + myAge);

		/*	다음과 같은 프로그램을 작성해주세요.
		 * 
		 * ===================== 회원가입 ====================
		 * 아이디 > admin
		 * 비밀번호(4자리 숫자) > 1234
		 * 이름>홍길동
		 * 나이>30
		 * 키>185.5
		 * ================================================
		 * 회원가입 완료!!
		 * ====================== 내 정보 ====================
		 * 아이디 : admin
		 * 비밀번호 : 1234
		 * 이름 : 홍길동
		 * 나이 : 30세
		 * 키 : 185.5
		 * =================================================
		 */		



		String ID;
		int password;
		String name;
		int age;
		double height;

		System.out.println("아이디를  입력해주세요>");
		ID = sc.nextLine();

		System.out.println("비밀번호(4자리 숫자)를 입력해주세요>");
		password = Integer.parseInt(sc.nextLine());

		System.out.println("이름을  입력해주세요>");
		name = sc.nextLine();

		System.out.println("나이를 입력해주세요>");
		age = Integer.parseInt(sc.nextLine());

		System.out.println("키를 입력해주세요>");
		height = Double.parseDouble(sc.nextLine());

		System.out.println("===================== 회원가입 ====================");
		System.out.println("아이디 > " + ID);
		System.out.println("비밀번호(4자리 숫자) > " + password);
		System.out.println("이름 > " + name);
		System.out.println("나이 > " + age);
		System.out.println("키 > " + height);
		System.out.println("================================================");
		System.out.println("회원가입 완료!!");
		System.out.println("===================== 내 정보 =====================");
		System.out.println("아이디 : " + ID);
		System.out.println("비밀번호 : " + password);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height +"cm");	
		System.out.println("================================================");


	}

}
