package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;
import j_collection.H_Board;

public class JDBCBoard {
	
	
	//메인 메서드
	public static void main(String[] args) {
		
		new JDBCBoard().start();
		
	}//메인 메서드
	
	//start 메서드
	private void start() {
		
		//DB 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc18"; //사용자 계정
		String password = "java"; //계정 비밀번호
		
		DBConnection dbc = new DBConnection(url, user, password);
		
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		while(true){
			System.out.println("-------------------------------");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("-------------------------------");

			
			
			System.out.println("-------------------------------");
			System.out.print("1.조회\t2.등록\t0.종료>");
			
			
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1: //조회
				read(boardList);
				break;
			case 2: //등록
				insert(boardList);
				break;
			case 0: //종료
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			}
		}
	}//start 메서드
	

		//read 메서드
		private void read(ArrayList<HashMap<String, Object>> boardList) {
			System.out.print("조회할 게시글 번호>");
			String bn = ScanUtil.nextLine();
			
			HashMap<String, Object> board = null;
			for(int i = 0; i < boardList.size(); i++){
				board = boardList.get(i);
				if(board.get("board_no").equals(bn)){
					break;
				}
			}
			
			System.out.println("-------------------------------");
			System.out.println("번호\t: " + board.get("board_no"));
			System.out.println("작성자\t: " + board.get("user"));
			System.out.println("작성일\t: " + board.get("reg_date"));
			System.out.println("제목\t: " + board.get("title"));
			System.out.println("내용\t: " + board.get("content"));
			System.out.println("-------------------------------");
			System.out.print("1.수정\t2.삭제\t0.목록>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1: //수정
				update(board);
				break;
			case 2: //삭제
				delete(boardList, board);
				break;
			case 0: //목록
				
				break;
			}
		}

		//delete 메서드
		private void delete(ArrayList<HashMap<String, Object>> boardList,
				HashMap<String, Object> board) {
			for(int i = 0; i < boardList.size(); i++){
				if(boardList.get(i).get("board_no").equals(board.get("board_no"))){
					boardList.remove(i);
					System.out.println("삭제가 완료되었습니다.");
					break;
				}
			}
		}
		
		//update 메서드
		private void update(HashMap<String, Object> board) {
			System.out.print("제목>");
			String title = ScanUtil.nextLine();
			System.out.print("내용>");
			String content = ScanUtil.nextLine();
			
			board.put("title", title);
			board.put("content", content);
			
			System.out.println("수정이 완료되었습니다.");
		}

		//insert 메서드
		private void insert(ArrayList<HashMap<String, Object>> boardList) {
			String boardNo = createBoardNo(boardList);
			System.out.print("제목>");
			String title = ScanUtil.nextLine();
			System.out.print("내용>");
			String content = ScanUtil.nextLine();
			System.out.print("이름>");
			String user = ScanUtil.nextLine();
			
			HashMap<String, Object> board = new HashMap<>();
			board.put("board_no", boardNo);
			board.put("title", title);
			board.put("content", content);
			board.put("user", user);
			board.put("reg_date", new Date());
			
			boardList.add(board);
			System.out.println("게시물 등록이 완료되었습니다.");
		}

		//createBoardNo 메서드
		private String createBoardNo(ArrayList<HashMap<String, Object>> boardList) {
			int max = 0;
			for(int i = 0; i < boardList.size(); i++){
				int boardNo = Integer.parseInt((String)boardList.get(i).get("board_no"));
				if(max < boardNo){
					max = boardNo;
				}
			}
			
			return String.valueOf(max + 1);
		}
}
