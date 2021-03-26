package d_array;


public class Score1 {

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
		
		
////변수 생성
//		
////학생 이름 배열
//String[] students = {"곽명훈", "김나위", "김병수", "김성현", "김영광", "김정명", "김찬미",
//		"김현민", "김현성", "류창현", "맹세희", "배병주", "설동비", "양규진", "여지연", "오태훈", 
//		"이기정", "이상훈","이재헌", "이치우", "전민주", "조기범", "조영현", "조항민", "최진우"};
//
////과목명 배열
//String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
//
////랜덤 점수표 배열(학생수 X 과목수)
//int scores[][] = new int[students.length][subjects.length];
//
//for (int i = 0; i < scores.length; i++) {
//	for (int j = 0; j < scores[i].length; j++) {
//		scores[i][j] = (int)(Math.random() * 101);
//	}
//}
//
////개인 합계
//int[] studentsSum = new int[scores.length];
//
////개인 평균
//double[] studentsAvg = new double[scores.length];
//
////개인 합계, 개인 평균 계산
//for (int i = 0; i < students.length; i++) {
//	for (int j = 0; j < subjects.length; j++) {
//		studentsSum[i] += scores[i][j];
//	}
//	studentsAvg[i] = (double)studentsSum[i] / subjects.length;
//}
//
//
////과목 합계
//int[] subjectsSum = new int[subjects.length];
//
////과목 평균
//double[] subjectsAvg = new double[subjects.length];
//
////과목 합계, 과목 평균
//for (int i = 0; i < subjects.length; i++) {
//	for (int j = 0; j < students.length; j++) {
//		subjectsSum[i] += scores[j][i];
//	}
//	subjectsAvg[i] = (double)subjectsSum[i] / students.length;
//}
//
////석차
//int[] rank = new int[students.length];
//
//for (int i = 0; i < studentsAvg.length; i++) {
//	rank[i] = 1;
//	for (int j = 0; j < studentsAvg.length; j++) {
//		if(studentsAvg[i] < studentsAvg[j]){
//			rank[i]++;
//		}
//		
//	}
//	
//}
//
//
////출력
//
////과목명 출력
//for (int i = 0; i < subjects.length; i++) {
//	System.out.print("\t" + subjects[i]);
//}
////합계 평균 석차 출력
//System.out.println("\t합계\t평균\t석차");
//
////개인 합계 출력
//for (int i = 0; i < students.length; i++) {
//	System.out.print(students[i] + "\t");
//	for (int j = 0; j < subjects.length; j++) {
//		System.out.print(scores[i][j] + "\t");
//	}
//	System.out.println(studentsSum[i] + "\t" + Math.round(studentsAvg[i]*100)/100.0 + "\t" + rank[i]);
//}
//
//
////과목 합계
//System.out.print("과목 합계");
//for (int i = 0; i < subjectsSum.length; i++) {
//	System.out.print("\t" + subjectsSum[i]);
//}
//System.out.println();
//
////과목 평균
//System.out.print("과목 평균");
//for (int i = 0; i < subjectsAvg.length; i++) {
//	System.out.print("\t" + Math.round(subjectsAvg[i]*100)/100.0);
//}

		
		
		
		
		
		
		
		
		
		
		
//	////변수 생성 및 값 입력
//
//		//학생 이름
//		String[] students = {"가","나","다"};
//
//		//과목명
//		String[] subjects = {"국", "영", "수"};
//
//		//점수표
//		int scores[][] = new int[students.length][subjects.length];
//
//		for(int i = 0; i < students.length; i++){
//			for(int j = 0; j < subjects.length; j++){
//				scores[i][j] = (int)(Math.random() * 101);
//			}
//		}
//
//		//개인 합계
//		int[] studentsSum = new int[students.length];
//
//		//개인 평균
//		double[] studentsAvg = new double[students.length];
//
//		//개인 합계, 개인 평균 입력
//		for(int i = 0; i < students.length ; i++){
//			for(int j = 0; j <  subjects.length; j++){
//				studentsSum[i] += scores[i][j];
//			}
//			studentsAvg[i] = (double)studentsSum[i] / subjects.length;  
//		}
//
//		//석차
//		int[] rank = new int[students.length];
//
//		for(int i = 0; i < studentsAvg.length;i++){
//			rank[i] = 1;	
//			for(int j = 0; j < studentsAvg.length;  j++){
//				if(studentsAvg[i] < studentsAvg[j]){
//					rank[i]++;
//				}
//			}
//		}
//
//		//과목 합계
//		int[] subjectsSum = new int[subjects.length];
//
//		//과목 평균
//		double [] subjectsAvg = new double[subjects.length];
//
//		//과목 합계, 과목 평균 입력
//		for(int i = 0; i < students.length; i++){
//			for(int j = 0; j < students.length; j++){
//				subjectsSum[i] += scores[j][i];
//			}
//			subjectsAvg[i] = (double)subjectsSum[i] / students.length; 
//		}
//
//		////출력
//		//과목명//개인 합계//개인 평균//석차
//
//		for(int i = 0; i < subjects.length; i++){
//			System.out.print("\t" + subjects[i]);
//		}
//		System.out.println("\t합계\t평균\t석차");
//
//
//		//학생 이름//성적//개인합계//개인평균
//
//		for(int i = 0; i < students.length; i++){
//			System.out.print(students[i] + "\t");
//			for(int j = 0; j < subjects.length; j++){
//				System.out.print(scores[i][j] + "\t");
//			}
//			System.out.println(studentsSum[i] + "\t" + Math.round(studentsAvg[i] * 100)/100.0 + "\t" + rank[i]);
//		}
//
//
//		//과목 합계
//		System.out.print("과목 합계\t");
//		for(int i = 0; i < subjectsSum.length; i++){
//			System.out.print(subjectsSum[i] + "\t");
//		}
//		System.out.println();
//
//		//과목 평균
//
//		System.out.print("과목 평균\t");
//		for(int i = 0; i < subjectsAvg.length; i++){
//			System.out.print(Math.round(subjectsAvg[i]*100)/100.0+ "\t");
//		}
//
//
//
//
//
//






//
//		String[] names = {"허지영", "김민지", "김동민", "배현태", "여인욱", "김동희", "김인혁", "이영섭", "정선영", "이지향", "김용진"};
//		String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
//		int[][] score = new int[names.length][subjects.length];
//		
//		for(int i = 0; i < score.length; i++){
//			for(int j = 0; j < score[i].length; j++){
//				score[i][j] = (int)(Math.random() * 101);
//			}
//		}
//		
//		int[] nameSum = new int[score.length];
//		double[] nameAvg = new double[score.length];
//		for(int i = 0; i < score.length; i++){
//			for(int j = 0; j < score[i].length; j++){
//				nameSum[i] += score[i][j];
//			}
//			nameAvg[i] = Math.round((double)nameSum[i] / subjects.length * 100) / 100.0;
//		}
//		
//		int[] subSum = new int[subjects.length];
//		double[] subAvg = new double[subjects.length];
//		for(int i = 0; i < subjects.length; i++){
//			for(int j = 0; j < score.length; j++){
//				subSum[i] += score[j][i];
//			}
//			subAvg[i] = Math.round((double)subSum[i] / score.length * 100) / 100.0;
//		}
//		
//		int[] rank = new int[score.length];
//		for(int i = 0; i < score.length; i++){
//			rank[i] = 1;
//			for(int j = 0; j < score.length; j++){
//				if(nameSum[i] < nameSum[j]){
//					rank[i]++;
//				}
//			}
//		}
//		
//		//석차순으로 정렬(시험에서 출제되지 않음)
//		for(int i = 0; i < nameSum.length - 1; i++){
//			int min = i;
//			for(int j = i + 1; j < nameSum.length; j++){
//				if(nameSum[j] > nameSum[min]){
//					min = j;
//				}
//			}
////			int[] temp = score[i];
////			score[i] = score[min];
////			score[min] = temp;
////			
////			int temp2 = nameSum[i];
////			nameSum[i] = nameSum[min];
////			nameSum[min] = temp2;
////			
////			double temp3 = nameAvg[i];
////			nameAvg[i] = nameAvg[min];
////			nameAvg[min] = temp3;
//			
//			int temp4 = rank[i];
//			rank[i] = rank[min];
//			rank[min] = temp4;
//			
////			String temp5 = names[i];
////			names[i] = names[min];
////			names[min] = temp5;
//		}
//		
//		for(int i = 0; i < subjects.length; i++){
//			System.out.print("\t" + subjects[i]);
//		}
//		System.out.println("\t합계\t평균\t석차");
//		for(int i = 0; i < score.length; i++){
//			System.out.print(names[i] + "\t");
//			for(int j = 0; j < score[i].length; j++){
//				System.out.print(score[i][j] + "\t");
//			}
//			System.out.println(nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
//		}
//		
//		System.out.print("과목합계\t");
//		for(int i = 0; i < subSum.length; i++){
//			System.out.print(subSum[i] + "\t");
//		}
//		System.out.println();
//		
//		System.out.print("과목평균\t");
//		for(int i = 0; i < subAvg.length; i++){
//			System.out.print(subAvg[i] + "\t");
//		}
//
//


		
		
		
		
		
//	////변수 생성 및 입력
//
//		//학생
//		String[] names = {"허지영", "김민지", "김동민", "배현태", "여인욱", "김동희", "김인혁", "이영섭", "정선영", "이지향", "김용진"};
//
//		//과목
//		String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
//
//		//점수
//		int[][] score = new int[names.length][subjects.length];
//
//		for(int i = 0; i < score.length; i++){
//			for(int j = 0; j < score[i].length; j++){
//				score[i][j] = (int)(Math.random() * 101) + 1;
//			}
//		}
//
//		//개인 합계
//		int[] namesSum = new int[names.length];
//
//		//개인 평균
//		double[] namesAvg = new double[names.length];
//
//		for(int i = 0; i < names.length; i++){
//			for(int j = 0; j < subjects.length; j++){
//				namesSum[i] += score[i][j];
//			}
//			namesAvg[i] = (double) Math.round(namesSum[i] / subjects.length) * 100 / 100.00;
//		}
//
//		//석차
//		int[] rank = new int[names.length];
//
//		for(int i = 0; i < names.length; i++){
//			rank[i] = 1;
//			for(int j = 0; j < names.length; j++){
//				if(namesAvg[i] < namesAvg[j]){
//					rank[i]++;
//				}
//			}
//		}
//
//		//과목 합계
//		int[] subSum = new int[subjects.length];
//
//		//과목 평균
//		double[] subAvg = new double[subjects.length];
//
//		for(int i = 0; i < subjects.length; i++){
//			for(int j = 0; j < names.length; j++){
//				subSum[i] += score[j][i];
//			}
//			subAvg[i] = (double) Math.round(subSum[i] / names.length) * 100 / 100.00;
//		}
//
//		////출력
//		//과목명//합계//평균//석차
//		for(int i = 0; i < subjects.length; i++){
//			System.out.print("\t" + subjects[i]);
//		}
//		System.out.println("\t합계\t평균\t석차");
//
//		//학생이름//점수//개인 합계//개인 평균//석차
//		for(int i = 0; i < names.length; i++){
//			System.out.print(names[i] + "\t");
//			for(int j = 0; j < subjects.length; j++){
//				System.out.print(score[i][j] + "\t");
//			}
//			System.out.println(namesSum[i] +"\t"+ namesAvg[i] +"\t"+ rank[i]);
//		}
//
//		//과목 합계
//		System.out.print("과목 합계"+ "\t");
//		for(int i = 0; i < subSum.length; i++){
//			System.out.print(subSum[i] + "\t");
//		}
//		System.out.println();
//		//과목 평균
//		System.out.print("과목 평균"+ "\t");
//		for(int i = 0; i < subAvg.length; i++){
//			System.out.print(subAvg[i] + "\t");
//		}
//		
		
//		for(int i = 0; i < score.length; i++){
//			for(int j = 0; j < score[i].length; j++){
//				score[i][j] = (int)(Math.random() * 101);
//			}
//		}

	////변수 생성
//
//		//학생 이름
//		String[] names = {"가", "나", "다"};
//		//과목 명
//		String[] subjects = {"국", "영", "수"};
//		//점수표
//		int[][] score = new int[names.length][subjects.length];
//		
//		for(int i = 0; i < score.length; i++){
//			for(int j = 0; j < score[i].length; j++){
//				score[i][j] = (int)(Math.random() * 101);
//			}
//		}
//
//		//개인 합계
//		int[] namesSum = new int[names.length];
//
//		//개인 평균
//		double[] namesAvg = new double[names.length];
//
//		for(int i = 0; i < names.length; i++){
//			for(int j = 0; j < subjects.length; j++){
//				namesSum[i] += score[i][j];
//			}namesAvg[i] = (double) Math.round(namesSum[i] / subjects.length * 100) / 100.00;
//		}
//		//석차
//		int[] rank = new int[names.length];
//
//		for(int i = 0; i < names.length; i++){
//			rank[i] = 1;
//			
//			for(int j = 0; j < subjects.length; j++){
//				if(namesAvg[i] < namesAvg[j]){
//					rank[i]++;
//				}
//			}
//		}
//
//		//과목 합계
//		int[] subSum = new int[subjects.length];
//
//		//과목 평균
//		double[] subAvg = new double[subjects.length];
//
//		for(int i = 0; i < subjects.length; i++){
//			for(int j = 0; j < names.length; j++){
//				subSum[i] += score[j][i];
//			}subAvg[i] = (double) Math.round(subSum[i] / names.length * 100) / 100.00;
//		}
//
//		
//		////출력
//		//과목명//합계//평균//석차
//		for(int i = 0; i < subjects.length; i++){
//			System.out.print("\t" + subjects[i]);
//		}
//		System.out.println("\t합계\t평균\t석차");
//
//		//학생이름//점수//개인 합계//개인 평균//석차
//		for(int i = 0; i < names.length; i++){
//			System.out.print(names[i] + "\t");
//			for(int j = 0; j < subjects.length; j++){
//				System.out.print(score[i][j] + "\t");
//			}
//			System.out.println(namesSum[i] +"\t"+ namesAvg[i] +"\t"+ rank[i]);
//		}
//
//		//과목 합계
//		System.out.print("과목 합계"+ "\t");
//		for(int i = 0; i < subSum.length; i++){
//			System.out.print(subSum[i] + "\t");
//		}
//		System.out.println();
//		//과목 평균
//		System.out.print("과목 평균"+ "\t");
//		for(int i = 0; i < subAvg.length; i++){
//			System.out.print(subAvg[i] + "\t");
//		}
//		
		
		
		
		
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0 ~ 100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 * 			국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 과목합계	450		450		450		450		450		450		450
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00
		 */
		
		String[] names = {"허지영", "김민지", "김동민", "배현태", "여인욱", "김동희", "김인혁", "이영섭", "정선영", "이지향", "김용진"};
		String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
		int[][] score = new int[names.length][subjects.length];
		
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length; j++){
				score[i][j] = (int)(Math.random() * 101);
			}
		}
		
		int[] nameSum = new int[score.length];
		double[] nameAvg = new double[score.length];
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length; j++){
				nameSum[i] += score[i][j];
			}
			nameAvg[i] = Math.round((double)nameSum[i] / subjects.length * 100) / 100.0;
		}
		
		int[] subSum = new int[subjects.length];
		double[] subAvg = new double[subjects.length];
		for(int i = 0; i < subjects.length; i++){
			for(int j = 0; j < score.length; j++){
				subSum[i] += score[j][i];
			}
			subAvg[i] = Math.round((double)subSum[i] / score.length * 100) / 100.0;
		}
		
		int[] rank = new int[score.length];
		for(int i = 0; i < score.length; i++){
			rank[i] = 1;
			for(int j = 0; j < score.length; j++){
				if(nameSum[i] < nameSum[j]){
					rank[i]++;
				}
			}
		}
		
		//석차순으로 정렬(시험에서 출제되지 않음)
		for(int i = 0; i < nameSum.length - 1; i++){
			int min = i;
			for(int j = i + 1; j < nameSum.length; j++){
				if(nameSum[j] > nameSum[min]){
					min = j;
				}
			}
			int[] temp = score[i];
			score[i] = score[min];
			score[min] = temp;
			
			int temp2 = nameSum[i];
			nameSum[i] = nameSum[min];
			nameSum[min] = temp2;
			
			double temp3 = nameAvg[i];
			nameAvg[i] = nameAvg[min];
			nameAvg[min] = temp3;
			
			int temp4 = rank[i];
			rank[i] = rank[min];
			rank[min] = temp4;
			
			String temp5 = names[i];
			names[i] = names[min];
			names[min] = temp5;
		}
		
		for(int i = 0; i < subjects.length; i++){
			System.out.print("\t" + subjects[i]);
		}
		System.out.println("\t합계\t평균\t석차");
		for(int i = 0; i < score.length; i++){
			System.out.print(names[i] + "\t");
			for(int j = 0; j < score[i].length; j++){
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
		}
		
		System.out.print("과목합계\t");
		for(int i = 0; i < subSum.length; i++){
			System.out.print(subSum[i] + "\t");
		}
		System.out.println();
		
		System.out.print("과목평균\t");
		for(int i = 0; i < subAvg.length; i++){
			System.out.print(subAvg[i] + "\t");
		}
		
	}

}
