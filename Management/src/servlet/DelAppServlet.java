package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ApplicationService;

@WebServlet("/DeleteServlet")
public class DelAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DelAppServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取id
        String id = request.getParameter("id");
        //调用service删除
        ApplicationService service = new ApplicationService();
        Boolean result = service.delete(Integer.parseInt(id));
        //返回响应
        response.getWriter().write(result.toString());
	}

}
