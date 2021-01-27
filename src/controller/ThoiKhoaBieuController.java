package controller;

import java.io.IOException;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;
import bean.ThoiKhoaBieu;

import model.ThoiKhoaBieuDAO;

public class ThoiKhoaBieuController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ThoiKhoaBieuDAO tkbDAO;

	public void init() {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");

		tkbDAO = new ThoiKhoaBieuDAO(jdbcURL, jdbcUsername, jdbcPassword);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getServletPath();

		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("utf-8");

		try {
			listTKB(req, resp);
			getStudent(req, resp);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void listTKB(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		List<ThoiKhoaBieu> list = tkbDAO.findAll();
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("tkb_chitiet.jsp");
		dispatcher.forward(request, response);
	}
	
	private void getStudent(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		List<Student> listStudent = tkbDAO.getAll();
		request.setAttribute("listStudent", listStudent);
		RequestDispatcher dispatcher = request.getRequestDispatcher("tkb_chitiet.jsp");
		dispatcher.forward(request, response);
	}
	
}
