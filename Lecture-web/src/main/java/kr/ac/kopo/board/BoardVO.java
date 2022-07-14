package kr.ac.kopo.board;

/**
 *  자바빈즈클래스 규칙
 *  1. 패키지 포함
 *  2. class 접근제한자 public
 *  3. 기본생성자 선언
 *  4. 멤버변수 접근제한자 private
 *  5. setter/getter 메소드 존재
 * 
 *
 */

public class BoardVO {
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private int no;
	private String title;
	
	public BoardVO() {
	}
}
