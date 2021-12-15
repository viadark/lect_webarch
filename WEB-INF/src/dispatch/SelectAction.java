package dispatch;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.util.ArrayList;
import dbhandle.*;
import dto.*;
public class SelectAction implements Action 
{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException
    {
        ProductionPoolDAO stdDAO = new ProductionPoolDAO();
        
        ArrayList<ProductionDTO> arr = stdDAO.selectData();
        
        request.setAttribute( "stdArr", arr);
        RequestDispatcher rd = request.getRequestDispatcher("test_list.jsp");
		rd.forward(request, resp);
    }
}





