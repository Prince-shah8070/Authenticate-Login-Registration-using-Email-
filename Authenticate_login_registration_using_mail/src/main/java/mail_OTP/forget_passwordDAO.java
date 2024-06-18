package mail_OTP;
import prince.Connection.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class forget_passwordDAO {
	
	public boolean checkEmail(forget_passwordBean bean) 
	{
		String email = bean.getEmail();
//		String password = bean.getPassword();
		try
		{
			Connection con = connection.getCon();
			PreparedStatement psmt = con.prepareStatement("Select * from details where Email = ?");
			psmt.setString(1, email);
			ResultSet rs=psmt.executeQuery();
			 // Check if the result set is empty
			if(!rs.isBeforeFirst()) //isBeforeFirst() function return true if the curse is before the first record
			{
			    // The result set is empty, so return false
				return false;
			}
			else
				return true;

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
