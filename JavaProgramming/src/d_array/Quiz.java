package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {

		//거스름돈 동전 갯수(몇 개의 동전일 필요한지 알아내기)

		int money = (int)(Math.random() * 500) * 10;
		int[] coin = {500, 100, 50, 10};
		System.out.println("거스름돈 : " + money);

		/*
		 * 연습 1. 거스름돈에 동전의 단위마다 몇 개의 동전이 필요한지 출력해주세요.
		 * 
		 * 거스름돈  : 2860원
		 * 500원 : 5개
		 * 100원 3개;
		 * 50원 : 1개
		 * 10원 : 1개
		 */

		//나
		/*int[] count = new int[coin.length];

for (int i = 0; i < count.length; i++) 
	count[i] = 0;

while(money != 0){
	for (int i = 0; i < coin.length; i++) {
		if(money / coin[i] != 0){
			count[i] = money / coin[i];
			money %= coin[i];
		}
	}
}

for (int j = 0; j < count.length; j++)
	System.out.println(coin[j] + "원 : " + count[j] + "개");*/

		//쌤

		/*for (int i = 0; i < coin.length; i++) {
	System.out.println(coin[i] + "원 : " + money / coin[i] + "개");
	money %= coin[i];
}*/


		//연습 2. 그래프 그리기
	
		/*
		 * 1~5사이의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요.
		 * 
		 * 1 : *** 3
		 * 2 : ****4
		 * 3 : **2
		 * 4 : *****5
		 * 5 : ******6
		 */
		
/*		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5) + 1;
		}

		System.out.println(Arrays.toString(arr));*/

		//나
		//*의 개수를 담을 배열(count) 생성
		/*int[] count = new int[5];
		
		for (int i = 0; i < count.length; i++) 
			count[i] = 0;
		
		for (int i = 0; i < count.length; i++) { //배열(count)의 길이 만큼 반복
			
			int index = i; //배열(count)의 인덱스 번호를 다룰 변수(index) 생성
			
			for (int j = 0; j < arr.length; j++) { //배열(arr)의 길이 만큼 반복
				if (arr[j] == index + 1) count[i]++; //배열(count)의 인덱스 번호 + 1 과 배열(arr)의 값이 일치하면 count[i]의 값을 1증가 시킨다.
			}
		}
		
		for (int i = 0; i < count.length; i++) {
			System.out.print((i+1) + " : " );
		
			for (int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
			
			System.out.println(" " + count[i]);
		}*/
				
				
				//쌤
		/*int[] count = new int[5];
		
		for (int i = 0; i < arr.length; i++){
			count[arr[i] - 1]++;
		}
		for (int i = 0; i < count.length; i++) {
			System.out.print( i + 1 + " : " );
		
			for (int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
			
			System.out.println(" " + count[i]);
		}*/


		
		
		
		//연습 3. 배열에 중복된 숫자 제거
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5) + 1;
		}
		
		System.out.println(Arrays.toString(arr));	
		/*
		 * 1~5사이 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요
		 * [3, 3, 2, 2, 4, 3, 2, 5, 2, 2]
		 * [3, 2, 4, 5]
		 */
		
		
		/*int count = 0;
		int index = -1;
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 0;					
				}	
			}
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				count++;
			}
		}
		System.out.println(count);
		
		int[] result = new int[count];
		
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 0) {
				index ++;
				result[index] = arr[j];
			}
		}
	
		System.out.println(Arrays.toString(result));*/

		
//쌤
// 5개의 중복되지 않는 값만 출력
int[] temp = new int[5];
int count = 0;
for (int i = 0; i < temp.length; i++) {
	boolean flag = true;
	for (int j = 0; j < temp.length; j++) {
		if(arr[i] == temp[j]){
			flag = false;
		}
	}
	if(flag){
		temp[count++] = arr[i];
	}
}

System.out.println(">" + Arrays.toString(temp));

//숫자와 같은 길이의 배열에 저장
int[] result = new int[count];
for (int i = 0; i < result.length; i++) {
	result[i] = temp[i];
}
System.out.println(Arrays.toString(result));
		
		
		
	}
}


















