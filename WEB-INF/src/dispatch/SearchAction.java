package dispatch;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import dbhandle.*;
import java.util.ArrayList;
import dto.*;

public class SearchAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException
    {
        ProductionPoolDAO proDAO = new ProductionPoolDAO();
        String name = request.getParameter("name");
        
        ArrayList<ProductionDTO> arr = proDAO.searchData( name );
        request.setAttribute( "stdArr", arr);
        RequestDispatcher rd = request.getRequestDispatcher("test_list.jsp");
		rd.forward(request, resp);	          
    }
}
