package kr.ac.kopo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TransferController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		String acc = request.getParameter("account_number");
		
		request.setAttribute("account_number", acc);
		
		
		
		
		return "/jsp/account/transfer.jsp";
		
		
	}

}
