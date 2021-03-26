package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		
		
		
		
		
//		int[][] arr = new int[2][3];
//		int arr2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}};
//		int[] arr3[] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};// 이 방법은 선언과 초기화를 반드시 같이 해줘야한다.
//
//		int[][] arr4 = new int[3][]; //가변 배열
//		arr4[0] = new int[3];
//		arr4[1] = new int[4];
//		arr4[2] = new int[10];
//
//		System.out.println(arr[0][1]); //결과 : 0
//
//		//arr[0] = 10; //값을 저장할 수 없다.
//		arr[0] = new int[5]; //배열을 저장해야 한다.
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[1][0] = 100;
//
//		System.out.println(Arrays.toString(arr[0])); //결과 : [10, 20, 0, 0, 0]
//		System.out.println(Arrays.toString(arr[1])); //결과 : [100, 0, 0]
//		System.out.println(arr.length); //1차원 배열의 길이, 결과 : 2
//		System.out.println("arr[0].length : " + arr[0].length); //2차원 배열의 길이, 결과 : 5
//		System.out.println("arr[1].length : " + arr[1].length); //2차원 배열의 길이, 결과 : 3
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.println(arr[i][j]);// 결과 : 10 20 0 0 0 100 0 0
//			}
//		}
//
//		System.out.println(Arrays.toString(arr)); //주소가 출력된다. 결과 : [[I@5c3f1224, [I@30c028cc]
//		System.out.println(Arrays.toString(arr[0])); //결과 : [10, 20, 0, 0, 0]
//		System.out.println(Arrays.toString(arr[1])); //결과 : [100, 0, 0]
		
		
		
		
		
		
		
		
		
		
		

/*
 * 다차원 배열
 * - 배열 안에 배열이 저장되어 있는 형태이다.
 * - 3차원 이상은 잘 사용하지 않는다.
 */

////2차원
//int[][] array2;
//
////3차원
//int[][][] array3;
//
///*
// * {주소1, 주소2}
// * 
// * 주소1
// * {0, 0, 0}
// * 
// * 주소2
// * {0, 0, 0}
// */
//
//int[][] arr = new int[2][3];
//int arr2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}};
//int[] arr3[] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};// 이 방법은 선언과 초기화를 반드시 같이 해줘야한다.
//
//int[][] arr4 = new int[3][]; //가변 배열
//arr4[0] = new int[3];
//arr4[1] = new int[4];
//arr4[2] = new int[10];
//
//System.out.println(arr[0][1]);
//
////		arr[0] = 10; //값을 저장할 수 없다.
//arr[0] = new int[5]; //배열을 저장해야 한다.
//arr[0][0] = 10;
//arr[0][1] = 20;
//arr[1][0] = 100;
//
//System.out.println(arr.length); //1차원 배열의 길이
//System.out.println(arr[0].length); //2차원 배열의 길이
//System.out.println(arr[1].length); //2차원 배열의 길이
//
//for (int i = 0; i < arr.length; i++) {
//	for (int j = 0; j < arr[i].length; j++) {
//		System.out.println(arr[i][j]);
//	}
//}
//
//System.out.println(Arrays.toString(arr)); //주소가 출력된다.
//System.out.println(Arrays.toString(arr[0])); 
//System.out.println(Arrays.toString(arr[1])); 
		
		//연습1. 
//		int[][] scores = new int[3][5]; // int[학생수][과목수]
//		int[] sum = new int[scores.length]; //합계
//		double[] avg = new double[scores.length]; //평균
//		
//		for (int i = 0; i < scores.length; i++) {
//			for (int j = 0; j < scores[i].length; j++) {
//				scores[i][j] = (int)(Math.random() * 101);
//				sum[i] += scores[i][j];
//			}
//			System.out.println(Arrays.toString(scores[i]));
//			avg[i] = sum[i]/(double) scores[i].length;
//		}
//		System.out.println("합계 : " + Arrays.toString(sum));
//		System.out.println("평균 : " + Arrays.toString(avg));

		
int[][] scores = new int[3][5]; // int[학생수][과목수]
int[] sum = new int[scores.length]; //합계
double[] avg = new double[scores.length]; //평균

for (int i = 0; i < scores.length; i++) {
	for (int j = 0; j < scores[i].length; j++) {
		scores[i][j] = (int)(Math.random() * 101);
	}
	System.out.println(Arrays.toString(scores[i]));
}
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length; j++) {
				sum[i] += scores[i][j];
			}
			avg[i] = (double)sum[i] / scores[i].length;
			System.out.println("합계 : " + sum[i] + " / 평균 : " + avg[i]);
		}
	}
}

























