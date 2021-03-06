package kr.ac.kopo.board.service;

import java.util.List;

import kr.ac.kopo.board.dao.BoardDao;
import kr.ac.kopo.board.vo.BoardVO;

public class BoardService {
	
	private BoardDao boardDao;
	
	public BoardService(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

	public List<BoardVO> selectAllBoard() {
		List<BoardVO> boardList = boardDao.selectAll();
		return boardList;
	}
	
	public void addBoard(BoardVO board) {
		
		int no = boardDao.selectBoardNo();
		board.setNo(no);
		boardDao.insertBoard(board);
	}

	public BoardVO selectByNo(int no) {
		
		return boardDao.selectByNo(no);
	}

}
