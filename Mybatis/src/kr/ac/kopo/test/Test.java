package kr.ac.kopo.test;

import static org.junit.Assert.assertNotNull;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;

import kr.ac.kopo.MyConfig;
import kr.ac.kopo.dao.BoardDao;

public class Test {

	@Ignore
	@org.junit.Test
	public void myConfig테스트() throws Exception{
		
		MyConfig config = new MyConfig();
		SqlSession session = config.getInstance();
		
		assertNotNull(session);
	}
	
	@org.junit.Test
	public void BoardDao생성테스트() throws Exception {
		BoardDao dao = new BoardDao();
	}
}
