//this servlet class basically use to process the HTTP request 
//send by user from logi page
package prince.signupPage;
import Encrypt_decrypt_password.protect;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pranjal laptop
 */
//@WebServlet(name = "signupServlet", urlPatterns = {"/signupServlet"})
public class signupServlet extends HttpServlet {
    
        private signupDAO signupdao;
        
        public void init()
        {
            signupdao = new signupDAO();
        }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String name,email,password;
        
        name = request.getParameter("name");
        email = request.getParameter("email");
        password = request.getParameter("password1");
        
        //putting these data into the bean class daa memeber 
        signupBean bean=new signupBean();
        bean.setName(name);
        bean.setEmail(email);
        
        protect p =new protect();
        String key = null;
            try {
                key = p.encrypt(password);
            } catch (Exception ex) {
                Logger.getLogger(signupServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
//            System.out.print("key: "+key);
        bean.setPassword(key);
                
            try {
                if(signupdao.validate(bean))
                {
                    response.sendRedirect("errorSignup.jsp");
                }
                else
                {
                	if(signupdao.insert(bean))
                         response.sendRedirect("loginSuccess.jsp");
                	else
                		response.sendRedirect("errorSignup.jsp");
                }   } catch (ClassNotFoundException ex) {
                Logger.getLogger(signupServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
