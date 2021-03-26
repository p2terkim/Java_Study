package e_oop.score;

public class Student {

	//인스턴스 변수 생성
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	int rank;
	
	//과목별 점수 랜덤 생성 - 인스턴스 메서드 
	void createRandomScore() {
		kor = (int)(Math.random() * 101);
		eng = (int)(Math.random() * 101);
		math = (int)(Math.random() * 101);
	}
	
	//개인 합계 계산 - 인스턴스 메서드
	int getSum() {
		return sum = kor + eng + math;
	}
	//개인 평균 계산 - 인스턴스 메서드
	double getAverage() {
		return avg = Math.round(getSum() / 3.0 * 100) / 100.0;
	}
	
	//석차 구하기 - 인스턴스 메서드
	int getRank(Student[] students) {
		rank = 1;
		
		for(int i = 0; i < students.length; i++) {
			if(getSum() < students[i].getSum()) {
				rank++;
			}
		}
		
		return rank;
	}
	//출력하기 - 인스턴스 메서드
	String getInfo() {
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg + "\t" + rank;
	}
	
}
