package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LiuTingDao;
import daoimpl.LiuTingDaoImpl;
import service.LiuTingService;
import service.impl.LiuTingServiceImpl;

/**
 * Servlet implementation class ShanChuServlet
 */
@WebServlet("/ShanChuServlet")
public class ShanChuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LiuTingService liutingdao =new LiuTingServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShanChuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id=Integer.valueOf(request.getParameter("id"));
		liutingdao.shanchu(id);
		response.sendRedirect("ChaXunServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
