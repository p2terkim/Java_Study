package d_array;

import java.util.Arrays;

public class prac {

	public static void main(String[] args) {
		//석차구하기 연습

		// 1. 정리

		/*//석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식

		int[] arr = new int[5]; //길이가 10인 배열 arr 생성

		for(int i = 0; i < arr.length; i++) //배열 arr에 1 ~ 100 랜덤 값 입력
			arr[i] = (int)(Math.random() * 100) + 1;

		System.out.println("arr : " + Arrays.toString(arr)); //배열 arr 출력
		System.out.println();

		int[] rank = new int[arr.length]; //배열 rank를 배열 arr과 같은 길이로 생성

		for(int i = 0; i < rank.length; i++) //배열 rank의 모든 자리에 1 입력
			rank[i] = 1;

		System.out.println("rank : " + Arrays.toString(rank)); //배열 rank 출력
		System.out.println();

		//배열 arr[i]값 보다 큰 값이 있으면 rank[i]의 값이 올라가서 순위가 내려간다.
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[i] < arr[j]){
					rank[i]++;
					System.out.print(Arrays.toString(rank));	
					System.out.println(" // arr[" + i + "]의 값보다 큰 값이 arr[" + j + "]에 있다.");

				}

			}
			System.out.println("arr[" + i + "]의 순위는 " + rank[i] + "위 이다");
			System.out.println();
		}

		System.out.println("결과 : " + Arrays.toString(rank));*/

		//2. 안보고 연습 1

		/*		//배열 arr 생성
		int[] arr = new int[5];

		for(int i = 0; i < arr.length; i++)
			arr[i] = (int)(Math.random() * 100) + 1;
		System.out.println(Arrays.toString(arr));

		//배열 rank 생성
		int[] rank = new int[arr.length];

		for(int i = 0; i < arr.length; i++)
			rank[i] = 1; 	

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[i] < arr[j]){
					rank[i] += 1;
				}

			}
		}
		System.out.println(Arrays.toString(rank));*/


		//		//3. 안보고 연습 2
		//		
		//		//배열 arr, rank 생성
		//		
		//		int[] arr = new int[5];
		//		
		//		for(int i = 0; i < arr.length; i++)
		//			arr[i] = (int) (Math.random() * 100) + 1;
		//		
		//		int[] rank = new int[arr.length];
		//		
		//		for(int i = 0; i < arr.length; i++)
		//			rank[i] = 1;
		//		
		//		// 값을 비교하여 순위를 계산할 식 생성
		//		
		//		for(int i = 0; i < arr.length; i++ ){
		//			for(int j = 0; j < arr.length; j++){
		//				if(arr[i] < arr[j]){
		//					rank[i] += 1;
		//				}
		//			}
		//		}
		//		System.out.println(Arrays.toString(arr));
		//		System.out.println(Arrays.toString(rank));
		//		
		//		

		//선택정렬 연습
		//가장 작은 숫자를 찾아서 앞으로 보내는 방식(최소값을 찾아서 맨 앞으로 보내는 방식)
		// 1. 정리

		//선택 정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식(최소값을 찾아서 맨 앞으로 보내는 방식)

		/*	int[] arr = new int[10];

		for(int i = 0; i < arr.length; i++)
			arr[i] = (int)(Math.random() * 100) + 1;

		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println();

		for(int i = 0; i < arr.length - 1; i++){
			int min = i; //최소값의 위치 저장을 위한 변수 min 생성
			for(int j = i + 1; j < arr.length; j++){//arr[i]의 뒤의 값부터 비교를 시작해서 arr배열의 마지막 까지 실행
				if(arr[j] < arr[min]){
					min = j; // arr[i] 보다 작은 값이 나올 때 마다 인덱스 번호를 저장
				}
			}
			int temp = arr[i]; // 가장 작은 값 arr[min]과 arr[i]의 값을  바꾼다.
			arr[i] = arr[min];
			arr[min] = temp;
			System.out.println(Arrays.toString(arr) +" //" + (i+1) + "번째로 작은값은  " +arr[i] + "이다");

		}

		System.out.println();
		System.out.println("선택정렬 결과 : " + Arrays.toString(arr));
		 */

		//2. 안보고 연습 1


		//		int[] arr = new int[5];
		//		
		//		for (int i = 0; i < arr.length; i++)
		//			arr[i] = (int)(Math.random() * 100) + 1;
		//
		//		System.out.println(Arrays.toString(arr));
		//		
		//		for(int i = 0; i < arr.length -1; i++){
		//			int min = i;
		//			for(int j = i +1; j < arr.length; j++){
		//				if(arr[j] < arr[min]){
		//					min = j;
		//				}
		//			}
		//			int temp = arr[i];
		//			arr[i] = arr[min];
		//			arr[min] = temp;
		//		}
		//		
		//		System.out.println(Arrays.toString(arr));



		//3. 안보고 연습 2
		/*int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++)
			arr[i] = (int)(Math.random() * 100) + 1;
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i < arr.length - 1; i++){
			int min = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		} 
		System.out.println(Arrays.toString(arr));*/


		//버블 정렬

		//바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		//1. 정리



		/*int[] arr = new int[10];

				for(int i = 0; i < arr.length; i++){
					arr[i] = (int)(Math.random() * 100) + 1;
				}

				System.out.println("arr : " + Arrays.toString(arr));
				System.out.println();

				for(int i = 0; i < arr.length - 1; i++){
					boolean flag = true;
					for(int j = 0; j < arr.length - 1 - i; j++){
						if(arr[j] > arr[j+1]){
							int temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1] = temp;
							flag = false;
						}System.out.println((j+1) + "번" + Arrays.toString(arr));

					}
					if(flag){
						break;
					}
					System.out.println((i + 1) + "번째로 큰 수는"+arr[9-i]);
					System.out.println();
					System.out.println("  " + Arrays.toString(arr));
				}

				System.out.println();
				System.out.println("결과 : " + Arrays.toString(arr));*/



		/*			int[] arr = new int[5];

			for(int i = 0; i < arr.length; i++){
				arr[i] = (int)(Math.random() * 100) + 1;
			}


			for(int i = 0 ; i < arr.length - 1; i++){
				boolean flag = true;
				for(int j = 0; j < arr.length - 1 - i; j++ ){
					if(arr[j] > arr[j+1] ){
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						flag = false;						
					}
				}			
				if(flag) break;
			}*/



		//2. 연습1
		/*int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = (int)(Math.random() * 100) + 1;
		
		System.out.println(Arrays.toString(arr));

		for(int i = 0; i < arr.length - 1; i++){
			
			boolean flag = true;
			
			for(int j = 0; j < arr.length - 1 - i; j++){//범위 실수하지 말자
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = false;// 이 부분 틀림
				}
			}
			
			if(flag){
				break;
			}
		}
		
		System.out.println(Arrays.toString(arr));*/
		
		
		
//		//3. 연습 2
//		
//		int[] arr = new int[10];
//		
//		for (int i = 0; i < arr.length; i++) 
//			arr[i] = (int)(Math.random() * 100) + 1;
//		
//		System.out.println(Arrays.toString(arr));
//		
//		for (int i = 0; i < arr.length - 1; i++) {
//			boolean flag = true;
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//					flag = false;				
//				}
//				
//			}
//		}








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
			nameAvg[i] = Math.round((double)nameSum[i] / subjects.length) * 100 / 100.0;
		}
		
		int[] subSum = new int[subjects.length];
		double[] subAvg = new double[subjects.length];
		for(int i = 0; i < subjects.length; i++){
			for(int j = 0; j < score.length; j++){
				subSum[i] += score[j][i];
			}
			subAvg[i] = Math.round((double)subSum[i] / score.length) * 100 / 100.0;
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
