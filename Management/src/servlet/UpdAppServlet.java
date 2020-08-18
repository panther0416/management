package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.Application;
import service.ApplicationService;

@WebServlet("/UpdAppServlet")
public class UpdAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdAppServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//获取参数
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String version = request.getParameter("version");
		String type = request.getParameter("type");
		String project = request.getParameter("project");
		String bussinessCategory = request.getParameter("bussinessCategory");
		String bussinessType = request.getParameter("bussinessType");
		String runningMode = request.getParameter("runningMode");
		String environment = request.getParameter("environment");
		String loadMode = request.getParameter("loadMode");
		String location = request.getParameter("location");
		
        Application bean = new Application(id, name, version, type, project, bussinessCategory, 
        		bussinessType, runningMode, environment, loadMode, location);
        //调用Service修改
        ApplicationService service = new ApplicationService();
        Boolean result = service.update(bean);
        request.setAttribute("result", result);
        //跳转回主页
        response.sendRedirect(request.getContextPath()+"/ApplicationServlet");
	}

}
