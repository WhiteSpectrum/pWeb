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
		//Processamento do back-and
		
		Date data = new Date();
		
		//Armazenar valores necessarios para jsp
		
		req.setAttribute("datahora", data);
		
		req.getRequestDispatcher("dataHoraCerta.jsp").forward(req, resp);
	}
}
