package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest13294")
public class BenchmarkTest13294 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String param = request.getQueryString();

		String bar = new Test().doSomething(param);
		
		// javax.servlet.http.HttpSession.setAttribute(java.lang.String^,java.lang.Object)
		request.getSession().setAttribute( bar, "foo");
	}  // end doPost

    private class Test {

        public String doSomething(String param) throws ServletException, IOException {

		// Chain a bunch of propagators in sequence
		String a35076 = param; //assign
		StringBuilder b35076 = new StringBuilder(a35076);  // stick in stringbuilder
		b35076.append(" SafeStuff"); // append some safe content
		b35076.replace(b35076.length()-"Chars".length(),b35076.length(),"Chars"); //replace some of the end content
		java.util.HashMap<String,Object> map35076 = new java.util.HashMap<String,Object>();
		map35076.put("key35076", b35076.toString()); // put in a collection
		String c35076 = (String)map35076.get("key35076"); // get it back out
		String d35076 = c35076.substring(0,c35076.length()-1); // extract most of it
		String e35076 = new String( new sun.misc.BASE64Decoder().decodeBuffer( 
		    new sun.misc.BASE64Encoder().encode( d35076.getBytes() ) )); // B64 encode and decode it
		String f35076 = e35076.split(" ")[0]; // split it on a space
		org.owasp.webgoat.benchmark.helpers.ThingInterface thing = org.owasp.webgoat.benchmark.helpers.ThingFactory.createThing();
		String bar = thing.doSomething(f35076); // reflection

            return bar;
        }
    } // end innerclass Test

} // end DataflowThruInnerClass