package setPassword;
import mail_OTP.forget_passwordBean;
import mail_OTP.sent_mail;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class newPasswordServlet
 */
public class newPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
//		sent_mail otp=new sent_mail();
		
		String email,password;
		int check_otp;
//		email = request.getParameter("email");
		password = request.getParameter("pass");
		check_otp = Integer.parseInt(request.getParameter("otp"));

		setPasswordBean bean = new setPasswordBean(password);
//		bean.setEmail(email);
		bean.setPassword(password); //to update the password in the DB 
				
		HttpSession session=request.getSession();
		forget_passwordBean user_bean = (forget_passwordBean) session.getAttribute("forget_passwordBean");
		
		setPasswordDAO dao =new setPasswordDAO();
		if(user_bean.getOtp() == check_otp)
		{
			try {
				dao.setpassword(bean,user_bean);
				response.sendRedirect("password_updated.jsp");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.print("Not Encrypted Successfully");
			}
		}
		else
		{
			response.sendRedirect("errorLogin.jsp");
		}
	}

}
