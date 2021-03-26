package e_oop.score;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		//문제1.
		//arr배열의 모든값을 더하는 프로그램을 작성하세요
//		int[] arr ={10,20,30,40,50};
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i]; 
//		}
//		System.out.println(sum);
		
		//문제2 
		//5명의 이름을 입력받아 배열에 저장하는 프로그램을 작성하세요.
		String[] name = new String[5];
		
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i < name.length; i++) {
//			System.out.println("이름을 입력해주세요>");
//			name[i] = sc.nextLine();
////			System.out.println(name[i]);
//		}
//		
//		System.out.println(Arrays.toString(name));
		
	
		//문제3
//		score배열의 최대값, 최소값구하기 
		int[] score = { 79, 88, 91, 33, 100, 55, 95};
		int min = score[0];
		int max = score[0];
		
		for (int i = 0; i < score.length - 1; i++) {
			if(score[i] < min){
				min = score[i];
			}
			if(score[i] > max){
				max = score[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		
		//문제4
		//2차원 배열 arr2에 담긴 모든값의 총합과 평균을 구하는 프로그램을 작성하세요
		int[][] arr2 = {
				    {5,5,5,5,5},
				    {10,10,10,10,10},
				    {20,20,20,20,20},
				    {30,30,30,30,30}
		 };
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				sum +=arr2[i][j];
			}
		}
		avg = Math.round((double)sum / (arr2.length * arr2[0].length) * 100) / 100.0;
		System.out.println("sum : " + sum + " / avg : " + avg );
		
		//문제5
		//answer 배열의 각 숫자의 갯수를 세어 count배열에 넣고 
		//count배열의 각숫자만큼씩 *를 출력한다 
		int[] answer= new int[20];
		int[] counter = new int[4];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int)(Math.random() * 4) + 1;
		}
		System.out.println(Arrays.toString(answer));

		for (int i = 0; i < answer.length; i++){
			counter[answer[i] - 1]++;
			}
			for (int i = 0; i < counter.length; i++) {
			System.out.print( i + 1 + " : " );

			for (int j = 0; j < counter[i]; j++) {
			System.out.print("*");
			}
			System.out.println(" " + counter[i]);
			}
		
		//문제6
		String menu[] ={ "아메리카노 3000원", "카푸치노 4000원", "카페라떼 3500원"};
		//menu배열에서 메뉴이름과 가격중 메뉴이름을 추출하는 프로그램을 작성하세요.
			for (int i = 0; i < menu.length; i++) {
				String name1 = menu[i].substring(0, menu[i].indexOf(" "));
				System.out.println(name1);
			}
		
		//문제7.
		String str="i Love Java";
		//str변수에서 Java의 위치를 찾아 출력하는 프로그램을 작성하세요,
		int index = str.indexOf("Java");
		System.out.println("Java의 위치(인덱스 번호) : " + index);
		
		//문제8
		String  s= "java.lang.Object";
		//s변수에서 lang문자열을 추출하는 프로그램을 작성하세요 
		String sub1 = s.substring(5,9);
		System.out.println(sub1);
		
		
		//문제9
		String animals = "dog,cat,bear";
		//animals변수에서 ,를 기준으로  문자열을  분리해서  3개의 단어로 각각 출력하는
		// 프로그램을 작성하세요
		String[] split = animals.split(",");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

		
		// 문제 10
		String str2="java,lang,Object";
		//str문자열에서 ,를 .으로 바꾸어 출력하는 프로그램을 작성하세요.
		String replace = str2.replace(',', '.');
		System.out.println(replace);
		
	}

}




















