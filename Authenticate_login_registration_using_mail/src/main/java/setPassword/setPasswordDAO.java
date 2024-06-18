package setPassword;

import Encrypt_decrypt_password.protect;
import mail_OTP.forget_passwordBean;

import java.sql.Connection;
import java.sql.PreparedStatement;


import prince.Connection.connection;

public class setPasswordDAO {
	protect encrypt =new protect();
	public void setpassword(setPasswordBean bean,forget_passwordBean user_bean) throws Exception
	{
		String email = user_bean.getEmail();

		String password=encrypt.encrypt(bean.getPassword());
		try {
			Connection con=connection.getCon();
			PreparedStatement psmt = con.prepareStatement("Update details set Password = ? where Email = ?");
			psmt.setString(1, password);
			psmt.setString(2, email);
			int a = psmt.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
