package j_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
		
		/*
		Collections Framework : 다수의 데이터를 다루기 위한 표준화된 방법
		- List
		- Map
		- Set
		
		자주 사용되는 메서드
		- boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		- void add(int index, Objext obj) : 지정된 위치에 객체를 추가한다.
		- Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.
		- Object get(int index) : 지정된 위치의 객체를 반환한다.
		- int size() : 저장된 객체의 수를 반환한다.
		- boolean remove(int index) : 저장된 위치의 객체를 제거한다.
		*/
		
		/*
		byte : Byte
		short : Short
		int : Integer
		long : Long
		double : Double
		char : Character
		boolean : Boolean
		서로 자동으로 형변환된다. 연산도 가능하다.
		 */
		
//		ArrayList를 사용하기위해서 먼저 객체 생성 부터 해준다.
		
		ArrayList sample = new ArrayList();//아무 값이 없는 처음에는 길이가 0 인 상태
		
		sample.add("abc"); //문자열 하나 저장
		sample.add(100); //정수 하나 저장
		sample.add(new Scanner(System.in)); //타입에 상관없이 내가 저장하고 싶은건 다 저장한다. 하지만 기본형만의 저장은 안된다. 객체만 저장 가능하다.. 우리가 저장한건 Integer, String타입의 객체를 저장한 것.
		
		
		//제네릭
		ArrayList<Integer> list = new ArrayList<>(); //해당 ArrayList에 저장할 타입을 지정해주는 것.(여기서는 Integer타입을 저장할 수 있게 했다.)
		list.add(10); //10 문제 없이 저장됨
//		list.add("abc"); // 컴파일 에러 맞는 타입이 아니다. 문자열은 저장안됨
		list.add(20);
		System.out.println(list.add(30));
		System.out.println(list); //결과 : [10, 20, 30]
		
		
		list.add(1, 40);//1번 인덱스부터 뒤로 밀고 값(40)을 저장한다.
		System.out.println(list); //결과 : [10, 40, 20, 30]

		
//		list.add(5, 50); //현재  list의 길이가 4이지만 5번 인덱스에 값을 저장했다. 컴파일에러 발생안함, 저장되어있는 인덱스를 벗어나는 위치에 저장할 수 없다.
		System.out.println(list); //결과 : 오류 발생, 출력이 안된다.
		

		Integer before = list.set(2, 50);
		System.out.println("before : "+before); //결과 : before : 20
		System.out.println("after : "+ list.get(2)); //결과 : after : 50
		System.out.println(list); //결과 : [10, 40, 50, 30]
				
		Integer integer = list.get(2); //2번 인덱스의 객체를 반환한다.
		System.out.println(integer);//결과 : 50
		
//		for(int i = 0; i < list.size(); i++){
//			System.out.println(i + " : " + list.get(i));
//			
//			list.remove(i);//해당 위치의 인덱스의 값을 제거할 수 있다.
//		}
//		//결과 : 
//		//0 : 10
//		//1 : 50
//		System.out.println(list);//결과 : [40, 30]
		
//		-----------------------------------------------------------
		//왜 이런 결과가 나올까?
		//처음 list인 [10, 40, 50, 30]
		//0번 인덱스 지우기  ->  [40, 50, 30]
		//1번 인덱스 지우기  ->  [40, 30]

		
		//결국 값을 전부 제거하기 위해서는 뒤에서부터 제거해야한다.
		for (int i = list.size() - 1; 0 <= i; i--) {
			System.out.println(i + " : " + list.get(i));
			list.remove(i);
		}
		System.out.println(list); //결과 : []
		
		
		//연습1. ArrayList 객체 list1을 생성하고  1~100 사이의 랜덤값을 10개 저장해 주세요
		
ArrayList<Integer> list1 = new ArrayList<>();

for(int i = 0; i < 10; i++){
	list1.add(i, (int)(Math.random() * 100) + 1);
}
System.out.println(list1);
		
		//연습2. list1에 저장된 값의 합계와 평균을 출력해주세요.
int sum = 0;
double avg = 0;

for (int i = 0; i < list1.size(); i++) {
	sum += list1.get(i);
}
avg = (double) sum / list1.size();

System.out.println("합계 : " + sum + " / 평균 : " + avg);
System.out.println();
	
		//연습3. list1에서 최소값과 최대값을 출력해주세요.

int min = list1.get(0);
int max = list1.get(0);
for(int i = 0; i < list1.size(); i++){
	if(list1.get(i) < min){
		min = list1.get(i);
	}
	if(max < list1.get(i)){
		max = list1.get(i);
	}
}
System.out.println(list1);
System.out.println("min : " + min + "/ max : " + max);
		
		
		//연습4. list1을 오름차순으로 정렬해주세요
//		int temp;
//		for (int i = 0; i < list1.size() - 1; i++) {
//			for (int j = i; j < list1.size() - 1; j++) {
//				if(list1.get(j) > list1.get(j+1)){
//					temp = list1.get(j);
//					list1.set(j,list1.get(j+1));
//					list1.set(j+1,temp);
//					
//				}
//			}
//		}
//		
//		System.out.println(list1);
		
//삽입정렬
for (int i = 0; i < list1.size() - 1; i++) {
	min = i;
	for (int j = i+1; j < list1.size(); j++) {
		if(list1.get(j) < list1.get(min)){
			min = j;
		}
	}
	int temp = list1.get(i);
	list1.set(i, list1.get(min));
	list1.set(min, temp);
}
System.out.println(list1);
		
		
		
		
		//2차원 ArrayList 배열
ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

//변수 재사용
list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);

list2.add(list);

list = new ArrayList<>();
list2.add(list);
list.add(40);
list.add(50);

System.out.println(list2);

//모든 값 가져오기

for(int i = 0; i < list2.size(); i++){
	ArrayList<Integer> li = list2.get(i);
	for (int j = 0; j < li.size(); j++) {
		System.out.println(li.get(j) + "\t");
	}
	System.out.println();
}

//하나의 값 가져오기 - list2의 0번 인덱스 배열의 1번 인덱스 값 가져오기 
Integer integer2 = list2.get(0).get(1);
System.out.println(integer2);

Float f = new Float("1");
System.out.println(f);
	}

}



















