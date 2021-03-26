package k_jdbc;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import e_oop.ScanUtil;

public class SelfStudy_board {

	JDBCUtil jdbc = JDBCUtil.getInstance();
//	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");


	public static void main(String[] args) {
		new SelfStudy_board().start();
	}

	//start 메서드
	private void start() {


		while(true) {

			//쿼리문 작성
			String sql = "SELECT BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE FROM TB_JDBC_BOARD";

			//selectList(String sql) 호출 - List<Map<String, Object>> selectList(String sql)를 사용한다.
			List<Map<String, Object>> board = jdbc.selectList(sql);



			//출력
			System.out.println("-----------------------------------");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("-----------------------------------");

//			if(board.size() != 0){

				for(int i = 0; i < board.size();i++){
					Map<String, Object> row = board.get(i);
					System.out.println(row.get("BOARD_NO") + "\t" + row.get("TITLE") + "\t" + row.get("USER_ID") + "\t"+ row.get("REG_DATE"));

				}
//			}
			System.out.println("-------------------------------");
			System.out.print("1.조회\t2.등록\t0.종료>");
			
			int input = ScanUtil.nextInt();
			switch (input) {
			case 1: //조회
				read();
				break;
			case 2: //등록
				insert(board);
				break;
			case 0: //종료
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			}

		}

	}//start 메서드
	private void read() {
		//쿼리문 작성 - select문
		//List 생성 및 

	}

	//insert 메서드
	private void insert(List<Map<String, Object>> board) {
		//글 입력받기
		String boardNo = createBoardNo(board);
//		System.out.print("번호>");
//		int boardNo = ScanUtil.nextInt();
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		System.out.print("작성자>");
		String user = ScanUtil.nextLine();
		//게시글 번호와 작성일자는 자동으로 입력되게 한다.
		
		//쿼리문 작성
		String sql = "INSERT INTO TB_JDBC_BOARD(BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE) VALUES (?,?,?,?,SYSDATE)";
		
		//'param' List 생성 - ?값을 담는다.
		List<Object> param = new ArrayList<>();
		
		param.add(boardNo);
		param.add(title);
		param.add(content);
		param.add(user);
		
		//update(String sql, List<Object> param) 메서드 호출 - int update(String sql, List<Object> param)를 사용한다.
		int result = jdbc.update(sql, param);
		System.out.println("게시글 등록이 완료되었습니다.");
	}//insert 메서드

	private String createBoardNo(List<Map<String, Object>> board) {
		int max = 0;
		for(int i = 0; i < board.size(); i++) {
			Map<String, Object> row = board.get(i);
			int boardNo =  row.get("BOARD_NO");
			if(max < boardNo) {
				max = boardNo;
			}
		}
		return String.valueOf(max + 1);
	}


}



















