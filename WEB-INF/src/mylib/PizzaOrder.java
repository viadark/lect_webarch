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

@WebServlet("/PizzaOrder")
public class PizzaOrder extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public PizzaOrder() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        String ocommand = request.getParameter("ocommand");
        String myview="";
        PizzaDAO std = new PizzaDAO();

        String name = request.getParameter("name");
        String telno = request.getParameter("telno");
        String email = request.getParameter("email");
        String pizza_size = request.getParameter("size");
        String toppingarr[] = request.getParameterValues("topping");
        String order_time = request.getParameter("time");
        String req = request.getParameter("req");
        
        String topping = "";
        for(String item : toppingarr) {
            topping += item + " ";
        }

        String result = std.insertData(name, telno, email, pizza_size, topping, order_time, req);
        request.setAttribute("result", result);
        myview ="day2ex_order_complete.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(myview);
        rd.forward(request, response);	
	}

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}