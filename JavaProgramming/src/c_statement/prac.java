package c_statement;

import java.util.Arrays;

public class prac {

	public static void main(String[] args) {
//		for(int i = 1; i <= 10; i++ ){
//			System.out.println(i + "번째 반복");
//		}
//
//		int sum = 0; 
//		
//		sum += 1;
//		sum += 2;
//		sum += 3;
//		sum += 4;
//		sum += 5;
//		sum += 6;
//		sum += 7;
//		sum += 8;
//		sum += 9;
//		sum += 10;
//		
//		System.out.println(sum);
	
//		for(int i = 1; i <=9; i++) {
//			System.out.println(2 + " * " + i + " = " + i * 2);
//		}
	
//		for(int i = 1; i <=9; i++) {
//			System.out.println(7 + " * " + i + " = " + i * 7);
//		}
//		
		
//		for (int i = 1; i <= 10; i++){
//			System.out.print("i=" + i + "\t");
//			for(int j = 1; j <=10; j++){
//				System.out.print("j=" + j + "\t");
//			}
//			System.out.println();
//		}
		
//		for (int i = 2; i <=9 ; i++){
//			for (int j = 1; j <= 9; j++){
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//		}
//		for (int i = 1; i <=9 ; i++){
//			for (int j = 2; j <= 9; j++){
//				System.out.print(j + " * " + i + " = " + i * j + "\t" );
//			}
//			System.out.println();
//		}
//		
//		int a = 1;
//		int count = 0;
//
//		while (a < 1000){
//			a *= 2;
//			count++;
//			System.out.println(count + " : " + a);
//		}
		
//		int answer = (int)(Math.random() * 100) + 1;
//		int input = 0;
//
//		Scanner s = new Scanner(System.in);
//		
//		do{
//			System.out.println("1 ~ 100 사이의 수를 입력해주세요>");
//			input = Integer.parseInt(s.nextLine());
//			
//			if(answer < input){
//				System.out.println(input + " 보다 작습니다.");
//			}else if(input < answer){
//				System.out.println(input + " 보다 큽니다.");
//			}else{
//				System.out.println("정답입니다.");
//			}
//		}while(input != answer);
		
//		outer : for(int i =2; i<=9; i++){
//			for(int j = 1; j <=9; j++){
//				if(j ==5){
//					break;//가장 가까운 반복문 하나를 빠져나간다.
//				}
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//			System.out.println();
//		}
		
//		outer : for(int i =2; i<=9; i++){
//			for(int j = 1; j <=9; j++){
//				if(j ==5){
//					break outer; //outer라는 이름의 반복문을 빠져나간다.
//
//				}
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//			System.out.println();
//		}
		
//		outer : for(int i =2; i<=9; i++){
//			for(int j = 1; j <=9; j++){
//				if(j ==5){
//					continue; //가장 가까운 반복문의 현재 반복회차를 빠져나간다.
//				}
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//			System.out.println();
//		}
		
//		outer : for(int i =2; i<=9; i++){
//			for(int j = 1; j <=9; j++){
//				if(j ==5){
////					continue outer; //outer라는 이름의 현재 반복회차를 빠져나간다.
//				}
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//			System.out.println();
//		}
		
//		for(int i = 1; i <= 5; i++){
//			for(int j =1; j <= i; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = 1; i <= 5; i++){
//			for(int j = 5; j >= i; j--){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		for(int i = 1; i <= 5; i++){
//			for(int j = 5; j >= i; j--){
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= i; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		for(int i = 1; i <= 5; i++){
//			for(int j = 5; j >= i; j--){
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= i * 2 - 1; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		
//		package c_statement;
//
//		import java.util.Scanner;
//
//
//		public class Baseball {
//
//			public static void main(String[] args) {

//				Scanner s = new Scanner(System.in);
//
//				int a, a1, a2, a3;
//				int b, b1, b2, b3 = 0;
//
//				//중복되지않는 숫자 3개 추출
//				do {		
//					a1 = (int)(Math.random() * 9) + 1;
//					a2 = (int)(Math.random() * 9) + 1;
//					a3 = (int)(Math.random() * 9) + 1;
//
//					a = a1 * 100 + a2 * 10 + a3;
//			
//				}while(a1 == a2 || a2 == a3 || a1 == a3);
//
//				System.out.println(a);
//
//				//장 넘기기(숫자 안보이게)
//				for(int i = 1; i <= 100; i++ )	System.out.println();
//
//				// 시작
//				do{			
//					int S = 0; //Strike
//					int B = 0; //Ball
//					int O = 0; //Out
//
//					//숫자 3개 입력 받기
//					System.out.println("1~9 사이의 숫자 3개를 중복되지않게 입력해주세요>");
//					System.out.println("첫 번째 숫자>");
//					b1 = Integer.parseInt(s.nextLine());
//
//					System.out.println("두 번째 숫자>");
//					b2 = Integer.parseInt(s.nextLine());
//
//					System.out.println("세 번째 숫자>");
//					b3 = Integer.parseInt(s.nextLine());
//
//					b = b1 * 100 + b2 * 10 + b3;
//
//
//					//S,B,O 계산하기
//					
//					//정답일 경우 반복문 나가기
//					if (b == a){
//						System.out.println("3S입니다.");
//						break;
//					}
//					
//					//첫 번째 자리 숫자 결과 반영 조건
//					if(b1 == a1) S++;
//					else if( b1 == a2 || b1 ==a3) B++;
//					else O++;
//					
//					//두 번째 자리 숫자 결과 반영 조건
//					if(b2 == a2) S++;
//					else if( b2 == a1 || b2 == a3) B++;
//					else O++;
//					
//					//세 번째 자리 숫자 결과 반영 조건
//					if(b3 == a3) S++;
//					else if( b3 == a1 || b3 == a2) B++;
//					else O++;
//
//					//결과 출력
//					System.out.println("결과 : " + S + "S "+ B + "B " + O +"O");
//
//				}while(a != b); //정답과 일치하기 전까지 반복 
//			}
////		}
		
		
		
		
		
		
		
		
//		
//		
//		
//		int[] array = new int[5];
//		
//		
//		for(int i = 0; i < array.length; i++){
//			System.out.println(array[i]);
//		}
//		
//		for(int i = 0; i < array.length; i++){
//			array[i] = (i + 1) * 10;
//			System.out.println(array[i]);
//
//		}
//		

//		int[] randoms = new int[10];
//		System.out.println("배열 randoms의 길이 : " + randoms.length);
//		
//		
//		for (int i = 0; i <randoms.length; i++){
//			 randoms[i] = (int) (Math.random() * 100) + 1;
////			 System.out.println("randoms[" + i + "] : " + randoms[i]);
//			}
//			
//			System.out.println(Arrays.toString(randoms)); //배열의 모든 값들을 문자열로 출력해준다.
//			System.out.println(randoms); //배열의 주소
//		
//		
//			int sum = 0;
//			double avg = 0.0;
//			
//			for(int i = 0; i < randoms.length; i++)
//				sum += randoms[i];
//			
//			avg = (double) sum / randoms.length;
//			
//			System.out.println("합계 : " + sum + "/ 평균 : " + avg);
//		
//		
//		
//		
//			int min = randoms[0];
//			int max = randoms[0];
//			
//			for(int i = 0; i < randoms.length; i++){
//				if(randoms[i] < min){
//					min = randoms[i];
//				}
//				if(max < randoms[i]){
//					max = randoms[i];
//				}
//			}
//			System.out.println(Arrays.toString(randoms));
//			System.out.println("min : " + min + "/ max : " + max);

		
//			int[] shuffle = new int[10];
//			
//			for(int i=0; i < shuffle.length; i++) {
//				shuffle[i] = i + 1;
//			}
//			System.out.println(Arrays.toString(shuffle));
//			
//			for(int i =0; i < shuffle.length; i++ ){
//				int random = (int)(Math.random() * shuffle.length);
//				
//				int temp = shuffle[0];
//				shuffle[0] = shuffle[random];
//				shuffle[random] = temp;
//			}
//			System.out.println(Arrays.toString(shuffle));
		
		
			int[] counts = new int[10];
			
			for(int i = 0; i < 500; i++){
				int random = (int)(Math.random() * 10) + 1;
				counts[random - 1]++;
			}
			
			System.out.println(Arrays.toString(counts));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
