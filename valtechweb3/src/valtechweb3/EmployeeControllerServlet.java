package valtechweb3;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.valtech.dao.Employeees;
import com.valtech.dao.EmployeeeDAO;


@WebServlet(urlPatterns = {"/empCtlr"})
public class EmployeeControllerServlet extends HttpServlet {
	
	private EmployeeeDAO dao;
	
	@Override
	public void init() throws ServletException {
		dao = new EmployeeeDAO();
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String submit = req.getParameter("submit");
		try {
			if("New Employee".equals(submit)) {
				req.getRequestDispatcher("CreateEmployee2.jsp").forward(req, resp);
				return;
			}
			
			if ("Update".equals(submit)) {
				Employeees e = new Employeees();
				e.setId(dao.getNextValidID());
				e.setName(req.getParameter("name"));
				e.setAge(Integer.parseInt(req.getParameter("age")));
				e.setGender(Integer.parseInt(req.getParameter("gender")));
				e.setSalary(Integer.parseInt(req.getParameter("salary")));
				dao.saveEmployee(e);	
			}
			
			if ("Save".equals(submit)) {
				Employeees e = new Employeees();
				e.setId(dao.getNextValidID());
				e.setName(req.getParameter("name"));
				e.setAge(Integer.parseInt(req.getParameter("age")));
				e.setGender(Integer.parseInt(req.getParameter("gender")));
				e.setSalary(Integer.parseInt(req.getParameter("salary")));
				dao.saveEmployee(e);
				
			} else {
				
			}
			req.setAttribute("emps", dao.getEmployees());
			req.getRequestDispatcher("Emps.jsp").forward(req, resp);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//write the logic here and fwd to jsp page
        try {
        	String empId = req.getParameter("ID");
        	String submit = req.getParameter("submit");
		if (empId == null) {
			loadEmpsAndGotoEmpsPage(req, resp);
			return;
		}
		int id = Integer.parseInt(req.getParameter("ID"));
		if("delete".equals(submit)) {
    		dao.deleteEmployee(id);
    		loadEmpsAndGotoEmpsPage(req, resp);
			return;
    	}
		Employeees e = dao.getEmployee(id);
		req.setAttribute("e", e);
		req.getRequestDispatcher("emp.jsp").forward(req, resp);
		}
		catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	private void loadEmpsAndGotoEmpsPage(HttpServletRequest req, HttpServletResponse resp)
			throws Exception, ServletException, IOException {
		List<Employeees> employees = dao.getEmployees();
		req.setAttribute("emps", employees);
		req.getRequestDispatcher("Emps.jsp").forward(req, resp);
	}
}