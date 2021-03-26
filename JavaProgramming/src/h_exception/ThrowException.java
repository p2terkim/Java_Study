package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		
		/*
		예외 발생시키기
		- throw new Exception();
		- throw 예약어와 예외 클래스의 객체로 예외를 발생시킬 수 있다.
		*/
		
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		throw new NullPointerException(); //컴파일 에러가 발생하지 않는다. 예외처리가 강요되지 않는다.
		
		String str = null;
		
		System.out.println(str.equals("abc")); //null과 비교할 수 없기때문에 
		
//		new IndexOutOfBoundsException();
		
		int[] a = new int[10];
		
		for(int i = 0; i <= a.length; i++){
			System.out.println(a[i]);
		}
		
		
	}

}
