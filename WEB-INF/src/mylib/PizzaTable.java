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

@WebServlet("/PizzaTable")
public class PizzaTable extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public PizzaTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        String myview="";
        PizzaDAO pizza = new PizzaDAO();
        ArrayList<PizzaDTO> arr=pizza.selectData();
        request.setAttribute("stdArr", arr);
        myview ="day2ex_pizza_table.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(myview);
        rd.forward(request, response);	
	}

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}