

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DaoOperationServlet")
public class DaoOperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		response.getWriter().append(name);
		StudentDao stobj=new StudentDaoImp();//overriding
		ArrayList<StudentBean> students=null;
		try {
			students = stobj.getAllStudent();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		students.forEach(st->{
			System.out.println("username : "+st.getUsername()+" And Password :"+st.getPassword());
		});
	}
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		dopost(req,resp);
//	}
}
