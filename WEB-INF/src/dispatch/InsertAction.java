package dispatch;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import dbhandle.*;
import sun.util.calendar.BaseCalendar.Date;

public class InsertAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException
    {
        
        String name = request.getParameter("name");
        String quantity = request.getParameter("quantity");
        String d = request.getParameter("prod");
        
        // StudentDAO stdDAO = new StudentDAO();
        ProductionPoolDAO stdDAO = new ProductionPoolDAO();
        String result = stdDAO.insertData(name, Integer.parseInt(quantity), d);
        
        request.setAttribute("result",result);
        RequestDispatcher rd = request.getRequestDispatcher("test_recv.jsp");
		rd.forward(request, resp);	          
    }
}




