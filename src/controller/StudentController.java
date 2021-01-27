package controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;

import model.StudentModel;


public class StudentController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String mSV = req.getParameter("mSV");

		Student student = new Student();
		student.setmSV(mSV);
		req.setAttribute("mSV", mSV);

		StudentModel studentModel = new StudentModel();
		boolean status = studentModel.check(student);

		if (status) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("tkb_chitiet.jsp");
			dispatcher.forward(req, resp);

		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("tkb.jsp");
			dispatcher.forward(req, resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
