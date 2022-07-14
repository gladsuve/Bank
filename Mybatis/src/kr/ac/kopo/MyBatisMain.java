package kr.ac.kopo;

import kr.ac.kopo.dao.BoardDao;

public class MyBatisMain {

	public static void main(String[] args) {
		
		BoardDao dao = new BoardDao();
		dao.work();
		
	}
}
