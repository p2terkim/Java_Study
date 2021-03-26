package c_statement;

import java.util.Scanner;


public class Baseball {

	public static void main(String[] args) {
		/*	
		 * 123
		 * 135 : 1B(같은자리 같은 수) 1B(다른자리 같은수) 1O(다른자리 다른수)
		 * 
		 * 
		 * 145 : 0S 1B 2O
		 * 431 : 1S 0B 2O
		 * 479 : 1S 0B 2O
		 * 468 : 2S 0B 1O
		 * 463 : 1S 0B 20
		 * 428 : 3S
		 * 
		 * 
		 */

		/*		Scanner s = new Scanner(System.in);
		int a, a1, a2, a3;
		int b, b1, b2, b3 = 0;

		//중복되지않는 숫자 3개 추출
		do {		
			a1 = (int)(Math.random() * 9) + 1;
			a2 = (int)(Math.random() * 9) + 1;
			a3 = (int)(Math.random() * 9) + 1;

			a = a1 * 100 + a2 * 10 + a3;

		}while(a1 == a2 || a2 == a3 || a1 == a3);

		System.out.println(a);

		//장 넘기기(숫자 안보이게)
		for(int i = 1; i <= 100; i++ )	System.out.println();

		// 시작
		do{			
			int S = 0;
			int B = 0;
			int O = 0;

			//숫자 3개 입력 받기
			System.out.println("1~9 사이의 숫자 3개를 중복되지않게 입력해주세요>");
			System.out.println("첫 번째 숫자>");
			b1 = Integer.parseInt(s.nextLine());

			System.out.println("두 번째 숫자>");
			b2 = Integer.parseInt(s.nextLine());

			System.out.println("세 번째 숫자>");
			b3 = Integer.parseInt(s.nextLine());

			b = b1 * 100 + b2 * 10 + b3;

			//S,B,O 계산하기

			//정답일 경우 반복문 나가기
			if (b == a){
				System.out.println("3S입니다.");
				break;
			}

			//첫 번째 자리 숫자 결과 반영 조건
			if(b1 == a1) S++;
			else if( b1 == a2 || b1 ==a3) B++;
			else O++;

			//두 번째 자리 숫자 결과 반영 조건
			if(b2 == a2) S++;
			else if( b2 == a1 || b2 == a3) B++;
			else O++;

			//세 번째 자리 숫자 결과 반영 조건
			if(b3 == a3) S++;
			else if( b3 == a1 || b3 == a2) B++;
			else O++;

			//결과 출력
			System.out.println("결과 : " + S + "S "+ B + "B " + O +"O");

		}while(a != b); //정답과 일치하기 전까지 반복 
		 */		






		//쌤

		/*int a1 = 0;
		int a2 = 0;
		int a3 = 0;

		do{// 조건의 결정이 뭔가를 한 후에 결정된다면 do-while문을 사용하는게 좋다.
			a1 = (int)(Math.random() * 9) + 1;
			a2 = (int)(Math.random() * 9) + 1;
			a3 = (int)(Math.random() * 9) + 1;
		}while(a1 == a2 || a1 == a3 || a2 == a3);

		Scanner s = new Scanner(System.in);
		int count = 0;
		while(true){
			//3자리 한 번에 입력 받고 쪼개기
			System.out.print("3자리 숫자>");
			int input = Integer.parseInt(s.nextLine());
			int i3 = input % 10;
			input /= 10;
			int i2 = input % 10;
			input /= 10;
			int i1 = input % 10;

			int strike = 0;
			int ball = 0;
			int out = 0;

			if(a1 == i1) strike++;
			if(a2 == i2) strike++;
			if(a3 == i3) strike++;

			if(a1 == i2 || a1 == i3) ball++;
			if(a2 == i1 || a2 == i3) ball++;
			if(a3 == i1 || a3 == i2) ball++;

			out = 3 - strike - ball;

			System.out.println(++count + "차 시도(" + i1 + i2 + i3 + ") : "
					+ strike + "S " + ball + "B " + out + "O");
			System.out.println("----------------------------");
			if(strike == 3){
				System.out.println("정답입니다!");
				break;
			}
		}*/

		/*int a1 = 0, a2 = 0, a3 = 0 ;
		
		do {
			a1 = (int)(Math.random() * 9) + 1;
			a2 = (int)(Math.random() * 9) + 1;
			a3 = (int)(Math.random() * 9) + 1;
		} while (a1 == a2 || a2 == a3 || a1 == a3);
		
		Scanner s = new Scanner(System.in);
		int count = 0;//안씀
		while(true){
			System.out.println("3자리 숫자를 입력해주세요>");
			int input = Integer.parseInt(s.nextLine());
			int i3 = input % 10;
			input /= 10;
			int i2 = input % 10;
			input /= 10;
			int i1 = input % 10;
			
			
			int strike = 0;
			int ball = 0;
			int out = 0;
			
			if(a1 == i1) strike++;
			if(a2 == i2) strike++;
			if(a3 == i3) strike++;
			
			if(a1 == i2 || a1 == i3) ball++;
			if(a2 == i1 || a2 == i3) ball++;
			if(a3 == i1 || a3 == i2) ball++;
			
			out = 3 - strike - ball;
			
			System.out.println(++count + "차 시도(" + i1 + i2 + i3 + ") : "
					+ strike + "S " + ball + "B " + out + "O");
			System.out.println("----------------------------");
			
			if(strike == 3){
				System.out.println("정답입니다!");
				break;
			}
		}*/

		
		
		
		
		
	}
}
