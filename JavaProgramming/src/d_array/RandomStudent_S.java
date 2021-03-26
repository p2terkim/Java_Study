package d_array;

import java.util.Scanner;

public class RandomStudent_S {

	public static void main(String[] args) {

		String[] students = {"곽명훈", "김나위", "김병수", "김성현", "김영광", "김정명", "김찬미",
				"김현민", "김현성", "류창현", "맹세희", "배병주", "설동비", "양규진", "여지연", "오태훈", 
				"이기정", "이상훈","이재헌", "이치우", "전민주", "조기범", "조영현", "조항민", "최진우"};

		Scanner s = new Scanner(System.in);
		System.out.print("몇 명 뽑을까요?>");
		int count = Integer.parseInt(s.nextLine());


		String[] pick = new String[count];
		int pickCount = 0;

		do{
			int random = (int)(Math.random() * students.length);

			boolean flag = true;

			for(int j = 0; j < pick.length; j++){
				if(students[random].equals(pick[j])){
					flag = false;
				}
			}
			if(flag){
				pick[pickCount] = students[random];
				pickCount++;
			}

		}while(pickCount < count);

		/*		for(int k = 0; k < pick.length; k++) 
			System.out.println(students[randoms[k]]);*/
	}

}
