package dispatch;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dbhandle.*;
import java.util.ArrayList;
import dto.*;

@WebServlet("/ProductionController")
public class ProductionController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public ProductionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        String ocom = request.getParameter("ocommand");
        //Action action = new InsertAction();
        // Action action = new SelectAction();
        Action action = ProductionFactory.route( ocom );
        action.execute(request,response);
	}

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}