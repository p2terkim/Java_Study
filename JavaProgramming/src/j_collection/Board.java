package j_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Board {

	public static void main(String[] args) {
		/*
		ArrayList와 HashMap을 사용해 게시판 테이블을 만들고
		조회, 등록, 수정, 삭제가 가능한 게시판을 만들어 주세요.
		
		번호(PK), 제목, 내용, 작성자, 작성일
		*/
		
		//조회 : 
//		Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
//		Set keySet() : 저장된 모든 키를 Set으로 반환한다.
		
//		//Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
//				Object value = map.get("b");
//				System.out.println(value); //결과 : 이순신
//				
//				//String 타입으로 반환
//				String value2 = (String)map.get("b");
//				
//				//Set keySet() : 저장된 모든 키를 Set으로 반환한다.
//				Set<String> keys = map.keySet();
//				
//				//Set은 값을 꺼낼 수 있는 수단이 없다.
//				//향상된 for문을 사용하기
//				
//				for(String key : keys){ //keys의 값 전부를 꺼낼 때 까지 반복한다.
//					System.out.println(key + " : " + map.get(key));
//				}
		
		//등록, 수정
//		Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		
		//삭제
//		Object remove(Object key) : 지정된 키로 지정된  값을 제거한다.
		
		
		//데이터 입력 - 행
		HashMap<String, String> r = new HashMap<>();
		
		//테이블에 저장(행추가)
		ArrayList<HashMap<String, String>> t = new ArrayList<>();
		
		//컬럼명을 ArrayList에 작성
		ArrayList<String> col = new ArrayList<>();
		col.add(0, "번호(PK)");
		col.add(1, "제목");
		col.add(2, "내용");
		col.add(3, "작성자");
		col.add(4, "작성일");
		
		String value;
		
		//시작
		Scanner s = new Scanner(System.in);
		int input = 0;
		while(true){
			System.out.println("1.조회\t2.등록\t3.수정\t4.삭제");
			input = Integer.parseInt(s.nextLine());
			
		switch (input) {
		case 1://조회
			System.out.println("======게시판======");
			//번호, 제목 출력
			System.out.println(col.get(0) + "\t" + col.get(1));
			
			for(int i = 0; i < t.size(); i ++){
				//테이블 모든 번호출력
				Object n = t.get(i).get(col.get(0));
				System.out.print(n);
				//테이블 모든 제목 출력
				Object p = t.get(i).get(col.get(1));
				System.out.println("\t" + p);
			}
			System.out.println("==============");
			System.out.println();
			System.out.println();
			
//			//순서 없이 테이블 모든 내용 출력
//			for(int i = 0; i < t.size(); i++){
//			System.out.println(t.get(i));
//			}
			System.out.println("조회하고 싶은 게시글의 번호를 입력해주세요>");
			int num = Integer.parseInt(s.nextLine());
			
			System.out.println("===========게시글==============");
			//글 전체 출력
			//컬럼명 전체 출력
			for (int i = 0; i < col.size(); i++) {
				System.out.print(col.get(i) + "\t");
			}
			System.out.println();
			//테이블 내용 출력
			for(int i = 0; i < col.size(); i++){
				Object n =t.get(num - 1).get(col.get(i));
				System.out.print(n + "\t");
			}
			System.out.println();
			System.out.println("===============================");
			
			System.out.println();
			System.out.println();
			
			//해당 번호의 내용 순서없이 출력
//			System.out.println(t.get(num-1));
			break;
		case 2://등록
			
			r = new HashMap<>();
			
			//번호
			r.put(col.get(0), Integer.toString(t.size() + 1));
			
			//제목
			System.out.println("제목>");
			value = s.nextLine();
			r.put(col.get(1), value);
			
			//내용
			System.out.println("내용>");
			value = s.nextLine();
			r.put(col.get(2), value);		

			//작성자
			System.out.println("작성자>");
			value = s.nextLine();
			r.put(col.get(3), value);
			
			//제목
			System.out.println("작성일>");
			value = s.nextLine();
			r.put(col.get(4), value);
			
			t.add(r);
			break;
		case 3://수정
			System.out.println("======게시판======");
			//번호, 제목 출력
			System.out.println(col.get(0) + "\t" + col.get(1));
			
			for(int i = 0; i < t.size(); i ++){
				//테이블 모든 번호출력
				Object n =t.get(i).get(col.get(0));
				System.out.print(n);
				//테이블 모든 제목 출력
				Object p =t.get(i).get(col.get(1));
				System.out.println("\t" + p);
			}
			System.out.println("==============");
			System.out.println();
			System.out.println();
			
			System.out.println("수정하고 싶은 게시글의 번호를 입력해주세요>");
			num = Integer.parseInt(s.nextLine());
			
			//번호
			r.put(col.get(0), Integer.toString(num));
			
			//제목
			System.out.println("제목>");
			value = s.nextLine();
			r.put(col.get(1), value);
			
			//내용
			System.out.println("내용>");
			value = s.nextLine();
			r.put(col.get(2), value);		

			//작성자
			System.out.println("작성자>");
			value = s.nextLine();
			r.put(col.get(3), value);
			
			//제목
			System.out.println("작성일>");
			value = s.nextLine();
			r.put(col.get(4), value);
			
//			t.remove(num-1);
			t.set(num-1, r);
			
			System.out.println("===========수정글==============");
			//글 전체 출력
			for (int i = 0; i < col.size(); i++) {
				System.out.print(col.get(i) + "\t");
			}
			System.out.println();
			
			for(int i = 0; i < col.size(); i++){
				Object n =t.get(num).get(col.get(i));
				System.out.print(n + "\t");
			}
			System.out.println();
			System.out.println("==============================");
			
			System.out.println();
			System.out.println();
			
			
//			Set<String> keys = r.keySet();
//			for(String key : keys){ //keys의 값 전부를 꺼낼 때 까지 반복한다.
//				System.out.print(key + "\t");
//			}
//			System.out.println();
//			for(String key : keys){ //keys의 값 전부를 꺼낼 때 까지 반복한다.
//				System.out.print(r.get(key) + "\t");
//			}
			
			
			
			break;
		case 4://삭제
			System.out.println("======게시판======");
			//번호, 제목 출력
			System.out.println(col.get(0) + "\t" + col.get(1));
			
			for(int i = 0; i < t.size(); i ++){
				//테이블 모든 번호출력
				Object n =t.get(i).get(col.get(0));
				System.out.print(n);
				//테이블 모든 제목 출력
				Object p =t.get(i).get(col.get(1));
				System.out.println("\t" + p);
			}
			System.out.println("==============");
			System.out.println();
			System.out.println();
			
			System.out.println("삭제하고 싶은 게시글의 번호를 입력해주세요>");
			num = Integer.parseInt(s.nextLine());
			t.remove(num-1);
			break;

			
		}
		}
	
	}
}



























