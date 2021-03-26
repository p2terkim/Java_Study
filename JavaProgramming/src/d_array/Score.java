package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0~100까지 랜덤으로 생성해주고, 아래와 같이 출력해주세요.
		 * 
		 * 			국어		영어		수학		사회		과학		Oracle		Java		합계		평균		석차
		 * 홍길동  		90		90		90		90		90		90			90			630		90.00	1	
		 * 홍길동  		90		90		90		90		90		90			90			630		90.00	1	
		 * 홍길동  		90		90		90		90		90		90			90			630		90.00	1	
		 * 홍길동  		90		90		90		90		90		90			90			630		90.00	1	
		 * 홍길동  		90		90		90		90		90		90			90			630		90.00	1
		 * 과목합계	450		450		450		450		450		450			450
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00		90.00		
		 */
		
		int scores[][] = new int[25][7];
		int[] sum = new int[scores.length]; //합계 = 개인 총점
		int[] sum1 = new int[scores[0].length]; //과목 합계
		double[] avg = new double[scores.length]; //평균 = 개인 평균
		double[] avg1 = new double[scores[0].length]; //과목 평균
		String[] students = {"곽명훈", "김나위", "김병수", "김성현", "김영광", "김정명", "김찬미",
				"김현민", "김현성", "류창현", "맹세희", "배병주", "설동비", "양규진", "여지연", "오태훈", 
				"이기정", "이상훈","이재헌", "이치우", "전민주", "조기범", "조영현", "조항민", "최진우"};
		
		//점수 표 랜덤
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int)(Math.random() * 101);
			}
//			System.out.println(Arrays.toString(scores[i]));
		}
		
		System.out.println("학색\t국어\t영어\t수학\t사회\t과학\tOracle\tJava\t합계\t평균"); //첫 번째 줄 출력
		//개인 합계, 개인 평균
		for (int i = 0; i < scores.length; i++) { //점수표 행의 개수만큼 반복 수행
			System.out.print(students[i]); //줄의 시작은 학생이름으로

			for (int j = 0; j < scores[i].length; j++) { //점수표 열의 개수만큼 반복 수행
				sum[i] += scores[i][j]; //i행을 기준으로 점수 계산 = 개인 총점
				System.out.print("\t" + scores[i][j]); //i행 점수 출력
			}
			avg[i] = (double)sum[i]/scores[i].length; //i행의 점수 출력 후 i행의 평균 계산 = 개인 평균 계산
			System.out.println("\t" + sum[i] + "\t" +  avg[i]); // 개인 총점과 개인 평균 출력
		}
		//과목 합계, 과목 평균
		for (int i = 0; i < scores[0].length; i++) { //점수표 열의 개수만큼 반복 수행
			for (int j = 0; j < scores.length; j++) { //점수표 행의 개수만큼 반복 수행
				sum1[i] += scores[j][i]; //i열을 기준으로 점수 계산 = 과목 합계
			}
			avg1[i] = (double)sum1[i]/scores.length; //i열의 점수 출력 후 i열의 평균 계산 = 과목 평균
		}
		//과목 합계
		System.out.print("과목 합계");
		for (int i = 0; i < sum1.length; i++) {
				System.out.print("\t" + sum1[i]);
		}
		System.out.println();
		System.out.print("과목 평균");
		//과목 평균
		for (int i = 0; i < avg1.length; i++) {
			System.out.print("\t" + avg1[i]);
		}
//		System.out.print(""+sum1[]);
//		System.out.print(">"+avg1[i]);
//		System.out.println(Arrays.toString(sum1));
//		System.out.println(Arrays.toString(avg1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
