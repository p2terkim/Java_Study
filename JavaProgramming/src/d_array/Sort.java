package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * 석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 * 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식(최소값을 찾아서 맨 앞으로 보내는 방식)
		 * 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * 삽입정렬 : 두 번째 숫자부터 앞의 숫자들과 비교해서 큰 수는 뒤로 밀고 중간에 삽입하는 방식
		 */

		//석차 구하기
		/*int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));


		int[] rank = new int[arr.length];

		for(int i = 0; i < rank.length; i++){
			rank[i] = 1;
		}

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[i] < arr[j]){
					rank[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(rank));*/




		//선택 정렬
		/*
		 * i,j
		 * 0,1	0,2	0,3	0,4	0,5	0,6	0,7	0,8	0,9
		 * 1,2	1,3	1,4	1,5	1,6	1,7	1,8	1,9
		 * 2,3	2,4	2,5	2,6	2,7	2,8	2,9
		 * 3,4	3,5	3,6	3,7	3,8	3,9
		 * 4,5	4,6	4,7	4,8	4,9
		 * 5,6	5,7	5,8	5,9
		 * 6,7	6,8	6,9
		 * 7,8	7,9
		 * 8,9
		 */
		
		/*나
		int[] arr = new int[10];// 길이 10인 'arr' 배열 생성
		int temp = 0;
		int min; // 인덱스 번호 변수 생성

		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		} // 배열'arr'에 1~100 랜덤 값 저장 
		System.out.println(Arrays.toString(arr));

		for(int i = 0; i < arr.length - 1; i++){ // arr 배열의 마지막에서 두번째 값까지 실시하면 마지막 값은 수행할 필요가 없으므로 arr.length - 1 
			min = i;// min 에 arr배열에서 비교의 기준이 되는 인덱스 번호 부여
			for(int j = i + 1 ; j < arr.length; j++){
				if( arr[j] < arr[min] ){ // 인덱스 번호의 값들을 비교
					min = j; // 값이 작은 인덱스의 번호 교환을 반복하여 최소값을 찾는다.
				}
			}
			// 최소값을 가진 인덱스 번호와 arr[i]의  인덱스번호(i)와 교환한다.
				temp = arr[min]; 
				arr[min] = arr[i];
				arr[i] = temp;
				System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));*/

		/*쌤
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		} // 배열'arr'에 1~100 랜덤 값 저장 
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length - 1; i++){
			int min = i; //최소값의 위치를 저장
			for(int j = i + 1 ; j < arr.length; j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			int temp = arr[i]; 
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println(Arrays.toString(arr));
		*/
	
	
	
		//버블 정렬
		/*
		 * i,j
		 * 0,1	1,2   2,3   3,4   4,5   5,6   6,7   7,8   8,9
		 * 0,1	1,2   2,3   3,4   4,5   5,6   6,7   7,8
		 * 0,1	1,2   2,3   3,4   4,5   5,6   6,7   
		 * 0,1	1,2   2,3   3,4   4,5   5,6   
		 * 0,1	1,2   2,3   3,4   4,5  
		 * 0,1	1,2   2,3   3,4    
		 * 0,1	1,2   2,3   
		 * 0,1	1,2
		 * 0,1  
		 */
		//나
		/*int[] arr = new int[10];

		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i = arr.length - 1; i > 0; i--){
			for(int j = 0; j < i ; j++){
				if(arr[j] > arr[j+1]){//결국에는 큰수가 뒤로 가야하니까(오름차순)
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	
		
		for(int i = 0; i < arr.length; i++){
			
		}*/
		
		
		//쌤
		/*int[] arr = new int[10];

		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length - 1; i++){
			boolean flag = true;
			for(int j = 0; j < arr.length - 1 - i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = false;
				}
			}
			if(flag){
				break;
			}System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));*/
		
		
		
		
		//삽입정렬 
		/*
		 * i,j
		 *    
		 * 1,0	
		 * 2,1	2,0
		 * 3,2  3,1  3,0
		 * 4,3  4,2  4,1  4,0 
		 * 5,4  5,3  5,2  5,1  5,0
		 * 6,5	6,4	 6,3  6,2  6,1  6,0
		 * 7,6  7,5  7,4  7,3  7,2  7,1  7,0
		 * 8,7  8,6  8,5  8,4  8,3  8,2  8,1  8,0
		 * 9,8  9,7  9,6  9,5  9,4  9,3  9,2  9,1  9,0	
		 */
		
	/*	int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i = 1; i < arr.length; i++){ // 배열길이 - 1 만큼 회전하므로 0 <= i < 배열길이-1
			for(int j = i ; j > 0; j--){
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
							
				}
				System.out.println(Arrays.toString(arr));

			}
		}
	
		System.out.println(Arrays.toString(arr));*/
	
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));
	
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = 0;
			System.out.println(">" + Arrays.toString(arr));
			for (j = i - 1; j >= 0; j--) {
				if (temp < arr[j]) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}

			}
			arr[j + 1] = temp;
			System.out.println(">>>" + Arrays.toString(arr));

		}

		System.out.println(Arrays.toString(arr));
	
	
	
		/*
		for(int i = 0; i <= 8; i++){
			for(int j = i + 1; j <= 9; j++){
				System.out.print(i + ","+ j + "  ");
			}
			System.out.println();
		}
		
		
		0,1  0,2  0,3  0,4  0,5  0,6  0,7  0,8  0,9  
		1,2  1,3  1,4  1,5  1,6  1,7  1,8  1,9  
		2,3  2,4  2,5  2,6  2,7  2,8  2,9  
		3,4  3,5  3,6  3,7  3,8  3,9  
		4,5  4,6  4,7  4,8  4,9  
		5,6  5,7  5,8  5,9  
		6,7  6,8  6,9  
		7,8  7,9  
		8,9  
	
	
		for(int i = 0; i <= 8; i++){
			for(int j = i + 1; j <= 9; j++){
				
				System.out.print(i + ","+ j + "  ");
			}
			System.out.println();
		}*/
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
/*temp = arr[j];
arr[j] = arr[i];
arr[i] = temp;*/





