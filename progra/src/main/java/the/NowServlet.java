package the;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/now")
public class NowServlet extends HttpServlet{

	private static final long serialVersionUID = -2222897905094571402L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String date = new Date().toString();
		
		String html = "<html><body><h1> Current Time: " + date + "</h1></body></html>";
		
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().print(html);
	}
}
