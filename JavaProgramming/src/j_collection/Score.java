package j_collection;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

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

		
		
		//내방법
		
		
//		//과목 배열
//		ArrayList<String> subj = new ArrayList<>(); //과목 이름 입력 배열, 길이는 과목 수
//		subj.add("국어");
//		subj.add("영어");
//		subj.add("수학");
//		subj.add("사회");
//		subj.add("과학");
//		subj.add("Oracle");
//		subj.add("Java");
//		
//		//학생 이름 배열
//		ArrayList<String> name = new ArrayList<>(); //학생 이름 입력 배열 
//		for (int i = 0; i < 5; i++) {
//			name.add(i,"홍길동");
//		}
//
//		//성적 입력 - 1~100 사이의 랜덤값
//		ArrayList<ArrayList<Integer>> score2 = new ArrayList<>(); 
//		ArrayList<Integer> score = new ArrayList<>(); 
//		for (int i = 0; i < name.size(); i++) {
//			score = new ArrayList<>(); 
//			for (int j = 0; j < subj.size(); j++) {
//				score.add(j,(int)(Math.random() * 101));
//			}
//			score2.add(i, score);
//		}
//
//		//개인 합계, 개인 평균
//		ArrayList<Integer> nsum = new ArrayList<>();
//		ArrayList<Double> navg = new ArrayList<>();
//
//		for (int i = 0; i < name.size(); i++) {
//			int n = 0;
//			for (int j = 0; j < subj.size(); j++) {
//				n += score2.get(i).get(j);
//				nsum.add(i,n);
//			}
//			navg.add(i, (Math.round((double)nsum.get(i) / subj.size() * 100) / 100.0));
//		}
//
//
//		//석차
//		ArrayList<Integer> rank = new ArrayList<>(); 
//		for (int i = 0; i < name.size(); i++) {
//			int rank1 = 1;
//			for (int j = 0; j < name.size(); j++) {
//				if(nsum.get(i) < nsum.get(j) ){
//					rank1++;
//				}
//				rank.add(i, rank1);
//			}
//		}
//		
//		//과목 합계, 과목 평균
//		ArrayList<Integer> ssum = new ArrayList<>();
//		ArrayList<Double> savg = new ArrayList<>();
//		
//		for (int i = 0; i < subj.size(); i++) {
//			int x = 0;
//			for (int j = 0; j < name.size(); j++) {
//				x +=score2.get(j).get(i); 
//				ssum.add(i, x);
//			}
//			savg.add(i, (Math.round((double)ssum.get(i) / name.size() * 100) / 100.0));
//		}
//		
//		//출력
//		for (int i = 0; i < subj.size(); i++) {
//			System.out.print("\t" + subj.get(i));
//		}
//		System.out.println("\t" + "합계" + "\t" + "평균" + "\t" + "석차");
//		
//		for (int i = 0; i < name.size(); i++) {
//			System.out.print(name.get(i));
//			for (int j = 0; j < subj.size(); j++) {
//				System.out.print("\t" + score2.get(i).get(j));								
//			}
//			System.out.println("\t" + nsum.get(i) + "\t" +navg.get(i)+ "\t" + rank.get(i));
//		}
//		System.out.print("과목 합계");
//		for (int i = 0; i < subj.size(); i++) {
//			System.out.print("\t" + ssum.get(i));
//		}
//		System.out.println();
//		System.out.print("과목 평균");
//		for (int i = 0; i < subj.size(); i++) {
//			System.out.print("\t" + savg.get(i));
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
		
		ArrayList<String> students = new ArrayList<>();
		students.add("오태훈");
		students.add("조항민");
		students.add("김정명");
		students.add("이치우");
		
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("국어");
		subjects.add("영어");
		subjects.add("수학");
		subjects.add("사회");
		subjects.add("과학");
		subjects.add("Oracle");
		subjects.add("Java");
		
		ArrayList<ArrayList<Integer>> scores = new ArrayList<>();
		ArrayList<Integer> sums = new ArrayList<>();
		ArrayList<Double> avgs = new ArrayList<>();
		ArrayList<Integer> ranks = new ArrayList<>();
		ArrayList<Integer> subSums = new ArrayList<>();
		ArrayList<Double> subAvgs = new ArrayList<>();
		
		for(int i = 0; i < students.size(); i++) { //반복문 : 학생 수(='students'의 길이)만큼 반복
			ranks.add(1); //이 때 미리 석차 배열의 각 인덱스에 학생 수 만큼 1을 입력해 놓았다.
			
			ArrayList<Integer> score = new ArrayList<>(); //학생 한명의 성적에 대한 배열
			for(int j = 0; j < subjects.size(); j++) {
				score.add((int)(Math.random() * 101)); //성적 : 0~100까지의 랜덤한 숫자 입력
			}
			scores.add(score); //2차원 배열, 학생 전체의 성적에 대한 배열
		}
		
		//개인 성적 합계,평균
		for(int i = 0; i < scores.size(); i++) { //1차 반복문 : 학생 수(='scores'의 길이)만큼 반복
			int sum = 0;
			for(int j = 0; j < scores.get(i).size(); j++) { //2차 반복문 : 학생전체의 성적에 대한 배열(scores)의 i번 인덱스에 저장된 객체(개인 성적)의 길이 만큼 반복
				sum += scores.get(i).get(j); // 개인별 성적의 총합
			}
			sums.add(sum); 
			avgs.add(Math.round((double)sum / scores.get(i).size() * 100) / 100.0);//평균 : 소수점 2째 자리에서 반올림
		}
		
		//개인 석차 구하기
		for(int i = 0; i < sums.size(); i++) { //1차 반복문 : 학생 수(='sums'의 길이)만큼 반복
			for(int j = 0; j < sums.size(); j++) { //2차 반복문 : 학생 수(='sums'의 길이)만큼 반복, 학생 한 명('sums'의 i번)의 성적과 전체 학생의 성적('sums'의 j번)을 비교
				if(sums.get(i) < sums.get(j)) { //i번째 학생보다 j번째 학생의 성적 총합이 높을 경우
					ranks.set(i, ranks.get(i) + 1); //(배열 전체 인덱스에 1값이 저장되어있는 )'ranks배열'의 i번 인덱스의 값을 1씩 증가 
				}
			}
		}
		
		//'ranks'배열 석차순정렬(오름차순 정렬)
		for(int i = 0; i < ranks.size(); i++) { //1차 반복문 : 학생 수 (='ranks'의 길이)만큼 반복
			int min = i; //min은 값(value)으로 i번 인덱스번호를 부여  
			for(int j = i + 1; j < ranks.size(); j++) { //2차 반복문 :'남은 학생 수 (='ranks'의 길이) - (i + 1)')만큼 반복 
				if(ranks.get(j) < ranks.get(min)) { //'ranks'의 i번 인덱스의 값과 'ranks'의 j번 인덱스의 값 비교, 'min'번째 학생보다 j번째 학생의 석차 높을 경우
					min = j;//min의 값(value)으로 j번째 학생의 인덱스 번호를 부여 
				}
			}
			
			String tempName = students.get(i);//students 배열의 i번 인덱스에 저장된 학생의 이름을  tempName에 입력
			students.set(i, students.get(min));
			students.set(min, tempName);
			
			ArrayList<Integer> tempScore = scores.get(i);
			scores.set(i, scores.get(min));
			scores.set(min, tempScore);
			
			int tempSum = sums.get(i);
			sums.set(i, sums.get(min));
			sums.set(min, tempSum);
			
			double tempAvg = avgs.get(i);
			avgs.set(i, avgs.get(min));
			avgs.set(min, tempAvg);
			
			int tempRank = ranks.get(i);
			ranks.set(i, ranks.get(min));
			ranks.set(min, tempRank);
		}
		
		for(int i = 0; i < subjects.size(); i++) {
			int sum = 0;
			for(int j = 0; j < students.size(); j++) {
				sum += scores.get(j).get(i);
			}
			subSums.add(sum);
			subAvgs.add(Math.round((double)sum / students.size() * 100) / 100.0);
		}
		
		System.out.println("===================================================================================");
		System.out.print("이름");
		for(int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subjects.get(i));
		}
		System.out.println("\t합계\t평균\t석차");
		System.out.println("-----------------------------------------------------------------------------------");
		for(int i = 0; i < scores.size(); i++) {
			System.out.print(students.get(i));
			
			ArrayList<Integer> score = scores.get(i);
			for(int j = 0; j < score.size(); j++) {
				System.out.print("\t" + score.get(j));
			}
			System.out.println("\t" + sums.get(i) + "\t" + avgs.get(i) + "\t" + ranks.get(i));
		}
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print("과목합계");
		for(int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subSums.get(i));
		}
		System.out.println();
		System.out.print("과목평균");
		for(int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subAvgs.get(i));
		}
		System.out.println();
		System.out.println("===================================================================================");
		
	}

}
