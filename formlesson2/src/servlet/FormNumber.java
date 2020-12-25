package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormNumber")
public class FormNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String n1=request.getParameter("num1");
		String n2=request.getParameter("num2");
		int num1=Integer.parseInt(n1);
		int num2=Integer.parseInt(n2);
		int sum=num1+num2;
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>計算結果</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+num1+"+"+num2+"="+sum+"</p>");
		out.println("<a href=\"/formlesson2/formNum.jsp\">戻る</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
