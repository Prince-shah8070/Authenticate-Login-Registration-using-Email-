package mail_OTP;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class uyy
 */
public class forget_passwordServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
		String email;
		email = request.getParameter("email");
		
		sent_mail otp=new sent_mail();
		
		forget_passwordBean bean = new forget_passwordBean(email,otp.getRandom()); // generate otp for email and same otp will be used for verification
		
		forget_passwordDAO dao = new forget_passwordDAO();
		sent_mail mail = new sent_mail();
		try
		{
			if(dao.checkEmail(bean)) // if the user is already there then a otp will sent to their email id
			{
				HttpSession session = request.getSession(); // to store the user data at server side
				session.setAttribute("forget_passwordBean", bean);
				
				mail.sent_mail(bean);
//				System.out.print(email+" "+bean.getOtp());
				response.sendRedirect("setPassword.jsp");
			}
			else
			{
				response.sendRedirect("errorLogin.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
