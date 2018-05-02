
package cn.waggag.servlet;

import cn.waggag.server.Request;
import cn.waggag.server.Response;

public class RegisterServlet extends Servlet {

	@Override
	public void doGet(Request req, Response rep) throws Exception {
		
		rep.println("<html><head><title返回注册</title>");
		rep.println("</head><body>");
		rep.println("你的用户名："+req.getParameter("uname"));
		rep.println("</body></html>");
	}

	@Override
	public void doPost(Request req, Response rep) throws Exception {
	}

}