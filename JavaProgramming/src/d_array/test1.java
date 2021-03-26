package d_array;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		/*문제1 

		키보드를 통하여 입력한 값을 변수 num에 대입하고 num의 값에 따라
		 양수, 음수, 0을 출력하는 코드를 작성하세요,
		(if_ else )*/
		
/*Scanner s = new Scanner(System.in);

System.out.println("값을 입력해주세요>");
int num = (int)Integer.parseInt(s.nextLine());

if (num == 0) {
	System.out.println("입력한 값은 0 입니다");
}else if (num < 0) {
	System.out.println("입력한 값은 음수입니다");
}else {
	System.out.println("입력한 값은 양수입니다");
}*/
		
		
		/*문제2 

		문자형 변수 ch가 영문(대문자 또는 소문자)일때만 
		변수 b의 값이  true가 되도록 하는 코드를 작성하세요
		(삼항연산자이용 )*/

//		char ch='z';
//		
//		boolean b;
//		
		
//char ch = 'A';
//boolean b = ( ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z'));
//System.out.println(b);
//		
		/*문제3

		문자형변수 ch의 값을 소문자로 변경하는 코드를 작성하세요
		char ch='A'*/
		
		
char ch = 'A';
char lower = ( ('A' <= ch && ch <= 'Z') ) ? ( (char)(ch+32) ) : ch;
System.out.println("대문자 : " + ch + " 를 소문자 : " + lower + " 로 변경합니다.");




  

		
		
		/*문제 4
		1~100 까지의 합을 구하는 코드를 작성하세요 */
//int sum = 0;		
//
//for (int i = 0; i <=10; i++) {
//	sum += i;  
//}
//		
//		
//		System.out.println(sum);
//		
		


/*문제5 
정수를 입력받아 그 정수에 해당하는 구구단을 작성하세요 */
		
//Scanner s = new Scanner(System.in);
//System.out.println("값을 입력해주세요>");
//int num = (int)Integer.parseInt(s.nextLine());
//
//for(int i = 1; i <= 9; i++) {
//	System.out.println(num + " * " + i + " = " + i * num);
//	}
//		
		

/*문제 6
Math.random() 을 이용하여 1~10 사이의 임의의 정수를 5개  발생하여
합을 구하는 프로그램 작성하세요 . */
	
//int[] arr = new int[5];
//int sum = 0;
//for (int i = 0; i < arr.length; i++) {
//	arr[i] = (int)(Math.random() * 100) + 1;
//}
//
//for (int i = 0; i < arr.length; i++) {
//		sum += arr[i];
//}
//System.out.println(Arrays.toString(arr));
//System.out.println(sum);
//		
	



        








/*		문제7 
		1~100사이의 랜덤수를 한개  발생시켜 변수에 저장하고
		 임의의 값을 입력받아 랜덤값을  맞추는 코드 작성하세요

		 맞출때가지 계속 입력받고 맞추면 종료한다.*/


/*int x = 0;
int y = 0;

x = (int)(Math.random() * 100) + 1;
System.out.println(x);
do{
	Scanner s = new Scanner(System.in);
	System.out.println("값을 입력해주세요>");
	y = (int)Integer.parseInt(s.nextLine());
}while(x != y);

System.out.println("정답입니다.");*/
		
//while(true){
//	//3자리 한 번에 입력 받고 쪼개기
//	System.out.print("3자리 숫자>");
//	int input = Integer.parseInt(s.nextLine());
//	int i3 = input % 10;
//	input /= 10;
//	int i2 = input % 10;
//	input /= 10;
//	int i1 = input % 10;
//
//	int strike = 0;
//	int ball = 0;
//	int out = 0;
//
//	if(a1 == i1) strike++;
//	if(a2 == i2) strike++;
//	if(a3 == i3) strike++;
//
//	if(a1 == i2 || a1 == i3) ball++;
//	if(a2 == i1 || a2 == i3) ball++;
//	if(a3 == i1 || a3 == i2) ball++;
//
//	out = 3 - strike - ball;
//
//	System.out.println(++count + "차 시도(" + i1 + i2 + i3 + ") : "
//			+ strike + "S " + ball + "B " + out + "O");
//	System.out.println("----------------------------");
//	if(strike == 3){
//		System.out.println("정답입니다!");
//		break;
//	}
//}

		
	}

}



























