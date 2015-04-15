package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest05558")
public class BenchmarkTest05558 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String[] values = request.getParameterValues("foo");
		String param;
		if (values.length != 0)
		  param = request.getParameterValues("foo")[0];
		else param = null;
		
		
		String bar = "safe!";
		java.util.HashMap<String,Object> map31255 = new java.util.HashMap<String,Object>();
		map31255.put("keyA-31255", "a_Value"); // put some stuff in the collection
		map31255.put("keyB-31255", param.toString()); // put it in a collection
		map31255.put("keyC", "another_Value"); // put some stuff in the collection
		bar = (String)map31255.get("keyB-31255"); // get it back out
		bar = (String)map31255.get("keyA-31255"); // get safe value back out
		
		
		response.getWriter().print(bar.toCharArray());
	}
}