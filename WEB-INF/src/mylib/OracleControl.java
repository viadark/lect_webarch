// package mylib;

// import java.io.IOException;
// import java.io.PrintWriter;
// import javax.servlet.RequestDispatcher;
// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import dbhandle.*;
// import java.util.ArrayList;
// import dto.*;

// @WebServlet("/OracleControl")
// public class OracleControl extends HttpServlet 
// {
// 	private static final long serialVersionUID = 1L;
       
//     public OracleControl() {
//         super();
//         // TODO Auto-generated constructor stub
//     }

// 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// 		// TODO Auto-generated method stub
//         String ocommand = request.getParameter("ocommand");
//         String myview="";
//         StudentDAO std = new StudentDAO();
//         if( ocommand.equals("insertStudent")){
//             String myname = request.getParameter("myname");
//             String myage = request.getParameter("myage");
            
//             String result = std.insertData(myname, Integer.parseInt(myage) );
//             request.setAttribute("result", result);
//             myview ="18.insertview.jsp";
//         }else if(ocommand.equals("selectStudent")){
//             //
//             ArrayList<StudentDTO> arr=std.selectData();
//             request.setAttribute("stdArr", arr);
//             myview ="20.selectview.jsp";
//         }
        
//         RequestDispatcher rd = request.getRequestDispatcher(myview);
//         rd.forward(request, response);	
// 	}

    
// 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// 		// TODO Auto-generated method stub
// 		doGet(request, response);
// 	}
// }