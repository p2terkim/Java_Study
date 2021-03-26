package d_array;

import java.util.Arrays;


public class test {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));

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

		System.out.println(Arrays.toString(temp));


		int[] result = new int[count];
		for (int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));
		
		
	}

}
