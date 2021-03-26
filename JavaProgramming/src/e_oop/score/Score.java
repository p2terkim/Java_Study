package e_oop.score;

public class Score {

	public static void main(String[] args) {
		
		//객체 생성 - 10명의 학생 객체 생성
		Student[] students = new Student[10];
		
		//인스턴스 변수와 메서드 호출하여 값 입력
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].name = "학생" + (i + 1);
			students[i].createRandomScore();
			students[i].getSum();
			students[i].getAverage();
		}
		
		//학생들의 석차를 입력
		for(int i = 0; i < students.length; i++) {
			students[i].getRank(students);
		}
		//석차순으로 정렬(버블 정렬 사용)
		for(int i = 0; i < students.length - 1; i++){
			boolean changed = false;
			for(int j = 0; j < students.length - i - 1; j++){
				if(students[j].getSum() < students[j + 1].getSum()){
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
					changed = true;
				}
			}
			if(!changed){
				break;
			}
		}
		
		int[] subSum = new int[3];
		double[] subAvg = new double[3];
		
		//출력하기
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
		for(int i = 0; i < students.length; i++) {
			
			//getInfo 메서드 호출
			System.out.println(students[i].getInfo());
			
			//과목 합계 계산
			subSum[0] += students[i].kor;
			subSum[1] += students[i].eng;
			subSum[2] += students[i].math;
		}
		
		//과목합계, 과목 평균 출력
		System.out.print("과목합계");
		for(int i = 0; i < subSum.length; i++) {
			System.out.print("\t" + subSum[i]);
		}
		System.out.println();
		System.out.print("과목평균");
		for(int i = 0; i < subAvg.length; i++) {
			subAvg[i] = Math.round(subSum[i] / students.length * 100) / 100.0;
			System.out.print("\t" + subAvg[i]);
		}
		System.out.println();
	}
	
}







