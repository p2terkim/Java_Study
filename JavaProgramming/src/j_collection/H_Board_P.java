package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class H_Board_P {
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	/*
	 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
	 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
	 * 
	 * 번호(PK), 제목, 내용, 작성자, 작성일
	 * 
	 */
	
	
	//main 메서드
	public static void main(String[] args) {
		
		new H_Board_P().start();
	}
	private void start() {
		ArrayList<HashMap<String, Object>> boardList = new ArrayList<>();
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("-------------------------------");
			for(int i = boardList.size() - 1; i >= 0; i--) {
				HashMap<String, Object> board = boardList.get(i);
				System.out.println(board.get("board_no")
						+ "\t" + board.get("title")
						+ "\t" + board.get("user")
						+ "\t" + format.format(board.get("reg_date")));
			}
			System.out.println("-------------------------------");
			System.out.print("1.조회\t2.등록\t0.종료>");
			int input = ScanUtil.nextInt();
			switch(input) {
				case 1: //조회
					read(boardList);
					break;
				case 2: //등록
					insert(boardList);
					break;
				case 0:
					System.out.println("프로그램이 종료되었습니다.");
					System.exit(0);
					break;
			}
			
		}
		
	}
	
	//read 메서드 
	private void read(ArrayList<HashMap<String, Object>> boardList) {
		System.out.println("조회할 게시글 번호");
		String bn = ScanUtil.nextLine();
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		//'board' HashMap 생성 및 null값으로 초기화
		HashMap<String, Object> board = null;
		
		//게시글 크기만큼 반복
		for(int i = 0; i < boardList.size(); i++) {
			board = boardList.get(i);
			if(board.get("board_no").equals(bn)){
				break;
			}
		}
		
		//조회할 게시글 출력
		System.out.println("-------------------------------");
		System.out.println("번호\t: " + board.get("board_no"));
		System.out.println("작성자\t: " + board.get("user"));
		System.out.println("작성일\t: " +  format.format(board.get("reg_date")));
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
	
	//update 메서드
	private void update(HashMap<String, Object> board) {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.println("내용>");
		String content = ScanUtil.nextLine();
		
		board.put("title", title);
		board.put("content", content);
		
		System.out.println("수정이 완료되었습니다.");
	}
	
	//delete 메서드
	private void delete(ArrayList<HashMap<String, Object>> boardList,
			HashMap<String, Object> board) {
		for(int i = 0; i < boardList.size(); i++){
			if(boardList.get(i).get("board_no").equals(board.get("board_no"))) {
				boardList.remove(i);
				System.out.println("삭제가 완료되었습니다.");
				break;
			}
		}
		
	}
	//insert 메서드
	private void insert(ArrayList<HashMap<String, Object>> boardList) {
		//글 입력 받기
		String boardNo = createBoardNo(boardList);
		System.out.println("제목>");
		String title = ScanUtil.nextLine();
		System.out.println("내용>");
		String content = ScanUtil.nextLine();
		System.out.println("이름");
		String user = ScanUtil.nextLine();
		
		//'board' HashMap에 입력받은 글 저장
		HashMap<String, Object> board = new HashMap<>();
		board.put("board_no", boardNo);
		board.put("title", title);
		board.put("content", content);
		board.put("user", user);
		board.put("reg_date", new Date());
		
		//'boardList'에 'board'객체 저장
		boardList.add(board);
		System.out.println("게시글 등록이 완료되었습니다.");
	}
	
	//createBoardNo 메서드 - 게시글 번호 생성
	private String createBoardNo(ArrayList<HashMap<String, Object>> boardList) {
		int max = 0;
		for(int i = 0; i < boardList.size(); i++) {
			int boardNo = Integer.parseInt((String)boardList.get(i).get("board_no"));
			if(max < boardNo) {
				max = boardNo;
			}
		}
		return String.valueOf(max + 1);
	}

}
