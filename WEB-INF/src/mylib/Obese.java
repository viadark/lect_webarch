package mylib;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Obese")
public class Obese extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public Obese() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        // PrintWriter out = response.getWriter();
        // out.print("<h1>Hello servlent</h1>");
        // out.flush();
        int weight = Integer.parseInt(request.getParameter("weight"));
        int height = Integer.parseInt(request.getParameter("height"));
        
        double normalWeight = (height - 100) * 0.85;
        double obese_meter = (weight / normalWeight) * 100;
        
        String obese_str = "";
        String image_path = "";
        
        if(obese_meter >= 120) {
            obese_str = "비만입니다";
            image_path = "obese.png";
        } else if(obese_meter >= 110) {
            obese_str = "과체중입니다";
            image_path = "over.png";
        } else if(obese_meter >= 90) {
            obese_str = "정상입니다";
            image_path = "normal.png";
        }
        else {
            obese_str = "저체중입니다";
            image_path = "under.png";
        }
        
        request.setAttribute("obese_str", obese_str);
        request.setAttribute("image_path", image_path);
        RequestDispatcher rd = request.getRequestDispatcher("ex.obese.jstl.jsp");
        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}