package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.Application;
import service.ApplicationService;

@WebServlet("/QueAppServlet")
public class QueAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public QueAppServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//获取id
        String id = request.getParameter("id");
        //调用Service查询
        ApplicationService as = new ApplicationService();
        List<Application> list = as.query(Integer.parseInt(id));
    	//将结果存入request
        request.setAttribute("list",list);
        //响应并转发
        request.getRequestDispatcher("/update.jsp").forward(request,response);
	}

}
