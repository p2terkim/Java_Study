package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCTest {

	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance(); //JDBCUtil 객체 생성
		
		
//		// selectList(String sql) 메서드 테스트 
//		//쿼리문 작성
//		String sql = "SELECT * FROM CART WHERE CART_MEMBER = ?";
//		
//		//'param' List 생성 - ?값을 담는다.
//		List<Object> param = new ArrayList<>();
//		
//		param.add("a001");//?의 값
//		
//		//'list' List 초기화 - JDBCUtil의 selectList()메서드 호출하여 초기화
//		List<Map<String, Object>> list = jdbc.selectList(sql, param);
//		
//		if(list.size() < 0){
//			
//		}
//		
//		//list를 출력하여 쿼리문 실행 결과를 출력한다.
//		for(int i = 0; i < list.size(); i++) {
//			Map<String, Object> map = list.get(i);
//			for(String key : map.keySet()){
//				System.out.println(map.get(key) + "\t");
//			}
//			System.out.println();
//		}
		
		
		
		
//		//selectOne(String sql) 메서드 테스트- 한 줄 조회(조회 결과가 한 줄) 
//		
//		String sql = "SELECT * FROM MEMBER WHERE MEM_ID = 'a001'";
//		
//		Map<String, Object> map = jdbc.selectOne(sql);
//		
//		//조회 결과 여부 확인 - hashmap에 데이터가 하나라도 들어있는지 안들어있는지
//		//방법1 보다는 방법 2가 낫다
//		//방법 1
////		if( 0 < map.size()) {
////			
////		}
//		//방법 2 - selectList(String sql) 메서드 테스트에서는 사용할 수 없다. 방법 1을 사용해야한다.
//		if(map == null){//JDBCUtil jdbc = JDBCUtil.getInstance(); //JDBCUtil 객체 생성 부분에서 null로 초기화를 해줘야하는데 그럴 수 없기 때문에 Utill클래스에서 출력을 위한 반복문에서  null로 초기화해주다.
//			
//		}
//		
//		
//		for(String key : map.keySet()) {
//			System.out.print(map.get(key) + "\t");
//		}
		
		
		
		
//		String sql = "SELECT * FROM CART WHERE CART_MEMBER = ? AND CART_QTY < ?";
//		
//		
//		List<Object> param = new ArrayList<>();
//		param.add("a001");
//		param.add(10);
//		
//		System.out.println();
//		System.out.println("----------------------------------------------");
//		//쿼리결과를  jdbc.selectList(sql, param) 메서드를 호출하여 결과를 'list'Lsit에 저장한다.
//		List<Map<String, Object>> list = jdbc.selectList(sql, param);
//		System.out.println("----------------------------------------------");
//		
//		//결과 출력
//		System.out.println("CART_MEMBER\tCART_QTY");
//		for (int i = 0; i < list.size(); i++) {
////			Map<String, Object> map = list.get(i);
////			for(String key : map.keySet()){
//			Map<String, Object> map = list.get(i);
//				System.out.println(map.get("CART_MEMBER") + "\t\t" + map.get("CART_QTY"));
////			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
