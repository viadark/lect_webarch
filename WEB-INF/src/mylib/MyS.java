package mylib;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyS")
public class MyS extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public MyS() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        // PrintWriter out = response.getWriter();
        // out.print("<h1>Hello servlent</h1>");
        // out.flush();
        String myname = request.getParameter("myname");
        String myage = request.getParameter("myage");
        request.setAttribute("k1", myname);
        request.setAttribute("k2", myage);
        RequestDispatcher rd = request.getRequestDispatcher("13.jstl.jsp");
        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}