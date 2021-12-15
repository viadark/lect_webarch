package mylib;

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

@WebServlet("/testinput")
public class TestInput extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public TestInput() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        
        ProductionPoolDAO p = new ProductionPoolDAO();

        String name = request.getParameter("name");
        String quantity = request.getParameter("quantity");
        String prod = request.getParameter("prod");
        
        String result = p.insertData(name, Integer.parseInt(quantity), prod);
        String myview ="test_main.html";
        RequestDispatcher rd = request.getRequestDispatcher(myview);
        rd.forward(request, response);	
	}

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}