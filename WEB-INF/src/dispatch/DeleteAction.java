package dispatch;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import dbhandle.*;

public class DeleteAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException
    {
        ProductionPoolDAO proDAO = new ProductionPoolDAO();
        String name = request.getParameter("name");
        
        String result = proDAO.deleteData( name );
        
        request.setAttribute("result",result);
        RequestDispatcher rd = request.getRequestDispatcher("test_recv.jsp");
		rd.forward(request, resp);	          
    }
}




