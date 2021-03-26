package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		/*
		 * 배열
		 * - 여러 개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입이다.(값들의 주소를 저장)
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경할 수 없다.
		 * - 배열은 같은 타입의 값만 저장 가능하다.
		 */
		
		int[] array;// 변수 선언 : 배열의 주소를 저장할 공간이 만들어진다. int array[] 같은 의미
		array = new int[5]; //배열 초기화 : 배열이 생성되고 그 주소가 저장된다.
		
		/*
		 * 변수  = 주소
		 * 주소 {0, 0, 0, 0, 0}
		 */
				
		//배열 초기화시 기본값이 저장된다.
		
		/*
		 * 기본값
		 * - byte, short, int, long : 0
		 * - float, double : 0.0
		 * - char : 0(' ')사실살 공백
		 * - boolean : false
		 * - 참조형타입 : null 
		 */
		
		array = new int[]{1, 2, 3, 4, 5};
		
//		array = {1, 2, 3, 4, 5}; // 이 방법은 선언과 초기화를 동시에 해야한다,
		int[] array2 = {1, 2, 3, 4, 5};
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		array[0] = 10; //지정된 인덱스에 값을 저장
		array[1] = 20; //지정된 인덱스에 값을 저장
		array[2] = 30; //지정된 인덱스에 값을 저장
		array[3] = 40; //지정된 인덱스에 값을 저장
		array[4] = 50; //지정된 인덱스에 값을 저장
		
		
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		
		for(int i = 0; i < array.length; i++){
			array[i] = (i + 1) * 10;
		}
		
		//연습1. 10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		int[] randoms = new int[10];
		System.out.println("배열 randoms의 길이 : " + randoms.length);
		
		//연습2. 배열의 모든 인덱스에 1~100 사이의 랜덤한 값을 저장해주세요.
		
		for (int i = 0; i <randoms.length; i++){
		 randoms[i] = (int) (Math.random() * 100) + 1;
//		 System.out.println("randoms[" + i + "] : " + randoms[i]);
		}
		
		System.out.println(Arrays.toString(randoms)); //배열의 모든 값들을 문자열로 출력해준다.
		System.out.println(randoms); //배열의 주소
		
		//연습3. 배열에 저장된 모든 값의 합계와 평균을 구해주세요.
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < randoms.length; i++)
			sum += randoms[i];
		
		avg = (double) sum / randoms.length;
		
		System.out.println("합계 : " + sum + "/ 평균 : " + avg);
				 
		//연습4. 배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		
		/////////나
//		int temp = 0;
		
//		for (int i = 0; i < randoms.length - 2 ; i++){
//			for(int j = 0; j < randoms.length - 1 - i; j++ ){
//				if( randoms[j] > randoms[j + 1]){
//					int temp = randoms[j];
//					randoms[j] = randoms[j+1];
//					randoms[j+1] = temp;
//					System.out.println(Arrays.toString(randoms));
//				}
//			}
//		}
//		
////		System.out.println(Arrays.toString(randoms));
//		System.out.println("최소값 : " + randoms[0]);
//		System.out.println("최대값 : " + randoms[randoms.length - 1]);
		
		
		////////쌤
		int min = randoms[0];
		int max = randoms[0];
		
		for(int i = 0; i < randoms.length; i++){
			if(randoms[i] < min){
				min = randoms[i];
			}
			if(max < randoms[i]){
				max = randoms[i];
			}
		}
		System.out.println("min : " + min + "/ max : " + max);
		System.out.println(Arrays.toString(randoms));

		// 연습5. 1부터 10 사이의 랜덤한 숫자에 해당하는 배열 shuffle의 인덱스 번호와 shuffle[0]의 값을 바꿔라.
		int[] shuffle = new int[10];
		
		for(int i=0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		for(int i =0; i < shuffle.length; i++ ){
			int random = (int)(Math.random() * shuffle.length);
			
			int temp = shuffle[0];
			shuffle[0] = shuffle[random];
			shuffle[random] = temp;
		}
		System.out.println(Arrays.toString(shuffle));

		
		//연습6.  1~10사이의 랜덤 값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요
//		int[] num = new int[500];
//		int[] n = new int[10];
		
//		int n1 = 0;
//		int n2 = 0;
//		int n3 = 0;
//		int n4 = 0;
//		int n5 = 0;
//		int n6 = 0;
//		int n7 = 0;
//		int n8 = 0;
//		int n9 = 0;
//		int n10 = 0;
//		int total = 0;
		
					
//		for (int i = 0; i < num.length; i++){
//			num[i] = (int)(Math.random() * 10) + 1;			
//			if (num[i] == 1) n[0]++;
//			if (num[i] == 2) n[1]++;
//			if (num[i] == 3) n[2]++;
//			if (num[i] == 4) n[3]++;
//			if (num[i] == 5) n[4]++;
//			if (num[i] == 6) n[5]++;
//			if (num[i] == 7) n[6]++;
//			if (num[i] == 8) n[7]++;
//			if (num[i] == 9) n[8]++;
//			if (num[i] == 10) n[9]++;
				
//		}
//		total = n1 + n2+ n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
//		System.out.println(Arrays.toString(num));
//		for(int i = 0; i <= 9; i++){
//		System.out.println(i + "의 개수 : " + n[i]);
//		}
//		System.out.println("2의 개수 : " + n[2]);
//		System.out.println("3의 개수 : " + n[3]);
//		System.out.println("4의 개수 : " + n[4]);
//		System.out.println("5의 개수 : " + n5);
//		System.out.println("6의 개수 : " + n6);
//		System.out.println("7의 개수 : " + n7);
//		System.out.println("8의 개수 : " + n8);
//		System.out.println("9의 개수 : " + n9);
//		System.out.println("10의 개수 : " + n10);

//		System.out.println(total);
		
		/////나
//		int[] num = new int[500];
//		int[] n = new int[10];
//		
//		for (int i = 0; i < num.length; i++)
//			num[i] = (int)(Math.random() * 10) + 1;	
//		
//		for (int j = 0; j < num.length; j++){
//			num[j] = (int)(Math.random() * 10) + 1;	
//			for (int k = 1; k <= 10; k++)
//				if (num[j] == k) n[k-1]++;	
//		}
//		
//		System.out.println(Arrays.toString(num));
//				
//		for(int i = 1; i <= 10; i++)
//			System.out.println(i + "의 개수 : " + n[i-1]);
//		
		
		
		int[] counts = new int[10];
		
		for(int i = 0; i < 500; i++){
			int random = (int)(Math.random() * 10) + 1;
		
//			if(random == 1) count[0]++;
//			if(random == 2) count[1]++;
//			if(random == 3) count[2]++;
			counts[random - 1]++;
		}
		
		System.out.println(Arrays.toString(counts));

		
	}

}
