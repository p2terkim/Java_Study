package b_operater;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//두 개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("첫 번째 숫자>");
//		int num1 = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("두 번째 숫자>");
//		int num2 = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("연산자를 입력해주세요>");
//		String operator = sc.nextLine();
//		
//		double cal = operator.equals("+") ? num1 + num2 : 
//			(operator.equals("-") ? num1 - num2 : 
//				(operator.equals("*") ? num1 * num2 : 
//					(operator.equals("/") ? num1 / num2 : 
//						(operator.equals("%") ? num1 % num2 : 0))));
//
//		System.out.println(num1 + " " + operator + " " + num2 + " = " + cal);
//		
		
		
		
		
		
		System.out.print("첫 번째 숫자>");
		int x = Integer.parseInt(sc.nextLine());
		
		System.out.print("연산자>");
		String op = sc.nextLine();
		System.out.print("두 번째 숫자>");
		int y = Integer.parseInt(sc.nextLine());

		int result = op.equals("+") ? x + y 
				:op.equals("-") ? x - y 
				:op.equals("*") ? x * y 
				:op.equals("/") ? x / y 
				:x % y;

		System.out.println(x + " " + op + " " + y + " = " + result);

		
		
		
		

	}

}
