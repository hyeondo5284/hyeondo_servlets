package org.hyeondo.servlets.examples;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//데이터 만듦
		String name = "이현도";
		
		//데이터를 리퀘스트에 태운다
		request.setAttribute("name",  name);
		
		//jsp로 포워드한다
		request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request, response);
		
	}
}
