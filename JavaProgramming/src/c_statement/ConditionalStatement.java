package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * - if문
		 * - switch문
		 * 
		 * if문
		 * - if(조건식){} : 조건식의 결과가 true이면 블럭 안의 문장을 수행한다.
		 * - else if(조건식){} : 다수의 조건이 필요할 때 if 뒤에 추가한다.
		 * - else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		*/
		
		
//		if문
		
		int a = 1;
		
//		조건식이 참인 경우
		if(a == 1){
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
//		조건식이 거짓인 경우
		if(a == 0){
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}
		
//		else if, else
//		int a = 1;

		if(a == 1){
			System.out.println("a가 1인 경우에 하고싶은 것");
		}else if(a == 2){
			System.out.println("a가 2인 경우에 하고싶은 것");
		}else if(a == 3){
			System.out.println("a가 3인 경우에 하고싶은 것");
		}else{
			System.out.println("이외의 경우에 하고싶은 것");
		}
		
		//조건을 한묶음으로 사용하기 위해서는 반드시 else if를  사용해야한다.
		
		
		//연습1. 시험점수가 60점 이상이며 합격 그렇지 않으면 불합격
		
		int score = 60;
		
		if(60 <= score){
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}
		
		//연습2. 성적에 등급을 부여하는 프로그램
		
		score = 80;
		
		String grade = null;
		
		if(90 <= score){
			grade = "A";
		}else if(80 <= score){
			grade = "B";
		}else if(70 <= score){
			grade = "C";
		}else if(60 <= score){
			grade = "D";
		}else{
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은" + grade + "입니다.");
	
		//연습3. 성적 등급에 +,- 추가(중첩문 활용)
		score = 80;
		grade = null;
		
		if(90 <= score){
			grade = "A";
			if(97 <= score){
				grade += "+";
			}else if(score <= 93){
				grade += "-";
			}
		}else if(80 <= score){
			grade = "B";
			if(87 <= score){
				grade += "+";
			}else if(score <= 83){
				grade += "-";
			}
		}else if(70 <= score){
			grade = "C";
			if(77 <= score){
				grade += "+";
			}else if(score <= 73){
				grade += "-";
			}
		}else if(60 <= score){
			grade = "D";
			if(67 <= score){
				grade += "+";
			}else if(score <= 63){
				grade += "-";
			}
		}else {
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은" + grade + "입니다.");

		
		
		/*
		 * switch 문
		 * - switch(int/String){case 1;break;}
		 * - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		*/
		
		//조건식에 int 
		a = 1;
		switch(a){
		case 1:
			System.out.println("a가 1인 경우에 하고싶은 것");
			break;
		case 2:
			System.out.println("a가 2인 경우에 하고싶은 것");
			break;
		default:
			System.out.println("이외의 경우에 하고싶은 것");
		}
		
		//조건식에 String
		String b = "a";
		switch(b){
		case "a":
			System.out.println("b가 \"a\"인 경우에 하고싶은 것");
			break;
		case "b":
			System.out.println("b가 \"b\"인 경우에 하고싶은 것");
			break;
		default:
			System.out.println("이외의 경우에 하고싶은 것");
		}
		
		//switch 값이 정확히 일치하는 경우에만 사용하기 때문에 자주 쓰이지 않는다. 같은 경우에는 switch문이 if문 보다 속도가 조금 더 빠르다.
		
		//연습4. 주어진 월에 해당하는 계절을 출력해봅시다.
		int month = 1;
		String season = null;
		
		switch(month){
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
		}
		System.out.println(month + "월은 " + season + "입니다.");
		
		
		//연습 5. 성적에 등급을 부여하는 프로그램
		score = 90;
		grade = null;
		
		switch(score / 10){
		case 10: case 9: grade = "A"; break;
		case 8:	grade = "B"; break;
		case 7:	grade = "C"; break;	
		case 6:	grade = "D"; break;
		default: grade = "F";	
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");

		//연습 6. 숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
//		Scanner sc = new Scanner(System.in);
//		int x;
//		
//		System.out.println("숫자>");
//		x = Integer.parseInt(sc.nextLine());
//		
//		if (x == 0){
//			System.out.println("입력한 숫자가 0입니다.");
//		}else {
//			System.out.println("입력한 숫자가 0이 아닙니다.");
//		}
		
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());

		if (x == 0){
			System.out.println("입력한 숫자가 0입니다.");
		}else {
			System.out.println("입력한 숫자가 0이 아닙니다.");
		}
		
		switch (x) {
		case 0:
			System.out.println("입력한 숫자가 0입니다.");
			break;
		default:
			System.out.println("입력한 숫자가 0이 아닙니다.");
		}
		
		//연습7. 숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요
		
		int num = Integer.parseInt(sc.nextLine());
		
		if (num%2 == 0){
			System.out.println("입력한 숫자는 짝수입니다.");
		}else {
			System.out.println("입력한 숫자는 홀수입니다.");
		}
		
		
		switch(num%2) {
		case 0:
			System.out.println("입력한 숫자는 짝수입니다.");
			break;
		default:
			System.out.println("입력한 숫자는 홀수입니다.");
		}
		
		
		//연습8. 국어, 영어, 수학 점수를 입력받아 총점, 평균, 등급을 출력해주세요.
		
		System.out.println("국어>");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.println("영어>");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.println("수학>");
		int math = Integer.parseInt(sc.nextLine());
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
//		String grade;
		
		if (90 <= avg){
			grade = "A";
					if(97 <= avg){
						grade += "+";
					}else if(avg <= 93){
						grade += "-";
					}
		}else if(80 <= avg){
			grade = "B";
			if(87 <= avg){
				grade += "+";
			}else if(avg <= 83){
				grade += "-";
			}
		}else if(70 <= avg){
			grade = "C";
			if(77 <= avg){
				grade += "+";
			}else if(avg <= 73){
				grade += "-";
			}
		}else if(60 <= avg){
			grade = "D";
			if(67 <= avg){
				grade += "+";
			}else if(avg <= 63){
				grade += "-";
			}
		}else {
			grade = "F";
		}
		
		System.out.println("총점 : " + sum + " " + "평균 : " + avg + " " + "등급 : " + grade);
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//연습9. 1 ~ 100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.
		
		int a1 = (int) (Math.random() * 100) + 1;
		int a2 = (int) (Math.random() * 100) + 1;
		int a3 = (int) (Math.random() * 100) + 1;
		int b1;
		int b2;
		int b3;
		
		if(a1 >= a2 && a1 >= a3 && a2 >= a3){
			b3 = a1;
			b2 = a2;
			b1 = a3;			
		}else if(a1 > a2 && a1 > a3 && a3 > a2){
			b3 = a1;
			b2 = a3;
			b1 = a2;
		}else if(a2 > a1 && a2 > a3 && a1 > a3){
			b3 = a2;
			b2 = a1;
			b1 = a3;
		}else if(a2 > a1 && a2 > a3 && a3 > a1){
			b3 = a2;
			b2 = a3;
			b1 = a1;
		}else if(a3 > a1 && a3 > a2 && a1 > a2){
			b3 = a3;
			b2 = a1;
			b1 = a2;
		}else {
			b3 = a3;
			b2 = a2;
			b1 = a1;
		}
		
		System.out.println("랜덤숫자1 : " + a1);
		System.out.println("랜덤숫자2 : " + a2);
		System.out.println("랜덤숫자3 : " + a3);
		System.out.println("오름차순 : "+ b1 +", "+ b2 + ", "+ b3);
		
		
		int c1 = (int) (Math.random() * 100) + 1;
		int c2 = (int) (Math.random() * 100) + 1;
		int c3 = (int) (Math.random() * 100) + 1;
		
		if(c1 < c2 && c2 < c3){
			System.out.println(c1 + " < " + c2 + " < " + c3);
		}else if(c2 < c3 && c3 < c1){
			System.out.println(c2 + " < " + c3 + " < " + c1);
		}else if(c3 < c1 && c1 < c2){
			System.out.println(c3 + " < " + c1 + " < " + c2);
		}else if(c2 < c1 && c1 < c3){
			System.out.println(c2 + " < " + c1 + " < " + c3);
		}else if(c3 < c2 && c2 < c1){
			System.out.println(c3 + " < " + c2 + " < " + c1);
		}else{
			System.out.println(c1 + " < " + c3 + " < " + c2);
		}
		
		
		
		
		
		x = (int)(Math.random() * 100) + 1;
		int y = (int)(Math.random() * 100) + 1;
		int z = (int)(Math.random() * 100) + 1;
		
		System.out.println(x + " " + y + " " + z);
		if(x > y){
			int temp = x;
			x = y;
			y = temp;
		}
		if(x > z){
			int temp = x;
			x = z;
			z = temp;
		}
		if(y > z){
			int temp = y;
			y = z;
			z = temp;
		}
		System.out.println(x + " < " + y + " < " +  z );
		
	}
}
		