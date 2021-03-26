package e_oop.restaurant;

import java.util.Arrays;

public class Boss {

	public static void main(String[] args) {
		
		Alba alba = new Alba(); //알바 한 명 생성
		
		String[] order = alba.order(); //알바 주문 받기. "주문하시겠습니까?" + 주문내용(짜장면, 탕수육 )배열에 저장
		System.out.println(Arrays.toString(order)); // 배열 내용(주문 받은 내역) 출력
		
		System.out.println("요리 만드는 중...완성!!!"); 
		String[] foods = {"완성된 짜장면", "완성된 탕수육"}; 
		
		alba.serve(foods); //알바 서빙하기. foods(완성된 음식)을 매개변수로 입력 + "맛있게 드세요" 출력됨
		
		alba.pay(order); //알바 계산하기. order(주문 받은내역)을 매개변수로 입력 + "2만원 입니다. 안녕히가세요." 출력됨
		
	}

}
