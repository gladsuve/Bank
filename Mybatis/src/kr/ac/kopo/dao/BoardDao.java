package kr.ac.kopo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.MyConfig;
import kr.ac.kopo.vo.BoardVO;

public class BoardDao {
	private SqlSession session;

	public BoardDao() {
		session = new MyConfig().getInstance();
		System.out.println("session " + session);
	}

	public void insert() {

		BoardVO board = new BoardVO();
		board.setTitle("mybatis 삽입3");
		board.setWriter("user");
		board.setContent("삽입완료하였습니다");

		session.insert("dao.BoardDao.insertBoard", board);
		session.commit();
		System.out.println("삽입완료...");
	}

	public void select() {
		List<BoardVO> boardList = session.selectList("dao.BoardDao.selectAllBoard");

		for (BoardVO board : boardList)
			System.out.println(board);

	}

	public void selectOne() {

		BoardVO vo = new BoardVO();
		vo.setNo(37);

//		BoardVO board = session.selectOne("dao.BoardDao.selectByNo", 37);
//		BoardVO board = session.selectOne("dao.BoardDao.selectByNo2", vo);
		BoardVO board = session.selectOne("dao.BoardDao.selectByNo3", vo);
		System.out.println(board);
	}

	public void selectWhere() {
		List<BoardVO> list = session.selectList("dao.BoardDao.selectWhere", "제목");
		for (BoardVO vo : list) {
			System.out.println(vo);
		}
	}

	
	  public void selectWhere2() { 
		  BoardVO vo = new BoardVO();
		  // 1번 : 제목 mybatis 삽입 and 작성자 user
//		  vo.setTitle("mybatis 삽입"); 
//		  vo.setWriter("user");
	  
		  // 2번 : 제목 mybatis 삽입
//		  vo.setTitle("mybatis 삽입"); 
		  
		  // 3번 : 작성자 user
		  vo.setWriter("user");
		  
		  List<BoardVO> list = session.selectList("dao.BoardDao.selectWhere2", vo);
		  for(BoardVO board : list) {
			  System.out.println(board);
	  	}
	 }
	  
	  public void selectNos() {
		  //1, 2, 6, 10, 15, 19, 24, 30, 33번에 속한 게시물 조회
		  
		  int[] nos = {1, 2, 6, 10, 15, 19, 24, 30, 33};
		  
		  BoardVO vo = new BoardVO();
		  vo.setNos(nos);
		  
		  List<BoardVO> list = session.selectList("dao.BoardDao.selectNos", vo);
//		  List<BoardVO> list = session.selectList("dao.BoardDao.selectNos2", vo);
		  for(BoardVO board : list) {
			  System.out.println(board);
		  }
		  
	  }
	  
	  public void selectNos2() {
		  //1, 2, 6, 10, 15, 19, 24, 30, 33번에 속한 게시물 조회
		  
		  int[] nos = {1, 2, 6, 10, 15, 19, 24, 30, 33};
		  
		  BoardVO vo = new BoardVO();
		  vo.setNos(nos);
		  
//		  List<BoardVO> list = session.selectList("dao.BoardDao.selectNos", vo);
		  List<BoardVO> list = session.selectList("dao.BoardDao.selectNos2", nos);
		  for(BoardVO board : list) {
			  System.out.println(board);
		  }
		  
	  }
	  
	  void selectMap() {
		  // 제목 : mybatis 삽입, 작성자 : user
		  Map<String, String> map = new HashMap<>(); 
		  map.put("title", "mybatis 삽입");
		  map.put("writer", "user");
		  
		  List<BoardVO> list = session.selectList("dao.BoardDao.selectMap", map);
		  for(BoardVO board : list) {
			  System.out.println(board);
		  }
	  }
	 
	  void selectMap2() {
		  // 제목 : mybatis 삽입, 작성자 : user
		  
		  Map<String, Object> board = session.selectOne("dao.BoardDao.selectMap2", 37);
		  
		  Set<String> keys = board.keySet();
		  for(String key : keys) {
			  System.out.println(key + " : " + board.get(key));
		  }
	  }
	  
	public void work() {
		// insert();
		// select();
		// selectOne();
//		selectWhere();
//		selectWhere2();
//		selectNos();
//		selectNos2();
//		selectMap();
		selectMap2();
	}
}
