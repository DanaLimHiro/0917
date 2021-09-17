package ex5;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex5_Param
 */
@WebServlet("/Ex5")
public class Ex5_Param extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex5_Param() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 요청시 한글처리
		request.setCharacterEncoding("utf-8");
		
		// 요청한 곳으로 부터 파라미터 값 받기
		String[] f_name = request.getParameterValues("f_name");
		
		for(String n : f_name) {
			if(n != null && n.trim().length() > 0 && !n.isEmpty())
				System.out.println(n);
		}
		
		String loc = request.getParameter("loc");
		System.out.println("사는곳:"+loc);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
