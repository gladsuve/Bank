<%@page import="kr.ac.kopo.board.vo.BoardFileVO"%>
<%@page import="java.io.File"%>
<%@page import="java.util.Enumeration"%>
<%@page import="kr.ac.kopo.util.KopoFileNamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="kr.ac.kopo.board.vo.BoardVO"%>
<%@page import="kr.ac.kopo.board.dao.BoardDao"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="kr.ac.kopo.util.ConnectionFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 /*
 	작업순서
 	1. 파라미터 추출(제목, 작성자, 내용)
 	2. t_board 테이블에 새로운 게시글 삽입
 	3. 클라이언트에게 결과 전송
 	
 
 */
 	
 
 	request.setCharacterEncoding("utf-8");
 
 	String saveFolder = "D:/Lecture/web-workspace/Mission-web/src/main/webapp/upload";
 
 	MultipartRequest multi = new MultipartRequest(
 								request,
 								saveFolder,
 								1024*1024*3,
 								"utf-8",
 								new KopoFileNamePolicy()
 							);
 	
 	
 	String title = multi.getParameter("title");
 	String writer = multi.getParameter("writer");
 	String content = multi.getParameter("content");
 	
 	BoardVO board = new BoardVO();
 	board.setTitle(title);
 	board.setWriter(writer);
 	board.setContent(content);
 	
//  	System.out.println(board);
 	
 	BoardDao dao = new BoardDao();
 	int boardNo = dao.selectBoardNo();
 	board.setNo(boardNo);
 	
 	dao.insertBoard(board);
 		
	Enumeration<String> files = multi.getFileNames();
	
	while(files.hasMoreElements()) {
		String fileName = files.nextElement();
// 		System.out.println(fileName);
		File f = multi.getFile(fileName);
		if(f != null) {
			String fileOriName = multi.getOriginalFileName(fileName);
			String fileSaveName = multi.getFilesystemName(fileName);
			int fileSize = (int)f.length();
			
			BoardFileVO fileVO = new BoardFileVO();
			fileVO.setFileOriName(fileOriName);
			fileVO.setFileSaveName(fileSaveName);
			fileVO.setFileSize(fileSize);
			fileVO.setBoardNo(boardNo);
		
			
			dao.insertBoardFile(fileVO);
		}


/* File f = multi.getFile(fileName);
		if(f != null) {
			multi.getOriginalFileName(fileName);
			multi.getFilesystemName(fileName);
		} */
		
	}
 			
 	
/*  	String title = request.getParameter("title");
 	String writer = request.getParameter("writer");
 	String content = request.getParameter("content");
 	 */
 	
 	/* System.out.println("title : " + title);
 	System.out.println("writer : " + writer);
 	System.out.println("content : " + content);
 	 */
 	 
/*  	BoardVO board = new BoardVO();
 	board.setTitle(title);
 	board.setWriter(writer);
 	board.setContent(content);
 	
 	BoardDao dao = new BoardDao(); */
 /* 	dao.insertBoard(board); */
 	
 	/* Connection conn = new ConnectionFactory().getConnection(); */
 	
 	/* StringBuilder sql = new StringBuilder();
 	sql.append("insert into t_board(no, title, writer, content) ");
 	sql.append("values(seq_t_board_no.nextval, ?, ?, ?) ");
 	
 	PreparedStatement pstmt = conn.prepareStatement(sql.toString()); */
 	
/*  	pstmt.setString(1, title);
 	pstmt.setString(2, writer);
 	pstmt.setString(3, content);

 	
 	pstmt.executeUpdate(); */
 	
 %>
 
<script>
	alert('새글 등록 완료!')
	location.href = 'list.jsp'
</script>
 	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>