package web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import synalp.parsing.ParseResult;
import synalp.parsing.Inputs.Sentence;
import synalp.parsing.ParserMain;
import synalp.parsing.dummy.DummyGenerator;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(description = "Simple Demo to call generate method", urlPatterns = { "/generatorservlet" })
public class GeneratorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DummyGenerator dummyGenerator;

	
	
    public GeneratorServlet() {
		super();
	}
    

	public void init() {
        dummyGenerator = new DummyGenerator();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("generatebutton") != null) {
			request.setAttribute("generationResult",dummyGenerator.getText());
			request.getRequestDispatcher("test.jsp").forward(request, response); 
		}
	}

}
