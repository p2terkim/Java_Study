package a_variable;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		/*
		 * 	[과제] 다음과 같은 프로그램을 작성해주세요.
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

		Scanner sc = new Scanner(System.in);

		System.out.println("===================== 회원가입 ====================");	
		System.out.print("아이디를>");
		ID = sc.nextLine();

		System.out.print("비밀번호(4자리 숫자)>");
		password = Integer.parseInt(sc.nextLine());

		System.out.print("이름>");
		name = sc.nextLine();

		System.out.print("나이>");
		age = Integer.parseInt(sc.nextLine());

		System.out.print("키>");
		height = Double.parseDouble(sc.nextLine());

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
