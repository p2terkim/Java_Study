package d_array;

import java.util.Scanner;

public class RandomStudents {

	public static void main(String[] args) {

		//과제) 입력한 숫자만큼 학생의 이름을 랜덤으로 출력하는 프로그램을 만들어주세요.

		//		25명 중 몇 명을 랜덤하게 뽑고(중복되지 않게)

		//		int[] num = new int[10];

		String[] students = {"곽명훈", "김나위", "김병수", "김성현", "김영광", "김정명", "김찬미",
				"김현민", "김현성", "류창현", "맹세희", "배병주", "설동비", "양규진", "여지연", "오태훈", 
				"이기정", "이상훈","이재헌", "이치우", "전민주", "조기범", "조영현", "조항민", "최진우"};

		Scanner s = new Scanner(System.in);
		System.out.print("25 이하 숫자 입력>");
		int input = Integer.parseInt(s.nextLine());

		int[] randoms = new int[input];

		for (int i = 0; i < randoms.length; i++) {
			int temp = (int) (Math.random() * 25);
			randoms[i] = temp;

			// 중복제거
			for (int j = 0; j < i; j++) {
				if (randoms[j] == temp) {
					i--;
					break;
				}
			}
		} // for end

		for(int k = 0; k < randoms.length; k++) 
			System.out.println(students[randoms[k]]);		
	}
}

//for (int i = 0; i < input; i++){
//randoms[i] = (int) (Math.random() * 25) + 1;
//System.out.println(students[randoms[i]]);
//}




//do{// 조건의 결정이 뭔가를 한 후에 결정된다면 do-while문을 사용하는게 좋다.
//	for (int i = 0; i < input; i++){
//		 randoms[i] = (int) (Math.random() * 25) + 1;
//	}
//}while(for(int j = 0; j < input; j++){
//		randoms[i] == randoms[i+1])};


//




//for(int i = 0; i < 10; i++);{
//	
//	int[] num = new int[i];
//}
//	num[i] = (int)(Math.random() * 25) + 1;
//	
//	System.out.println(students[num[i]-1]);
//

//}